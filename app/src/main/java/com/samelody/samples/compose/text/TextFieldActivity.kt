package com.samelody.samples.compose.text

import android.os.Bundle
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.text.KeyboardActions
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Clear
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material.icons.filled.Info
import androidx.compose.runtime.*
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.semantics.error
import androidx.compose.ui.semantics.semantics
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.text.input.KeyboardCapitalization
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.samelody.samples.compose.base.BaseActivity
import com.samelody.samples.compose.base.ExamplePadding
import com.samelody.samples.compose.base.VExample
import com.samelody.samples.compose.base.shortToast
import com.samelody.samples.compose.theme.AppTheme

class TextFieldActivity : BaseActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent { AppTheme { ContentView() } }
    }
}

@Composable
private fun ContentView() {
    Column(
        Modifier
            .fillMaxSize()
            .padding(horizontal = ExamplePadding)
            .verticalScroll(rememberScrollState())
    ) {
        VExample("Filled text field")
        SimpleTextField()
        VExample("Outlined text field")
        SimpleOutlinedTextField()
        VExample("Styling TextField")
        StyledTextField()
        VExample("Keyboard options and VisualTransformation")
        PasswordTextField()
        VExample("Keyboard capitalization")
        CapitalizationTextField()
        VExample("Keyboard actions")
        ImeActionTextField()
        VExample("Error text field")
        TextFieldWithErrorState()
        VExample("Read-only text field")
        ReadOnlyTextField()
        VExample("disabled text field")
        DisabledTextField()
        VExample("Text field with placeholder")
        TextFieldWithPlaceholder()
        VExample("Text field with icons")
        TextFieldWithIcons()
        VExample("Text field with helper message")
        TextFieldWithHelperMessage()
        VExample("Text field with clear icon")
        ClearTextField()
        Spacer(Modifier.height(500.dp))
    }
}

@Composable
@Preview(showBackground = true)
private fun ClearTextField() {
    var text by rememberSaveable { mutableStateOf("") }
    TextField(
        text,
        onValueChange = { text = it },
        placeholder = { Text("Placeholder") },
        trailingIcon = {
            IconButton(onClick = {
                text = ""
            }) {
                Icon(Icons.Filled.Clear, contentDescription = "Clear all")
            }
       },
        modifier = Modifier.fillMaxWidth()
    )
}

@Composable
@Preview(showBackground = true)
private fun TextFieldWithHelperMessage() {
    var text by rememberSaveable { mutableStateOf("") }
    Column {
        TextField(
            text,
            onValueChange = { text = it },
            label = { Text("Label") },
            modifier = Modifier.fillMaxWidth()
        )
        Text(
            "Helper message",
            color = MaterialTheme.colors.onSurface.copy(ContentAlpha.medium),
            style = MaterialTheme.typography.caption,
            modifier = Modifier.padding(start = 12.dp)
        )
    }
}

@Composable
@Preview(showBackground = true)
private fun TextFieldWithIcons() {
    var text by rememberSaveable { mutableStateOf("") }
    TextField(
        text,
        onValueChange = { text = it },
        placeholder = { Text("Placeholder") },
        leadingIcon = { Icon(Icons.Filled.Favorite, contentDescription = "Localized description") },
        trailingIcon = { Icon(Icons.Filled.Info, contentDescription = "Localized description") },
        modifier = Modifier.fillMaxWidth()
    )
}

@Composable
@Preview(showBackground = true)
private fun TextFieldWithPlaceholder() {
    var text by rememberSaveable { mutableStateOf("") }
    TextField(
        text,
        onValueChange = { text = it },
        label = { Text("Email") },
        placeholder = { Text("example@gmail.com") },
        modifier = Modifier.fillMaxWidth()
    )
}

@Composable
@Preview(showBackground = true)
private fun DisabledTextField() {
    var text: String by remember { mutableStateOf("Can not modifying") }
    TextField(
        value = text,
        onValueChange = { text = it },
        label = { Text("Disabled") },
        enabled = false,
        modifier = Modifier.fillMaxWidth()
    )
}

@Composable
@Preview(showBackground = true)
private fun ReadOnlyTextField() {
    var text: String by remember { mutableStateOf("Can not modifying") }
    TextField(
        value = text,
        onValueChange = { text = it },
        label = { Text("Read only") },
        readOnly = true,
        modifier = Modifier.fillMaxWidth()
    )
}

@Composable
@Preview(showBackground = true)
private fun TextFieldWithErrorState() {
    var text by rememberSaveable { mutableStateOf("") }
    var isError by rememberSaveable { mutableStateOf(false) }

    fun validate(text: String) {
        isError = text.count() < 5
    }

    TextField(
        value = text,
        onValueChange = {
            text = it
            isError = false
        },
        singleLine = true,
        label = { Text(if (isError) "Email*" else "Email") },
        isError = isError,
        keyboardActions = KeyboardActions { validate(text) },
        modifier = Modifier
            .fillMaxWidth()
            .semantics {
                if (isError) error("Email format is invalid.")
            }
    )
}

@Composable
@Preview(showBackground = true)
private fun SimpleTextField() {
    var text: String by remember { mutableStateOf("Hello") }
    TextField(
        value = text,
        onValueChange = { text = it },
        label = { Text("Label") },
        modifier = Modifier.fillMaxWidth()
    )
}

@Composable
@Preview(showBackground = true)
private fun SimpleOutlinedTextField() {
    var text: String by remember { mutableStateOf("") }
    OutlinedTextField(
        value = text,
        onValueChange = { text = it },
        label = { Text("Label") },
        modifier = Modifier.fillMaxWidth()
    )
}

@Composable
@Preview(showBackground = true)
private fun StyledTextField() {
    var text by remember { mutableStateOf("Hello\nworld\ninvisible") }
    TextField(
        value = text,
        onValueChange = { text = it },
        label = { Text("Label") },
        maxLines = 2,
        textStyle = TextStyle(Color.Blue, fontWeight = FontWeight.Bold),
        modifier = Modifier
            .padding(20.dp)
            .fillMaxWidth()
    )
}

@Composable
@Preview(showBackground = true)
private fun PasswordTextField() {
    var password by rememberSaveable { mutableStateOf("") }
    TextField(
        password,
        onValueChange = { password = it },
        label = { Text("Enter password") },
        visualTransformation = PasswordVisualTransformation(),
        keyboardOptions = KeyboardOptions(
            keyboardType = KeyboardType.Password
        ),
        modifier = Modifier.fillMaxWidth()
    )
}

@Composable
@Preview(showBackground = true)
private fun CapitalizationTextField() {
    var text1 by remember { mutableStateOf("") }
    var text2 by remember { mutableStateOf("") }
    var text3 by remember { mutableStateOf("") }
    Column(
        verticalArrangement = Arrangement.spacedBy(6.dp)
    ) {
        TextField(
            text1,
            onValueChange = { text1 = it },
            label = { Text("Characters") },
            keyboardOptions = KeyboardOptions(
                capitalization = KeyboardCapitalization.Characters
            ),
            modifier = Modifier.fillMaxWidth()
        )
        TextField(
            text2,
            onValueChange = { text2 = it },
            label = { Text("Words") },
            keyboardOptions = KeyboardOptions(
                capitalization = KeyboardCapitalization.Words
            ),
            modifier = Modifier.fillMaxWidth()
        )
        TextField(
            text3,
            onValueChange = { text3 = it },
            label = { Text("Sentences") },
            keyboardOptions = KeyboardOptions(
                capitalization = KeyboardCapitalization.Sentences
            ),
            modifier = Modifier.fillMaxWidth()
        )
    }
}

@Composable
@Preview(showBackground = true)
private fun ImeActionTextField() {
    var text1 by remember { mutableStateOf("") }
    var text2 by remember { mutableStateOf("") }
    var text3 by remember { mutableStateOf("") }
    val context = LocalContext.current

    Column(
        verticalArrangement = Arrangement.spacedBy(6.dp)
    ) {
        TextField(
            text1,
            onValueChange = { text1 = it },
            label = { Text("Go") },
            keyboardOptions = KeyboardOptions(
                imeAction = ImeAction.Go
            ),
            keyboardActions = KeyboardActions(
                onGo = {
                    shortToast(context, "The Go clicked")
                }
            ),
            modifier = Modifier.fillMaxWidth()
        )
        TextField(
            text2,
            onValueChange = { text2 = it },
            label = { Text("Search") },
            keyboardOptions = KeyboardOptions(
                imeAction = ImeAction.Search
            ),
            keyboardActions = KeyboardActions(
                onSearch = {
                    shortToast(context, "The Search clicked")
                }
            ),
            modifier = Modifier.fillMaxWidth()
        )
        TextField(
            text3,
            onValueChange = { text3 = it },
            label = { Text("Send") },
            keyboardOptions = KeyboardOptions(
                imeAction = ImeAction.Send
            ),
            keyboardActions = KeyboardActions(
                onSend = {
                    shortToast(context, "The Send clicked")
                }
            ),
            modifier = Modifier.fillMaxWidth()
        )
    }
}