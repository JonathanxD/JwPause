package me.therealbuggy.JwPause.listener;

import me.therealbuggy.JwPause.JwPause;

import org.bukkit.Location;
import org.bukkit.event.Cancellable;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.block.*;
import org.bukkit.event.enchantment.*;
import org.bukkit.event.entity.*;
import org.bukkit.event.hanging.*;
import org.bukkit.event.inventory.*;
import org.bukkit.event.player.*;
import org.bukkit.event.server.*;
import org.bukkit.event.vehicle.*;
import org.bukkit.event.weather.*;
import org.bukkit.event.world.*;
import org.spigotmc.event.entity.EntityDismountEvent;
import org.spigotmc.event.entity.EntityMountEvent;
import org.spigotmc.event.player.PlayerSpawnLocationEvent;

public class JPauseListener implements Listener {
	private final JwPause jw;
	
	public JPauseListener(JwPause jw) {
		this.jw = jw;
	}
	
	/*PAUSEGAME*/
	@EventHandler(priority = EventPriority.HIGH)
	private void pause(BlockBreakEvent event){handleEvent(event);}
	@EventHandler(priority = EventPriority.HIGH)
	private void pause(BlockBurnEvent event){handleEvent(event);}
	@EventHandler(priority = EventPriority.HIGH)
	private void pause(BlockCanBuildEvent event){handleEvent(event);}
	@EventHandler(priority = EventPriority.HIGH)
	private void pause(BlockDamageEvent event){handleEvent(event);}
	@EventHandler(priority = EventPriority.HIGH)
	private void pause(BlockDispenseEvent event){handleEvent(event);}
	@EventHandler(priority = EventPriority.HIGH)
	private void pause(BlockExpEvent event){handleEvent(event);}

	@EventHandler(priority = EventPriority.HIGH)
	private void pause(BlockExplodeEvent event) {
		handleEvent(event);
	}
	@EventHandler(priority = EventPriority.HIGH)
	private void pause(BlockFadeEvent event){handleEvent(event);}
	@EventHandler(priority = EventPriority.HIGH)
	private void pause(BlockFormEvent event){handleEvent(event);}
	@EventHandler(priority = EventPriority.HIGH)
	private void pause(BlockFromToEvent event){handleEvent(event);}
	@EventHandler(priority = EventPriority.HIGH)
	private void pause(BlockGrowEvent event){handleEvent(event);}
	@EventHandler(priority = EventPriority.HIGH)
	private void pause(BlockIgniteEvent event){handleEvent(event);}
	@EventHandler(priority = EventPriority.HIGH)
	private void pause(BlockMultiPlaceEvent event){handleEvent(event);}
	@EventHandler(priority = EventPriority.HIGH)
	private void pause(BlockPhysicsEvent event){handleEvent(event);}
	@EventHandler(priority = EventPriority.HIGH)
	private void pause(BlockPistonExtendEvent event){handleEvent(event);}
	@EventHandler(priority = EventPriority.HIGH)
	private void pause(BlockPistonRetractEvent event){handleEvent(event);}
	@EventHandler(priority = EventPriority.HIGH)
	private void pause(BlockPlaceEvent event){handleEvent(event);}
	@EventHandler(priority = EventPriority.HIGH)
	private void pause(BlockRedstoneEvent event){handleEvent(event);}
	@EventHandler(priority = EventPriority.HIGH)
	private void pause(BlockSpreadEvent event){handleEvent(event);}
	@EventHandler(priority = EventPriority.HIGH)
	private void pause(EntityBlockFormEvent event){handleEvent(event);}
	@EventHandler(priority = EventPriority.HIGH)
	private void pause(LeavesDecayEvent event){handleEvent(event);}
	@EventHandler(priority = EventPriority.HIGH)
	private void pause(NotePlayEvent event){handleEvent(event);}
	@EventHandler(priority = EventPriority.HIGH)
	private void pause(SignChangeEvent event){handleEvent(event);}
	@EventHandler(priority = EventPriority.HIGH)
	private void pause(EnchantItemEvent event){handleEvent(event);}
	@EventHandler(priority = EventPriority.HIGH)
	private void pause(PrepareItemEnchantEvent event){handleEvent(event);}
	@EventHandler(priority = EventPriority.HIGH)
	private void pause(CreatureSpawnEvent event){handleEvent(event);}
	@EventHandler(priority = EventPriority.HIGH)
	private void pause(CreeperPowerEvent event){handleEvent(event);}
	@EventHandler(priority = EventPriority.HIGH)
	private void pause(EntityBreakDoorEvent event){handleEvent(event);}
	@EventHandler(priority = EventPriority.HIGH)
	private void pause(EntityChangeBlockEvent event){handleEvent(event);}
	@EventHandler(priority = EventPriority.HIGH)
	private void pause(EntityCombustByBlockEvent event){handleEvent(event);}
	@EventHandler(priority = EventPriority.HIGH)
	private void pause(EntityCombustByEntityEvent event){handleEvent(event);}
	@EventHandler(priority = EventPriority.HIGH)
	private void pause(EntityCombustEvent event){handleEvent(event);}
	@EventHandler(priority = EventPriority.HIGH)
	private void pause(EntityCreatePortalEvent event){handleEvent(event);}
	@EventHandler(priority = EventPriority.HIGH)
	private void pause(EntityDamageByBlockEvent event){handleEvent(event);}
	@EventHandler(priority = EventPriority.HIGH)
	private void pause(EntityDamageByEntityEvent event){handleEvent(event);}
	@EventHandler(priority = EventPriority.HIGH)
	private void pause(EntityDamageEvent event){handleEvent(event);}
	@EventHandler(priority = EventPriority.HIGH)
	private void pause(EntityDeathEvent event){handleEvent(event);}
	@EventHandler(priority = EventPriority.HIGH)
	private void pause(EntityExplodeEvent event){handleEvent(event);}
	@EventHandler(priority = EventPriority.HIGH)
	private void pause(EntityInteractEvent event){handleEvent(event);}
	@EventHandler(priority = EventPriority.HIGH)
	private void pause(EntityPortalEnterEvent event){handleEvent(event);}
	@EventHandler(priority = EventPriority.HIGH)
	private void pause(EntityPortalEvent event){handleEvent(event);}
	@EventHandler(priority = EventPriority.HIGH)
	private void pause(EntityPortalExitEvent event){handleEvent(event);}
	@EventHandler(priority = EventPriority.HIGH)
	private void pause(EntityRegainHealthEvent event){handleEvent(event);}
	@EventHandler(priority = EventPriority.HIGH)
	private void pause(EntityShootBowEvent event){handleEvent(event);}
	@EventHandler(priority = EventPriority.HIGH)
	private void pause(EntitySpawnEvent event){handleEvent(event);}
	@EventHandler(priority = EventPriority.HIGH)
	private void pause(EntityTameEvent event){handleEvent(event);}
	@EventHandler(priority = EventPriority.HIGH)
	private void pause(EntityTargetEvent event){handleEvent(event);}
	@EventHandler(priority = EventPriority.HIGH)
	private void pause(EntityTargetLivingEntityEvent event){handleEvent(event);}
	@EventHandler(priority = EventPriority.HIGH)
	private void pause(EntityTeleportEvent event){handleEvent(event);}
	@EventHandler(priority = EventPriority.HIGH)
	private void pause(EntityUnleashEvent event){handleEvent(event);}
	@EventHandler(priority = EventPriority.HIGH)
	private void pause(ExpBottleEvent event){handleEvent(event);}
	@EventHandler(priority = EventPriority.HIGH)
	private void pause(ExplosionPrimeEvent event){handleEvent(event);}
	@EventHandler(priority = EventPriority.HIGH)
	private void pause(FoodLevelChangeEvent event){handleEvent(event);}
	@EventHandler(priority = EventPriority.HIGH)
	private void pause(HorseJumpEvent event){handleEvent(event);}
	@EventHandler(priority = EventPriority.HIGH)
	private void pause(ItemDespawnEvent event){handleEvent(event);}

	@EventHandler(priority = EventPriority.HIGH)
	private void pause(ItemMergeEvent event) {
		handleEvent(event);
	}
	@EventHandler(priority = EventPriority.HIGH)
	private void pause(ItemSpawnEvent event){handleEvent(event);}
	@EventHandler(priority = EventPriority.HIGH)
	private void pause(PigZapEvent event){handleEvent(event);}
	@EventHandler(priority = EventPriority.HIGH)
	private void pause(PlayerDeathEvent event){handleEvent(event);}
	@EventHandler(priority = EventPriority.HIGH)
	private void pause(PlayerLeashEntityEvent event){handleEvent(event);}
	@EventHandler(priority = EventPriority.HIGH)
	private void pause(PotionSplashEvent event){handleEvent(event);}
	@EventHandler(priority = EventPriority.HIGH)
	private void pause(ProjectileHitEvent event){handleEvent(event);}
	@EventHandler(priority = EventPriority.HIGH)
	private void pause(ProjectileLaunchEvent event){handleEvent(event);}
	@EventHandler(priority = EventPriority.HIGH)
	private void pause(SheepDyeWoolEvent event){handleEvent(event);}
	@EventHandler(priority = EventPriority.HIGH)
	private void pause(SheepRegrowWoolEvent event){handleEvent(event);}
	@EventHandler(priority = EventPriority.HIGH)
	private void pause(SlimeSplitEvent event){handleEvent(event);}
	@EventHandler(priority = EventPriority.HIGH)
	private void pause(SpawnerSpawnEvent event){handleEvent(event);}
	@EventHandler(priority = EventPriority.HIGH)
	private void pause(HangingBreakByEntityEvent event){handleEvent(event);}
	@EventHandler(priority = EventPriority.HIGH)
	private void pause(HangingBreakEvent event){handleEvent(event);}
	@EventHandler(priority = EventPriority.HIGH)
	private void pause(HangingPlaceEvent event){handleEvent(event);}
	@EventHandler(priority = EventPriority.HIGH)
	private void pause(BrewEvent event){handleEvent(event);}
	@EventHandler(priority = EventPriority.HIGH)
	private void pause(CraftItemEvent event){handleEvent(event);}
	@EventHandler(priority = EventPriority.HIGH)
	private void pause(FurnaceBurnEvent event){handleEvent(event);}
	@EventHandler(priority = EventPriority.HIGH)
	private void pause(FurnaceExtractEvent event){handleEvent(event);}
	@EventHandler(priority = EventPriority.HIGH)
	private void pause(InventoryClickEvent event){handleEvent(event);}
	@EventHandler(priority = EventPriority.HIGH)
	private void pause(InventoryCloseEvent event){handleEvent(event);}
	@EventHandler(priority = EventPriority.HIGH)
	private void pause(InventoryCreativeEvent event){handleEvent(event);}
	@EventHandler(priority = EventPriority.HIGH)
	private void pause(InventoryDragEvent event){handleEvent(event);}
	@EventHandler(priority = EventPriority.HIGH)
	private void pause(InventoryInteractEvent event){handleEvent(event);}
	@EventHandler(priority = EventPriority.HIGH)
	private void pause(InventoryMoveItemEvent event){handleEvent(event);}
	@EventHandler(priority = EventPriority.HIGH)
	private void pause(InventoryOpenEvent event){handleEvent(event);}
	@EventHandler(priority = EventPriority.HIGH)
	private void pause(InventoryPickupItemEvent event){handleEvent(event);}
	@EventHandler(priority = EventPriority.HIGH)
	private void pause(PrepareItemCraftEvent event){handleEvent(event);}
	@EventHandler(priority = EventPriority.HIGH)
	private void pause(AsyncPlayerChatEvent event){handleEvent(event);}
	@EventHandler(priority = EventPriority.HIGH)
	private void pause(AsyncPlayerPreLoginEvent event){handleEvent(event);}
	@EventHandler(priority = EventPriority.HIGH)
	private void pause(PlayerAchievementAwardedEvent event){handleEvent(event);}
	@EventHandler(priority = EventPriority.HIGH)
	private void pause(PlayerAnimationEvent event){handleEvent(event);}

	@EventHandler(priority = EventPriority.HIGH)
	private void pause(PlayerArmorStandManipulateEvent event) {
		handleEvent(event);
	}
	@EventHandler(priority = EventPriority.HIGH)
	private void pause(PlayerBedEnterEvent event){handleEvent(event);}
	@EventHandler(priority = EventPriority.HIGH)
	private void pause(PlayerBedLeaveEvent event){handleEvent(event);}
	@EventHandler(priority = EventPriority.HIGH)
	private void pause(PlayerBucketEmptyEvent event){handleEvent(event);}
	@EventHandler(priority = EventPriority.HIGH)
	private void pause(PlayerBucketFillEvent event){handleEvent(event);}
	@EventHandler(priority = EventPriority.HIGH)
	private void pause(PlayerChangedWorldEvent event){handleEvent(event);}
	@EventHandler(priority = EventPriority.HIGH)
	private void pause(PlayerChatTabCompleteEvent event){handleEvent(event);}
	@EventHandler(priority = EventPriority.HIGH)
	private void pause(PlayerCommandPreprocessEvent event){handleEvent(event);}
	@EventHandler(priority = EventPriority.HIGH)
	private void pause(PlayerDropItemEvent event){handleEvent(event);}
	@EventHandler(priority = EventPriority.HIGH)
	private void pause(PlayerEditBookEvent event){handleEvent(event);}
	@EventHandler(priority = EventPriority.HIGH)
	private void pause(PlayerEggThrowEvent event){handleEvent(event);}
	@EventHandler(priority = EventPriority.HIGH)
	private void pause(PlayerExpChangeEvent event){handleEvent(event);}
	@EventHandler(priority = EventPriority.HIGH)
	private void pause(PlayerFishEvent event){handleEvent(event);}
	@EventHandler(priority = EventPriority.HIGH)
	private void pause(PlayerGameModeChangeEvent event){handleEvent(event);}

	@EventHandler(priority = EventPriority.HIGH)
	private void pause(PlayerInteractAtEntityEvent event) {
		handleEvent(event);
	}
	@EventHandler(priority = EventPriority.HIGH)
	private void pause(PlayerInteractEntityEvent event){handleEvent(event);}
	@EventHandler(priority = EventPriority.HIGH)
	private void pause(PlayerInteractEvent event){handleEvent(event);}
	@EventHandler(priority = EventPriority.HIGH)
	private void pause(PlayerItemBreakEvent event){handleEvent(event);}
	@EventHandler(priority = EventPriority.HIGH)
	private void pause(PlayerItemConsumeEvent event){handleEvent(event);}
	@EventHandler(priority = EventPriority.HIGH)
	private void pause(PlayerItemDamageEvent event){handleEvent(event);}
	@EventHandler(priority = EventPriority.HIGH)
	private void pause(PlayerItemHeldEvent event){handleEvent(event);}
	@EventHandler(priority = EventPriority.HIGH)
	private void pause(PlayerJoinEvent event){handleEvent(event);}
	@EventHandler(priority = EventPriority.HIGH)
	private void pause(PlayerKickEvent event){handleEvent(event);}
	@EventHandler(priority = EventPriority.HIGH)
	private void pause(PlayerLevelChangeEvent event){handleEvent(event);}
	@EventHandler(priority = EventPriority.HIGH)
	private void pause(PlayerLoginEvent event){handleEvent(event);}
	@EventHandler(priority = EventPriority.HIGH)
	private void pause(PlayerMoveEvent event){handleEvent(event);}
	@EventHandler(priority = EventPriority.HIGH)
	private void pause(PlayerPickupItemEvent event){handleEvent(event);}
	@EventHandler(priority = EventPriority.HIGH)
	private void pause(PlayerPortalEvent event){handleEvent(event);}
	@EventHandler(priority = EventPriority.HIGH)
	private void pause(PlayerQuitEvent event){handleEvent(event);}
	@EventHandler(priority = EventPriority.HIGH)
	private void pause(PlayerRegisterChannelEvent event){handleEvent(event);}
	@EventHandler(priority = EventPriority.HIGH)
	private void pause(PlayerRespawnEvent event){handleEvent(event);}
	@EventHandler(priority = EventPriority.HIGH)
	private void pause(PlayerShearEntityEvent event){handleEvent(event);}
	@EventHandler(priority = EventPriority.HIGH)
	private void pause(PlayerStatisticIncrementEvent event){handleEvent(event);}
	@EventHandler(priority = EventPriority.HIGH)
	private void pause(PlayerTeleportEvent event){handleEvent(event);}
	@EventHandler(priority = EventPriority.HIGH)
	private void pause(PlayerToggleFlightEvent event){handleEvent(event);}
	@EventHandler(priority = EventPriority.HIGH)
	private void pause(PlayerToggleSneakEvent event){handleEvent(event);}
	@EventHandler(priority = EventPriority.HIGH)
	private void pause(PlayerToggleSprintEvent event){handleEvent(event);}
	@EventHandler(priority = EventPriority.HIGH)
	private void pause(PlayerUnleashEntityEvent event){handleEvent(event);}
	@EventHandler(priority = EventPriority.HIGH)
	private void pause(PlayerUnregisterChannelEvent event){handleEvent(event);}
	@EventHandler(priority = EventPriority.HIGH)
	private void pause(PlayerVelocityEvent event){handleEvent(event);}
	@EventHandler(priority = EventPriority.HIGH)
	private void pause(MapInitializeEvent event){handleEvent(event);}
	@EventHandler(priority = EventPriority.HIGH)
	private void pause(PluginDisableEvent event){handleEvent(event);}
	@EventHandler(priority = EventPriority.HIGH)
	private void pause(PluginEnableEvent event){handleEvent(event);}
	@EventHandler(priority = EventPriority.HIGH)
	private void pause(RemoteServerCommandEvent event){handleEvent(event);}
	@EventHandler(priority = EventPriority.HIGH)
	private void pause(ServerCommandEvent event){handleEvent(event);}
	@EventHandler(priority = EventPriority.HIGH)
	private void pause(ServerListPingEvent event){handleEvent(event);}
	@EventHandler(priority = EventPriority.HIGH)
	private void pause(ServiceRegisterEvent event){handleEvent(event);}
	@EventHandler(priority = EventPriority.HIGH)
	private void pause(ServiceUnregisterEvent event){handleEvent(event);}
	@EventHandler(priority = EventPriority.HIGH)
	private void pause(VehicleBlockCollisionEvent event){handleEvent(event);}
	@EventHandler(priority = EventPriority.HIGH)
	private void pause(VehicleDamageEvent event){handleEvent(event);}
	@EventHandler(priority = EventPriority.HIGH)
	private void pause(VehicleDestroyEvent event){handleEvent(event);}
	@EventHandler(priority = EventPriority.HIGH)
	private void pause(VehicleEnterEvent event){handleEvent(event);}
	@EventHandler(priority = EventPriority.HIGH)
	private void pause(VehicleEntityCollisionEvent event){handleEvent(event);}
	@EventHandler(priority = EventPriority.HIGH)
	private void pause(VehicleExitEvent event){handleEvent(event);}
	@EventHandler(priority = EventPriority.HIGH)
	private void pause(VehicleMoveEvent event){handleEvent(event);}
	@EventHandler(priority = EventPriority.HIGH)
	private void pause(VehicleUpdateEvent event){handleEvent(event);}
	@EventHandler(priority = EventPriority.HIGH)
	private void pause(LightningStrikeEvent event){handleEvent(event);}
	@EventHandler(priority = EventPriority.HIGH)
	private void pause(ThunderChangeEvent event){handleEvent(event);}
	@EventHandler(priority = EventPriority.HIGH)
	private void pause(WeatherChangeEvent event){handleEvent(event);}
	@EventHandler(priority = EventPriority.HIGH)
	private void pause(ChunkLoadEvent event){handleEvent(event);}
	@EventHandler(priority = EventPriority.HIGH)
	private void pause(ChunkPopulateEvent event){handleEvent(event);}
	@EventHandler(priority = EventPriority.HIGH)
	private void pause(ChunkUnloadEvent event){handleEvent(event);}
	@EventHandler(priority = EventPriority.HIGH)
	private void pause(PortalCreateEvent event){handleEvent(event);}
	@EventHandler(priority = EventPriority.HIGH)
	private void pause(SpawnChangeEvent event){handleEvent(event);}
	@EventHandler(priority = EventPriority.HIGH)
	private void pause(StructureGrowEvent event){handleEvent(event);}
	@EventHandler(priority = EventPriority.HIGH)
	private void pause(WorldInitEvent event){handleEvent(event);}
	@EventHandler(priority = EventPriority.HIGH)
	private void pause(WorldLoadEvent event){handleEvent(event);}
	@EventHandler(priority = EventPriority.HIGH)
	private void pause(WorldSaveEvent event){handleEvent(event);}
	@EventHandler(priority = EventPriority.HIGH)
	private void pause(WorldUnloadEvent event){handleEvent(event);}
	//SpigotEvent
	@EventHandler(priority = EventPriority.HIGH)
	private void pause(PlayerSpawnLocationEvent event){handleEvent(event);}
	@EventHandler(priority = EventPriority.HIGH)
	private void pause(EntityDismountEvent event){handleEvent(event);}
	@EventHandler(priority = EventPriority.HIGH)
	private void pause(EntityMountEvent event){handleEvent(event);}

	
	private void handleEvent(Object event){
		if((event instanceof Cancellable) && !(event instanceof ServerCommandEvent) && !(event instanceof PlayerChatEvent) && !(event instanceof AsyncPlayerChatEvent)){
			Cancellable c = (Cancellable) event;
			if(jw.isPauseServer()){
				if(event instanceof PlayerCommandPreprocessEvent) {
					PlayerCommandPreprocessEvent preprocessEvent = (PlayerCommandPreprocessEvent) event;
					if(preprocessEvent.getMessage().equals("/pause")
							|| preprocessEvent.getMessage().equals("/pausar")
							|| preprocessEvent.getMessage().equals("/despausar")
							|| preprocessEvent.getMessage().equals("/resume")){
						return;
					}
				}

				if(event instanceof PlayerMoveEvent) {
					PlayerMoveEvent moveEvent = (PlayerMoveEvent) event;
					Location from = moveEvent.getFrom();
					Location to = moveEvent.getTo();

					int fromX = from.getBlockX();
					int fromY = from.getBlockY();
					int fromZ = from.getBlockZ();

					int toX = to.getBlockX();
					int toY = to.getBlockY();
					int toZ = to.getBlockZ();

					if(fromX == toX && fromY == toY && fromZ == toZ){
						return;
					}
				}

				c.setCancelled(true);
			}
		}
	}
	
	/*/PAUSEGAME*/
}
