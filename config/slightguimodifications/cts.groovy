// Here is the groovy file for screen elements
info("Hello From 'Slight' Gui Modifications cts script")

mainMenu {
    enabled = true // Set to true to enable this module

    splashText {
        enabled = true // Set to true to enable this module
        splashesEnabled = true // Set to false to disable splashes entirely

        customSplashes {
            enabled = true // Set to true to enable this module
            // You can put either "override" or "append" here to declare how you want to provide custom splashes
            applyMode = "override"
            defineCustom(["Foxes good","§bT§dr§fa§dn§bs §frights!", "§bT§dR§fA§dN§bS!", "Xenia is here soon™", "LGBeeT", "Tree Generation says Trans Rights", "Let's Get BEES together", "Let's Generate Broken Trees", "Tree-posing", "I love Lettuce Gay Bacon Tomato"])
        }
    }

    // Uncomment these to remove aspects of the title screen
    // removeMinecraftLogo()
    // removeEditionBadge()

    // Clear all buttons already on screen
    // clearAllButtons()

    label {
        position {
            x = 2
            y { it - 20 }
        }

        // You can create a text with "literal" or "translatable" if you want to translate with Resource Packs
        text = literal("§5Q§9u§ae§6e§cr§fpack 0.2.7")
        // The alignment here can be "left", "center" or "right", default is "left"
        align = "left"
        // Color of the text, default is 0xFFFFFF
        color = 0xFFFFFF
        // Whether the label has a shadow, default is false
        shadow = true
        // Mouse Hovered Color of the text, default is 0xFFFFFF
        hoveredColor = 0xE4E4E4
        // Mouse Click Function, default is nothing, here's a list of options
        onClicked = url("https://github.com/Queerbric/queerpack")
    }

    //button {
    //    position {
    //        x = 5
    //        y = 5
    //    }
    //    width = 200
    //    height = 20
	//
    //    // You can create a text with "literal" or "translatable" if you want to translate with Resource Packs
    //    text = literal("Random Button")
    //    // The alignment here can be "left", "center" or "right", default is "left"
    //    align = "left"
    //    // Mouse Click Function, default is nothing, look up see the list
    //    onClicked = nothing()
    //}
}