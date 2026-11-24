# Foice do Agouro — mod independente (Forge 1.20.1)

Este é um projeto Forge independente para Minecraft Java 1.20.1. Ele registra o item `foicedoagouro:foice_do_agouro` e utiliza GeckoLib 4 para renderizar o modelo 3D e executar a animação idle exportada do Blockbench.

## Requisitos

- Minecraft Java 1.20.1
- Forge 47.4.0 (ou Forge 47.x compatível)
- Java 17 para compilar/executar o ambiente de desenvolvimento
- GeckoLib 4.8.5 para Forge 1.20.1 instalado na pasta `mods` ao jogar

GeckoLib é uma dependência externa; este mod não incorpora a biblioteca dentro do seu JAR. Isso evita empacotar classes duplicadas e é o funcionamento normal de mods que usam GeckoLib.

## Gerar o JAR

1. Instale o JDK 17.
2. Instale Gradle 8.8 ou use um Gradle Wrapper gerado localmente (`gradle wrapper --gradle-version 8.8`).
3. Abra um terminal nesta pasta e execute:

   - Windows: `gradlew.bat build` (ou `gradle build` se não tiver wrapper)
   - Linux/macOS: `./gradlew build` (ou `gradle build`)

4. O arquivo compilado será criado em `build/libs/FoiceDoAgouro-Forge-1.20.1-1.0.0.jar`.
5. Coloque esse JAR e o JAR do GeckoLib 4.8.5 Forge 1.20.1 em `.minecraft/mods`.

## Obter a foice

```mcfunction
/give @p foicedoagouro:foice_do_agouro
```

Ela também aparece na aba Criativa **Combate**. O item tem base de espada de netherita, 9 pontos de dano e velocidade de ataque -2.8.

## Conteúdo

- `src/main/java`: registro do mod, item, modelo GeckoLib e renderer.
- `src/main/resources/assets/foicedoagouro/geo`: modelo 3D.
- `src/main/resources/assets/foicedoagouro/animations`: animação idle.
- `src/main/resources/assets/foicedoagouro/textures/item`: textura original.
- `src/main/resources/META-INF/mods.toml`: metadados e dependências Forge/GeckoLib.

## Limitações conhecidas

O arquivo de origem só contém uma animação idle; não existe animação de ataque para disparar ao clicar. O projeto está configurado para ForgeGradle 6, GeckoLib 4.8.5, Mixin e MCLib 20, seguindo as instruções de dependência do GeckoLib 4 para Forge 1.20.1; precisa resolver dependências Maven/Forge na primeira compilação. A compilação não pôde ser executada neste ambiente porque não há Gradle instalado e o ambiente não consegue acessar a internet para baixar Gradle e as dependências. Portanto, este ZIP é o projeto-fonte independente, não um JAR compilado.

## Compilar pelo GitHub (sem instalar Java/Gradle no seu PC)

Este projeto inclui o workflow `.github/workflows/build.yml`.

1. Crie um repositório no GitHub (pode ser privado ou público).
2. Extraia este ZIP no computador e envie **o conteúdo desta pasta** para a raiz do repositório, incluindo a pasta oculta `.github`.
3. Abra a aba **Actions** do repositório. O workflow compila automaticamente quando houver push para `main` ou `master`. Também pode ser iniciado manualmente em **Build Foice do Agouro (Forge 1.20.1) > Run workflow**.
4. Abra a execução concluída com o ícone verde, desça até **Artifacts** e baixe `Foice-do-Agouro-Forge-1.20.1`.
5. Extraia o ZIP do Artifact. O `.jar` estará dentro dele.

O GitHub Actions configura Java 17 e Gradle 8.8 no runner e executa `gradle build`. Se a compilação falhar, abra a execução e consulte o primeiro passo vermelho para ver o erro. Este workflow facilita a compilação, mas não significa que o projeto já tenha sido compilado/testado com sucesso.
