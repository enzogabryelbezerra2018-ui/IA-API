/** Copyright (C) Enzo 2025-2026 */
/** Copyright (C) Enzo inc. 2025-2026 */
/** Copyright (C) Enzo LLC 2025-2026 */
/** Copyright (C) 2025–2026 Enzo. */
/** Todos os direitos reservados. */
/**                               */
/** Este código é propriedade exclusiva do autor. */
/** É proibida a cópia, redistribuição, modificação ou uso comercial */
/** sem permissão expressa por escrito. */
package com.enzo.util.oficial.app.ia.data.base
import com.enzo.util.*
import kotlin.Byte
import kotlin.Short
import kotlin.Int
import kotlin.Long
import kotlin.Float
import kotlin.Double
import kotlin.Boolean
import kotlin.Char
import kotlin.String
import kotlin.Number

import kotlin.collections.List
import kotlin.collections.MutableList
import kotlin.collections.ArrayList
import kotlin.collections.Set
import kotlin.collections.MutableSet
import kotlin.collections.HashSet
import kotlin.collections.Map
import kotlin.collections.MutableMap
import kotlin.collections.HashMap
import kotlin.collections.sortedSetOf
import kotlin.collections.sortedMapOf
import kotlin.collections.arrayListOf
import kotlin.collections.hashMapOf
import kotlin.collections.hashSetOf
import kotlin.collections.listOf
import kotlin.collections.mutableListOf
import kotlin.collections.mapOf
import kotlin.collections.mutableMapOf
import kotlin.collections.setOf
import kotlin.collections.mutableSetOf

import kotlin.ranges.IntRange
import kotlin.ranges.LongRange
import kotlin.ranges.CharRange
import kotlin.ranges.ClosedRange
import kotlin.ranges.until
import kotlin.ranges.downTo
import kotlin.ranges.step

import kotlin.apply
import kotlin.also
import kotlin.let
import kotlin.run
import kotlin.with
import kotlin.repeat

import kotlin.math.abs
import kotlin.math.sqrt
import kotlin.math.pow
import kotlin.math.floor
import kotlin.math.ceil
import kotlin.math.round
import kotlin.math.max
import kotlin.math.min
import kotlin.math.sin
import kotlin.math.cos
import kotlin.math.tan
import kotlin.math.log
import kotlin.math.exp

import kotlin.reflect.KClass
import kotlin.reflect.full.memberFunctions
import kotlin.reflect.full.memberProperties
import kotlin.reflect.full.primaryConstructor
import kotlin.reflect.full.createInstance

import kotlin.io.readLine
import kotlin.io.println
import kotlin.io.readBytes
import kotlin.io.readText

import kotlin.text.Regex
import kotlin.text.RegexOption
import kotlin.text.contains
import kotlin.text.replace
import kotlin.text.find
import kotlin.text.split

import kotlin.annotation.Target
import kotlin.annotation.Retention
import kotlin.annotation.AnnotationTarget
import kotlin.annotation.AnnotationRetention
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.Job
import kotlinx.coroutines.SupervisorJob
import kotlinx.coroutines.CancellationException
import kotlinx.coroutines.CoroutineExceptionHandler
import kotlinx.coroutines.CoroutineName
import kotlinx.coroutines.CoroutineStart
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.async
import kotlinx.coroutines.awaitAll
import kotlinx.coroutines.cancel
import kotlinx.coroutines.cancelChildren
import kotlinx.coroutines.ensureActive
import kotlinx.coroutines.isActive
import kotlinx.coroutines.runBlocking
import kotlinx.coroutines.withContext
import kotlinx.coroutines.withTimeout
import kotlinx.coroutines.withTimeoutOrNull
import kotlinx.coroutines.yield

import kotlinx.coroutines.channels.Channel
import kotlinx.coroutines.channels.ReceiveChannel
import kotlinx.coroutines.channels.SendChannel
import kotlinx.coroutines.channels.consumeEach
import kotlinx.coroutines.channels.ChannelIterator

import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.MutableSharedFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.SharedFlow
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.flow.flowOf
import kotlinx.coroutines.flow.asFlow
import kotlinx.coroutines.flow.collect
import kotlinx.coroutines.flow.collectLatest
import kotlinx.coroutines.flow.distinctUntilChanged
import kotlinx.coroutines.flow.filter
import kotlinx.coroutines.flow.first
import kotlinx.coroutines.flow.flatMapConcat
import kotlinx.coroutines.flow.flatMapLatest
import kotlinx.coroutines.flow.map
import kotlinx.coroutines.flow.merge
import kotlinx.coroutines.flow.onEach
import kotlinx.coroutines.flow.onStart
import kotlinx.coroutines.flow.onCompletion
import kotlinx.coroutines.flow.reduce
import kotlinx.coroutines.flow.scan
import kotlinx.coroutines.flow.single

import kotlinx.coroutines.sync.Mutex
import kotlinx.coroutines.sync.Semaphore
import kotlinx.coroutines.sync.withLock

import kotlinx.coroutines.selects.select

import kotlinx.coroutines.time.delay as timeDelay
import kotlinx.coroutines.withContext as coroutineWithContext
import kotlinx.serialization.Serializable
import kotlinx.serialization.SerialName
import kotlinx.serialization.SerialId
import kotlinx.serialization.Transient
import kotlinx.serialization.KSerializer
import kotlinx.serialization.Serializer
import kotlinx.serialization.builtins.ListSerializer
import kotlinx.serialization.builtins.MapSerializer
import kotlinx.serialization.builtins.SetSerializer
import kotlinx.serialization.json.Json
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.JsonArray
import kotlinx.serialization.json.JsonPrimitive
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.buildJsonArray
import kotlinx.serialization.json.decodeFromJsonElement
import kotlinx.serialization.json.encodeToJsonElement
import kotlinx.serialization.decodeFromString
import kotlinx.serialization.encodeToString

import kotlinx.datetime.Clock
import kotlinx.datetime.Instant
import kotlinx.datetime.LocalDate
import kotlinx.datetime.LocalDateTime
import kotlinx.datetime.LocalTime
import kotlinx.datetime.TimeZone
import kotlinx.datetime.toInstant
import kotlinx.datetime.toLocalDateTime
import kotlinx.datetime.todayIn

import kotlinx.atomicfu.atomic
import kotlinx.atomicfu.AtomicBoolean
import kotlinx.atomicfu.AtomicInt
import kotlinx.atomicfu.AtomicLong
import kotlinx.atomicfu.AtomicRef
import kotlinx.atomicfu.update
import kotlinx.atomicfu.getAndSet
import kotlinx.atomicfu.getAndIncrement
import kotlinx.atomicfu.getAndDecrement
import android.app.Activity
import android.app.Service
import android.app.Application
import android.app.PendingIntent
import android.app.Notification
import android.app.NotificationChannel
import android.app.NotificationManager
import android.app.AlertDialog
import android.app.Dialog

import android.os.Bundle
import android.os.Build
import android.os.Handler
import android.os.Looper
import android.os.Message
import android.os.SystemClock
import android.os.Vibrator

import android.view.View
import android.view.ViewGroup
import android.view.LayoutInflater
import android.view.MotionEvent
import android.view.KeyEvent
import android.view.Window
import android.view.WindowManager
import android.view.Gravity

import android.widget.TextView
import android.widget.EditText
import android.widget.Button
import android.widget.ImageView
import android.widget.ListView
import android.widget.Toast
import android.widget.Switch
import android.widget.ProgressBar
import android.widget.LinearLayout
import android.widget.RelativeLayout
import android.widget.FrameLayout
import android.widget.ScrollView

import android.content.Context
import android.content.Intent
import android.content.IntentFilter
import android.content.BroadcastReceiver
import android.content.SharedPreferences
import android.content.pm.PackageManager
import android.content.ContentResolver
import android.content.ContentValues
import android.content.UriMatcher

import android.net.Uri
import android.net.ConnectivityManager
import android.net.Network
import android.net.NetworkCapabilities
import android.net.wifi.WifiManager

import android.graphics.Bitmap
import android.graphics.BitmapFactory
import android.graphics.Color
import android.graphics.drawable.Drawable

import androidx.core.app.ActivityCompat
import androidx.core.content.ContextCompat
import androidx.core.graphics.drawable.DrawableCompat
import androidx.core.view.ViewCompat

import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.Toolbar

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.LiveData
import androidx.lifecycle.Lifecycle
import androidx.lifecycle.LifecycleOwner
import androidx.lifecycle.lifecycleScope
import androidx.lifecycle.Observer
import androidx.lifecycle.viewmodel.CreationExtras

import androidx.room.Room
import androidx.room.Entity
import androidx.room.PrimaryKey
import androidx.room.ColumnInfo
import androidx.room.Dao
import androidx.room.Query
import androidx.room.Insert
import androidx.room.Delete
import androidx.room.Update
import androidx.room.Database
import androidx.room.RoomDatabase

import androidx.work.Worker
import androidx.work.WorkerParameters
import androidx.work.WorkManager
import androidx.work.OneTimeWorkRequest
import androidx.work.PeriodicWorkRequest
import androidx.work.Data

import androidx.navigation.NavController
import androidx.navigation.NavHost
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.NavOptions

import androidx.datastore.core.DataStore
import androidx.datastore.preferences.core.Preferences
import androidx.datastore.preferences.preferencesDataStore
import androidx.datastore.preferences.core.booleanPreferencesKey
import androidx.datastore.preferences.core.intPreferencesKey
import androidx.datastore.preferences.core.stringPreferencesKey
import androidx.datastore.preferences.core.edit
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.getValue
import androidx.compose.runtime.setValue
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.DisposableEffect
import androidx.compose.runtime.SideEffect
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.runtime.rememberSaveable
import androidx.compose.runtime.saveable.rememberSaveable

import androidx.compose.ui.Modifier
import androidx.compose.ui.Alignment
import androidx.compose.ui.layout.Layout
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.geometry.Size
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.ImageBitmap
import androidx.compose.ui.graphics.asImageBitmap
import androidx.compose.ui.graphics.drawscope.DrawScope
import androidx.compose.ui.graphics.drawscope.drawIntoCanvas
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.graphics.vector.ImageVector

import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.text.style.TextAlign

import androidx.compose.material.Text
import androidx.compose.material.Button
import androidx.compose.material.Icon
import androidx.compose.material.Switch
import androidx.compose.material.Divider
import androidx.compose.material.Checkbox
import androidx.compose.material.TopAppBar
import androidx.compose.material.BottomNavigation
import androidx.compose.material.FloatingActionButton
import androidx.compose.material.Scaffold
import androidx.compose.material.Snackbar
import androidx.compose.material.SnackbarHost
import androidx.compose.material.SnackbarHostState
import androidx.compose.material.AlertDialog
import androidx.compose.material.MaterialTheme
import androidx.compose.material.IconButton
import androidx.compose.material.TextField
import androidx.compose.material.OutlinedTextField
import androidx.compose.material.DropdownMenu
import androidx.compose.material.DropdownMenuItem
import androidx.compose.material.Tab
import androidx.compose.material.TabRow
import androidx.compose.material.CircularProgressIndicator
import androidx.compose.material.LinearProgressIndicator

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.gestures.scrollable
import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.verticalScroll
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.BasicTextField
import androidx.compose.foundation.text.KeyboardActions
import androidx.compose.foundation.text.KeyboardOptions

import androidx.compose.animation.core.*
import androidx.compose.animation.animateColorAsState
import androidx.compose.animation.animateContentSize
import androidx.compose.animation.Crossfade
import androidx.compose.animation.fadeIn
import androidx.compose.animation.fadeOut
import androidx.compose.animation.expandIn
import androidx.compose.animation.expandOut
import androidx.compose.animation.shrinkIn
import androidx.compose.animation.shrinkOut

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.*
import androidx.compose.material.icons.outlined.*
import androidx.compose.material.icons.rounded.*

import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.NavController
import androidx.navigation.NavHostController

import androidx.activity.compose.setContent
import androidx.activity.ComponentActivity
val tabelaLetras = mutableListOf<String>()
val letras = mutableListOf<String>()
val palavras = mutableListOf<String>()
val palavrasMasculinas = mutableListOf<String>()
val palavrasFemininas = mutableListOf<String>()
val comidas = mutableListOf<String>()
val saudações = mutableListOf<String>()
val verbos = mutableListOf<String>()
val bebidas = mutableListOf<String>()
val gírias = mutableListOf<String>()
data class Palavra(val texto: String, val categoria: String)
val banco = mutableListOf<Palavra>()
val nomesMasculinos = banco.filter { it.categoria == "nome_masculino" }
val nomesMasculinos = listOf("Enzo", "Gabriel", "João")
val nomesFemininos  = listOf("Maria", "Ana", "Sofia")
val nomesNeutros    = listOf("Alex", "Sam")
val gíriasSus       = listOf("sus", "suspeito", "impostor", "ventou")
nomesMasculinos.forEach { banco.add(Palavra(it, "nome_masculino")) }
nomesFemininos.forEach { banco.add(Palavra(it, "nome_feminino")) }
nomesNeutros.forEach { banco.add(Palavra(it, "nome_neutro")) }
gíriasSus.forEach { banco.add(Palavra(it, "sus")) }
val criancas_5_7 = mutableListOf<String>()
val criancas_8_12 = mutableListOf<String>()
val adolescentes = mutableListOf<String>()
val palavrasProibidas = mutableListOf<String>()
val emocaoFeliz = mutableListOf<String>()
/** LETRAS */
tabelaLetras.add("q")
tabelaLetras.add("w")
tabelaLetras.add("e")
tabelaLetras.add("r")
tabelaLetras.add("t")
tabelaLetras.add("y")
tabelaLetras.add("u")
tabelaLetras.add("i")
tabelaLetras.add("o")
tabelaLetras.add("p")
tabelaLetras.add("a")
tabelaLetras.add("s")
tabelaLetras.add("d")
tabelaLetras.add("f")
tabelaLetras.add("g")
tabelaLetras.add("h")
tabelaLetras.add("j")
tabelaLetras.add("k")
tabelaLetras.add("l")
tabelaLetras.add("z")
tabelaLetras.add("x")
tabelaLetras.add("c")
tabelaLetras.add("v")
tabelaLetras.add("b")
tabelaLetras.add("n")
tabelaLetras.add("m")
/** PALAVRAS PT-BR */
palavras.add("Mano")
palavras.add("cara")
palavras.add("miga")
palavras.add("mana")
palavras.add("maçã")
palavras.add("banana")
palavras.add("pera")
palavras.add("uva Verde/Roxa")
palavras.add("olá")
palavrasMasculinas.add("mano")
palavrasMasculinas.add("cara")

palavrasFemininas.add("miga")
palavrasFemininas.add("mana")

comidas.add("maçã")
comidas.add("banana")
comidas.add("pera")
comidas.add("uva Verde/Roxa")

saudações.add("olá")
saudações.add("e ai mano")
saudações.add("e ai mana")
saudações.add("e ai")
saudações.add("e ai tudo bem")
saudações.add("oi")
saudações.add("oi tudo bem?")
verbos.add("comer")
verbos.add("beber")
verbos.add("andar")
verbos.add("correr")
verbos.add("falar")
verbos.add("dormir")
verbos.add("pensar")
verbos.add("fazer")
verbos.add("ir")
verbos.add("vir")
verbos.add("ver")
verbos.add("pegar")
verbos.add("abrir")
verbos.add("fechar")
verbos.add("sentar")
verbos.add("levantar")
verbos.add("desabafa mano")
bebidas.add("água")
bebidas.add("refrigerante")
bebidas.add("suco")
bebidas.add("chá")
bebidas.add("café")
bebidas.add("vitamina")
bebidas.add("leite")
bebidas.add("cerveja")
bebidas.add("pinga")
bebidas.add("vinho")
bebidas.add("vodka")
bebidas.add("catuaba")
gírias.add("mano")
gírias.add("véi")
gírias.add("truta")
gírias.add("fi")
gírias.add("pivete")
gírias.add("mina")
gírias.add("botar marcha")
gírias.add("dar fuga")
gírias.add("suave")
gírias.add("de boa")
gírias.add("top")
gírias.add("brabo")
gírias.add("é os guri")
gírias.add("oxe")
gírias.add("vixi")
gírias.add("papo reto")
gírias.add("cria")
gírias.add("do nada")
gírias.add("bolado")
gírias.add("zovo")
gírias.add("ovo")
gírias.add("minino")
gírias.add("menino")
gírias.add("garoto")
gírias.add("garota")
gírias.add("homem")
gírias.add("mulher")
banco.add(Palavra("Enzo", "nome_masculino"))
banco.add(Palavra("Gabriel", "nome_masculino"))
banco.add(Palavra("João", "nome_masculino"))
banco.add(Palavra("Pedro", "nome_masculino"))
banco.add(Palavra("Maria", "nome_feminino"))
banco.add(Palavra("Ana", "nome_feminino"))
banco.add(Palavra("Beatriz", "nome_feminino"))
banco.add(Palavra("Sofia", "nome_feminino"))
banco.add(Palavra("miga", "apelido_feminino"))
banco.add(Palavra("mano", "apelido_masculino"))
banco.add(Palavra("tropa", "apelido_coletivo"))
banco.add(Palavra("cria", "apelido"))
banco.add(Palavra("Alex", "nome_neutro"))
banco.add(Palavra("Sam", "nome_neutro"))
banco.add(Palavra("sus", "giria_sus"))
banco.add(Palavra("estranho", "sus"))
banco.add(Palavra("suspeito", "sus"))
banco.add(Palavra("duvidoso", "sus"))
banco.add(Palavra("parece errado", "sus"))
banco.add(Palavra("hm?", "sus"))
banco.add(Palavra("impostor", "sus"))
banco.add(Palavra("ventou", "sus"))   // referência Among Us
banco.add(Palavra("tá estranho", "sus"))
banco.add(Palavra("algo errado aí", "sus"))
criancas_5_7.add("bola")
criancas_5_7.add("gato")
criancas_5_7.add("cachorro")
criancas_5_7.add("boneca")
criancas_5_7.add("carrinho")
criancas_5_7.add("pipoca")
criancas_5_7.add("pirulito")
criancas_5_7.add("casinha")
criancas_5_7.add("mãe")
criancas_5_7.add("pai")
criancas_5_7.add("tia")
criancas_5_7.add("tio")
criancas_5_7.add("parque")
criancas_5_7.add("escola")
criancas_5_7.add("amigo")
criancas_5_7.add("amiga")
criancas_5_7.add("quebra-cabeça")
criancas_5_7.add("desenho")
criancas_5_7.add("colorir")
criancas_5_7.add("história")
criancas_5_7.add("merenda")
criancas_5_7.add("lanche")
criancas_5_7.add("brincar")
criancas_5_7.add("pular")
criancas_5_7.add("cantar")
criancas_5_7.add("abraço")
criancas_8_12.add("tablet")
criancas_8_12.add("videogame")
criancas_8_12.add("escola")
criancas_8_12.add("recreio")
criancas_8_12.add("caderno")
criancas_8_12.add("professor")
criancas_8_12.add("brincadeira")
criancas_8_12.add("amizade")
criancas_8_12.add("desenho animado")
criancas_8_12.add("herói")
criancas_8_12.add("superpoder")
criancas_8_12.add("futebol")
criancas_8_12.add("natação")
criancas_8_12.add("bicicleta")
criancas_8_12.add("patinete")
criancas_8_12.add("computador")
criancas_8_12.add("livro")
criancas_8_12.add("história")
criancas_8_12.add("aventura")
criancas_8_12.add("parque")
criancas_8_12.add("ciência")
criancas_8_12.add("robô")
criancas_8_12.add("dinossauro")
criancas_8_12.add("coleção")
criancas_8_12.add("cartas")
criancas_8_12.add("quadrinhos")
adolescentes.add("crush")
adolescentes.add("rolê")
adolescentes.add("amizade")
adolescentes.add("chat")
adolescentes.add("timidez")
adolescentes.add("festa")
adolescentes.add("escola")
adolescentes.add("música")
adolescentes.add("headset")
adolescentes.add("streamer")
adolescentes.add("gamer")
adolescentes.add("celular")
adolescentes.add("grupo")
adolescentes.add("namoro")
adolescentes.add("tretar")
adolescentes.add("stylish")
adolescentes.add("moda")
adolescentes.add("viral")
adolescentes.add("trend")
adolescentes.add("selfie")
adolescentes.add("postar")
adolescentes.add("insegurança")
adolescentes.add("confiança")
adolescentes.add("treino")
adolescentes.add("amizade forte")
adolescentes.add("aprendizado")
palavrasProibidas.add("insulto")
palavrasProibidas.add("xingamento")
palavrasProibidas.add("violencia")
palavrasProibidas.add("ofensa")
palavrasProibidas.add("discurso de odio")
palavrasProibidas.add("conteudo adulto")
palavrasProibidas.add("bullying")
palavrasProibidas.add("preconceito")
palavrasProibidas.add("ataque pessoal")
palavrasProibidas.add("discriminacao")
palavrasProibidas.add("palavra chula")
palavrasProibidas.add("assedio")
palavrasProibidas.add("autolesao")
palavrasProibidas.add("suicidio")
palavrasProibidas.add("conteudo perigoso")
palavrasProibidas.add("tortura")
palavrasProibidas.add("armas")
palavrasProibidas.add("drogas")
palavrasProibidas.add("odio")
palavrasProibidas.add("terrorismo")
emocaoFeliz.add("sorriso")
emocaoFeliz.add("alegria")
emocaoFeliz.add("feliz")
emocaoFeliz.add("animado")
emocaoFeliz.add("divertido")
emocaoFeliz.add("orgulhoso")
emocaoFeliz.add("contente")

val emocaoTriste = mutableListOf<String>()
emocaoTriste.add("chorar")
emocaoTriste.add("tristeza")
emocaoTriste.add("sozinho")
emocaoTriste.add("desanimado")
emocaoTriste.add("cansado")
emocaoTriste.add("saudade")
emocaoTriste.add("desconforto")

val emocaoBravo = mutableListOf<String>()
emocaoBravo.add("raiva")
emocaoBravo.add("bravo")
emocaoBravo.add("irritado")
emocaoBravo.add("frustrado")
emocaoBravo.add("impaciente")
emocaoBravo.add("explodir")

val emocaoAssustado = mutableListOf<String>()
emocaoAssustado.add("medo")
emocaoAssustado.add("susto")
emocaoAssustado.add("preocupado")
emocaoAssustado.add("nervoso")
emocaoAssustado.add("tenso")
emocaoAssustado.add("assustado")
val adolescentesOdeiam = mutableListOf<String>()

adolescentesOdeiam.add("acordar cedo")
adolescentesOdeiam.add("prova surpresa")
adolescentesOdeiam.add("bronca sem motivo")
adolescentesOdeiam.add("comparacao com outros")
adolescentesOdeiam.add("falta de privacidade")
adolescentesOdeiam.add("demora no wifi")
adolescentesOdeiam.add("internet lenta")
adolescentesOdeiam.add("quando o celular trava")
adolescentesOdeiam.add("acabar a bateria")
adolescentesOdeiam.add("gente falsa")
adolescentesOdeiam.add("fofoca")
adolescentesOdeiam.add("mentira")
adolescentesOdeiam.add("quando nao respondem mensagem")
adolescentesOdeiam.add("quando respondem seco")
adolescentesOdeiam.add("barulho enquanto estao concentrados")
adolescentesOdeiam.add("chamar na frente dos outros")
adolescentesOdeiam.add("ser obrigados a socializar")
adolescentesOdeiam.add("promessas quebradas")
adolescentesOdeiam.add("proibirem de usar celular")
adolescentesOdeiam.add("tirarem o videogame")
adolescentesOdeiam.add("fazer tarefa de casa")
adolescentesOdeiam.add("esperar demais")
adolescentesOdeiam.add("serem tratados como crianca")
adolescentesOdeiam.add("injustica")
adolescentesOdeiam.add("serem ignorados")
adolescentesOdeiam.add("explicar varias vezes a mesma coisa")
adolescentesOdeiam.add("serem forçados a comer algo que nao gostam")
adolescentesOdeiam.add("aulas longas")
adolescentesOdeiam.add("ver gente brigando")
adolescentesOdeiam.add("serem interrompidos")
adolescentesOdeiam.add("conectar em redes publicas ruins")
adolescentesOdeiam.add("fila longa")
adolescentesOdeiam.add("perguntas repetitivas")
adolescentesOdeiam.add("ENEM")
adolescentesOdeiam.add("SAEB")
val kidBrainrot = mutableListOf<String>()

kidBrainrot.add("falar frase de meme repetidamente")
kidBrainrot.add("imitar som aleatorio sem contexto")
kidBrainrot.add("rir sozinho de video de 3 segundos")
kidBrainrot.add("mandar sticker em vez de falar")
kidBrainrot.add("criar palavra nova que ninguem entende")
kidBrainrot.add("editar video com som estourado")
kidBrainrot.add("dançar tiktok em qualquer lugar")
kidBrainrot.add("usar bordao toda hora")
kidBrainrot.add("fingir que ta narrando a propria vida")
kidBrainrot.add("fazer voz de desenho sem motivo")
kidBrainrot.add("confundir serio com brincadeira")
kidBrainrot.add("dar tapa na propria testa quando erra algo")
kidBrainrot.add("usar capslock pra tudo")
kidBrainrot.add("mudar de assunto no meio da frase")
kidBrainrot.add("rir de meme que ninguem mais acha engraçado")
kidBrainrot.add("criar personagem imaginario pra zoar")
kidBrainrot.add("fazer som de explosionzinha tipo pew pew")
kidBrainrot.add("fingir que ta em batalha de anime")
kidBrainrot.add("dizer frases tipo socorro, ave maria, meu deus kkkkk")
kidBrainrot.add("mandar gif de minion em qualquer conversa")
kidBrainrot.add("fazer edit de qualquer coisa")
kidBrainrot.add("escrever errado de proposito")
kidBrainrot.add("fazer referencia a meme morto")
kidBrainrot.add("rir da propria piada")
kidBrainrot.add("zoar tudo com voz fina ou grave")
kidBrainrot.add("agir como se tivesse em um jogo")
kidBrainrot.add("transformar qualquer frase em musica")
kidBrainrot.add("inventar historinha do nada")
kidBrainrot.add("misturar 3 memes em 1 frase")
kidBrainrot.add("fingir que é NPC e repetir frases")
kidBrainrot.add("six seven🤪")
kidBrainrot.add("siqs sevin🤪")
kidBrainrot.add("67🤪")
val brainrotKidFala = mutableListOf<String>()

brainrotKidFala.add("meu deus socorro kkkkkk")
brainrotKidFala.add("ave maria do nada")
brainrotKidFala.add("eu sou um peixeeee")
brainrotKidFala.add("bora bill")
brainrotKidFala.add("tava suave e do nada")
brainrotKidFala.add("eu sou o goku sim")
brainrotKidFala.add("pew pew pow pow")
brainrotKidFala.add("cala a boca voz da minha mente")
brainrotKidFala.add("to bugadoooo")
brainrotKidFala.add("eu sou npc sim")
brainrotKidFala.add("mano do ceu kkkkk")
brainrotKidFala.add("meu jogo travou meu cerebro tambem")
brainrotKidFala.add("socorro virei um pato")
brainrotKidFala.add("psi psi psi psi")
brainrotKidFala.add("oooooi sumidooooo")
brainrotKidFala.add("aiiii que susto do nadaaaa")
brainrotKidFala.add("eu sou literalmente um personagem")
brainrotKidFala.add("cérebro foi de arrasta")
brainrotKidFala.add("eu buguei no ar socorro")
brainrotKidFala.add("puf puf puf kkkk")
brainrotKidFala.add("eu faleci de rir")
brainrotKidFala.add("ué mas ué mas ué")
brainrotKidFala.add("virei um slime agora")
brainrotKidFala.add("minha mente explodiu pow pow")
brainrotKidFala.add("eu vi um urso imaginário aqui")
brainrotKidFala.add("mano to em 4k 60fps agora")
brainrotKidFala.add("eu sou doido mesmo e dai")
brainrotKidFala.add("to no modo turbo")
brainrotKidFala.add("a mente foi de americanas")
brainrotKidFala.add("brr brr patap1m")
brainrotKidFala.add("tralaleiro tralala")
val brainrotKidFaz = mutableListOf<String>()

brainrotKidFaz.add("fazer barulho de laser do nada")
brainrotKidFaz.add("ignorar a gravidade por 3 segundos")
brainrotKidFaz.add("sair correndo sem motivo")
brainrotKidFaz.add("fazer careta pra tudo")
brainrotKidFaz.add("quicar igual mola quando fica feliz")
brainrotKidFaz.add("rir antes da piada")
brainrotKidFaz.add("andar como se estivesse em um jogo")
brainrotKidFaz.add("inventar dança própria")
brainrotKidFaz.add("pular pra pegar coisa que não precisa pular")
brainrotKidFaz.add("fazer vozes aleatorias")
brainrotKidFaz.add("agir como se tivesse lutando contra inimigo invisivel")
brainrotKidFaz.add("bater palma em momento aleatorio")
brainrotKidFaz.add("tocar nos objetos só pra fazer barulho")
brainrotKidFaz.add("fazer som de carro com a boca")
brainrotKidFaz.add("mexer no ar como se fosse touchscreen invisível")
brainrotKidFaz.add("fingir que tem superpoder")
brainrotKidFaz.add("ficar girando até cair")
brainrotKidFaz.add("encostar no chão só pra ver a textura")
brainrotKidFaz.add("imitar animal sem contexto")
brainrotKidFaz.add("dar risada de explosão fake")
