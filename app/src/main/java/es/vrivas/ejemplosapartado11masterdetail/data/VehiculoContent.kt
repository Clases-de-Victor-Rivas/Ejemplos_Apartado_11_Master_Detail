package es.vrivas.ejemplosapartado11masterdetail.data

import es.vrivas.ejemplosapartado11masterdetail.R
import java.util.ArrayList

/**
 * Helper class for providing sample content for user interfaces created by
 * Android template wizards.
 *
 */
object VehiculoContent {

    /**
     * An array of sample (Vehiculo) items.
     */
    val ITEMS: MutableList<VehiculoItem> = ArrayList()

    /**
     * A map of sample (Vehiculo) items, by ID.
     */
    val ITEM_MAP: MutableMap<String, VehiculoItem> = HashMap()

    private val COUNT = 25

    init {
        // Add some sample items.
        addItem(createVehiculoItem("0","Seat", "1234SST", R.mipmap.ic_seat))
        addItem(createVehiculoItem("1", "Volkswagen", "5678VWG", R.mipmap.ic_vw))
        addItem(createVehiculoItem("2", "Mercedes", "9999MBZ", R.mipmap.ic_mercedes))
    }

    private fun addItem(item: VehiculoItem) {
        ITEMS.add(item)
        ITEM_MAP.put(item.id, item)
    }

    private fun createVehiculoItem(id: String, marca: String, matricula: String, icono: Int): VehiculoItem {
        return VehiculoItem(id, marca, matricula, icono)
    }

    /**
     * A Vehiculo item representing a piece of content.
     */
    data class VehiculoItem(val id: String, val marca: String, val matricula: String, val icono: Int) {
        override fun toString(): String = "$id: $matricula ($marca)"
    }
}