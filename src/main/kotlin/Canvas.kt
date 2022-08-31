import processing.core.PApplet

class Canvas : PApplet() {
    companion object Factory {
        private const val size = 600
        fun run() {
            var art = Canvas()
            art.setSize(size, size)
            art.runSketch()
        }
    }

    override fun setup() {

    }
    override fun draw() {

    }
}