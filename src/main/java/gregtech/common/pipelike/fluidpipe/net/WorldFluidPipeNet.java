package gregtech.common.pipelike.fluidpipe.net;

import gregtech.api.pipenet.WorldPipeNet;
import gregtech.common.pipelike.cable.WireProperties;
import gregtech.common.pipelike.cable.net.EnergyNet;
import gregtech.common.pipelike.fluidpipe.FluidPipeProperties;
import net.minecraft.world.World;

public class WorldFluidPipeNet extends WorldPipeNet<FluidPipeProperties, FluidPipeNet> {

    private static final String DATA_ID = "gregtech.fluid_pipe_net";

    public static WorldFluidPipeNet getWorldPipeNet(World world) {
        WorldFluidPipeNet netWorldData = (WorldFluidPipeNet) world.loadData(WorldFluidPipeNet.class, DATA_ID);
        if(netWorldData == null) {
            netWorldData = new WorldFluidPipeNet(DATA_ID);
            world.setData(DATA_ID, netWorldData);
        }
        netWorldData.world = world;
        return netWorldData;
    }

    public WorldFluidPipeNet(String name) {
        super(name);
    }

    @Override
    protected FluidPipeNet createNetInstance() {
        return new FluidPipeNet(this);
    }

}
