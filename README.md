

####Build Plugin

    cd custom-plugin
    gradle publish
    
####Config
root build.gradle

    repositories {
        maven {
            url "repo"
        }
    }

    dependencies {
        ···
        classpath 'com.sparkrico:CustomPlugin:1.0'
        ···
    }
        
app build.gradle
       
    apply plugin: 'com.sparkrico'
    
#### Test
gradle app:tasks

    ========================
    hello gradle plugin!
    ========================
