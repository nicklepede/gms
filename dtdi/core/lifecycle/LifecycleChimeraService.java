package com.google.android.gms.dtdi.core.lifecycle;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.os.IBinder;
import android.os.Looper;
import com.google.android.chimera.Service;
import com.google.android.gms.chimera.modules.dtdi.AppContextProvider;
import com.google.android.gms.dtdi.core.database.appcapabilitiesmatching.AppCapabilitiesMatchingDatabase;
import com.google.android.gms.dtdi.core.lifecycle.LifecycleChimeraService;
import com.google.android.gms.nearby.presence.PresenceAction;
import defpackage.atzb;
import defpackage.aupz;
import defpackage.ausn;
import defpackage.auub;
import defpackage.baey;
import defpackage.bafq;
import defpackage.bahj;
import defpackage.bahs;
import defpackage.baht;
import defpackage.bahu;
import defpackage.bahy;
import defpackage.baie;
import defpackage.bain;
import defpackage.baip;
import defpackage.baiq;
import defpackage.bair;
import defpackage.baje;
import defpackage.bajj;
import defpackage.bajt;
import defpackage.bake;
import defpackage.baok;
import defpackage.baow;
import defpackage.bapq;
import defpackage.bapt;
import defpackage.baqj;
import defpackage.bard;
import defpackage.bare;
import defpackage.basr;
import defpackage.bass;
import defpackage.batc;
import defpackage.batm;
import defpackage.batx;
import defpackage.baua;
import defpackage.bauc;
import defpackage.baug;
import defpackage.baui;
import defpackage.baul;
import defpackage.bauo;
import defpackage.bave;
import defpackage.bavg;
import defpackage.bavj;
import defpackage.bavl;
import defpackage.bavo;
import defpackage.bawi;
import defpackage.bawo;
import defpackage.bawq;
import defpackage.bawu;
import defpackage.baww;
import defpackage.bbbm;
import defpackage.bbbo;
import defpackage.bbbr;
import defpackage.bbcf;
import defpackage.bbde;
import defpackage.bbdh;
import defpackage.bbdk;
import defpackage.bbdm;
import defpackage.bbes;
import defpackage.bbhb;
import defpackage.bbhd;
import defpackage.bbhm;
import defpackage.bbhr;
import defpackage.bbhs;
import defpackage.bbht;
import defpackage.bbhu;
import defpackage.bbhw;
import defpackage.bbhx;
import defpackage.bbhy;
import defpackage.bbjn;
import defpackage.bbjo;
import defpackage.bbjs;
import defpackage.bjmq;
import defpackage.btlh;
import defpackage.cmsr;
import defpackage.fhbp;
import defpackage.fqbu;
import defpackage.fxsr;
import defpackage.fxxm;
import defpackage.fyfr;
import defpackage.qgp;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes4.dex */
public final class LifecycleChimeraService extends Service {
    public static final ausn a = baey.a("LifecycleService");
    public final bbbr b;
    public final bbes c;
    public bbbr d;
    public final bbbm e;
    public volatile boolean f;
    public bjmq g;
    private boolean h;

    public LifecycleChimeraService() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    @Override // com.google.android.chimera.Service
    protected final void dump(FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        baqj baqjVar;
        bake bakeVar;
        bbhx bbhxVar;
        bbdm bbdmVar;
        bapt baptVar;
        baht bahtVar;
        bahu bahuVar;
        bass bassVar;
        if (printWriter == null) {
            return;
        }
        bbbo bbboVar = !auub.c() ? new bbbo(1, "Requires platform version O") : new bbbo();
        printWriter.println("Eligibility status: code=" + bbboVar.a + " reason=" + bbboVar.b);
        boolean z = this.f;
        StringBuilder sb = new StringBuilder("delegatesInitialized: ");
        sb.append(z);
        printWriter.println(sb.toString());
        if (bavo.c()) {
            printWriter.println("***** DTDI Flags *****");
            printWriter.println("Analytics Flags: ");
            printWriter.println("  dtdiUserType: " + baua.c());
            boolean z2 = bavl.c;
            baua.B();
            if (bavo.a() && !bavl.b) {
                throw new IllegalStateException("Analytics.gmsCoreLoggerDtdiPseudonymousConfig referenced before Initializer.ensureAllFlagsRead() called.");
            }
            btlh b = baua.b();
            Objects.toString(b);
            printWriter.println("  gmsCoreLoggerDtdiPseudonymousConfig: ".concat(String.valueOf(b)));
            printWriter.println("AppCapabilitiesMatching Flags: ");
            printWriter.println("  appCapabilitiesRequestTimeoutMs: " + bauc.b());
            printWriter.println("CallTransfer Flags: ");
            boolean z3 = bavl.c;
            baug.B();
            if (bavo.a() && !bavl.b) {
                throw new IllegalStateException("CallTransfer.telecomMetadataDelegateAvailable referenced before Initializer.ensureAllFlagsRead() called.");
            }
            printWriter.println("  telecomMetadataDelegateAvailable: " + baug.c());
            printWriter.println("  outputSwitcherUseDynamicColors: " + baug.d());
            printWriter.println("  overrideTidepool: " + baug.e());
            fqbu.c();
            printWriter.println("Cast Flags: ");
            printWriter.println("  internalPrerelease: " + baui.b());
            printWriter.println("ContextSync Flags: ");
            boolean z4 = bavl.c;
            baul.B();
            if (bavo.a() && !bavl.b) {
                throw new IllegalStateException("ContextSync.checkDeviceConnected referenced before Initializer.ensureAllFlagsRead() called.");
            }
            printWriter.println("  checkDeviceConnected: " + baul.a());
            printWriter.println("  restoreSendingMessages: " + baul.c());
            printWriter.println("DeviceDiscovery Flags: ");
            printWriter.println("  enableDeduplicationHint: " + bauo.c());
            boolean z5 = bavl.c;
            bauo.B();
            if (bavo.a() && !bavl.b) {
                throw new IllegalStateException("DeviceDiscovery.outputSwitcherDeviceConnectionTimeoutDuration referenced before Initializer.ensureAllFlagsRead() called.");
            }
            printWriter.println("  outputSwitcherDeviceConnectionTimeoutDuration: " + bauo.b());
            printWriter.println("DirectDeviceAccess Flags: ");
            printWriter.println("Dtdi Flags: ");
            printWriter.println("  doNotReleaseSkipFilteringIfNoMetadataPresentInCredential: " + bave.t());
            printWriter.println("  wakeupRequestTimeoutMs: " + bave.A());
            printWriter.println("  initTtcOnBgThreadPhase2: " + bave.v());
            printWriter.println("  ddaApiThrottlingGlobalRatePerMinute: " + bave.q());
            printWriter.println("  devicePickerDismissAfterApprovalMs: " + bave.r());
            boolean z6 = bavl.c;
            bave.B();
            if (bavo.a() && !bavl.b) {
                throw new IllegalStateException("Dtdi.handleSpotifyStreamExpansion referenced before Initializer.ensureAllFlagsRead() called.");
            }
            printWriter.println("  handleSpotifyStreamExpansion: " + bave.g());
            boolean z7 = bavl.c;
            bave.B();
            if (bavo.a() && !bavl.b) {
                throw new IllegalStateException("Dtdi.useRouteListingPreferenceForDestinationRoute referenced before Initializer.ensureAllFlagsRead() called.");
            }
            printWriter.println("  useRouteListingPreferenceForDestinationRoute: " + bave.n());
            printWriter.println("  useBc25Styling: " + bave.x());
            boolean z8 = bavl.c;
            bave.B();
            if (bavo.a() && !bavl.b) {
                throw new IllegalStateException("Dtdi.useNewAdvertisingManager referenced before Initializer.ensureAllFlagsRead() called.");
            }
            printWriter.println("  useNewAdvertisingManager: " + bave.k());
            printWriter.println("  useNewAdvertisingManagerWithStateflowChanges: " + bave.y());
            printWriter.println("  optimizeTtcDiscovery: " + bave.w());
            printWriter.println("  enableDirectConnectToService: " + bave.u());
            printWriter.println("  useNewDiscoveryManager: " + bave.z());
            printWriter.println("  disableAutomaticBandwidthUpgrade: " + bave.s());
            fhbp p = bave.p();
            Objects.toString(p);
            printWriter.println("  automaticBandwidthUpgradeAllowlist: ".concat(String.valueOf(p)));
            printWriter.println("FastInit Flags: ");
            printWriter.println("  prerelease: " + bavg.b());
            printWriter.println("FoyerConfigFeature Flags: ");
            boolean z9 = bavl.c;
            bavj.B();
            if (bavo.a() && !bavl.b) {
                throw new IllegalStateException("FoyerConfigFeature.foyerUrl referenced before Initializer.ensureAllFlagsRead() called.");
            }
            printWriter.println("  foyerUrl: ".concat(String.valueOf(bavj.a())));
            boolean z10 = bavl.c;
            bavj.B();
            if (bavo.a() && !bavl.b) {
                throw new IllegalStateException("FoyerConfigFeature.homeGraphScope referenced before Initializer.ensureAllFlagsRead() called.");
            }
            printWriter.println("  homeGraphScope: ".concat(String.valueOf(bavj.b())));
            printWriter.println("Lifecycle Flags: ");
            printWriter.println("  debugCrashOnUninitializedFlags: " + bavo.a());
            printWriter.println("  dumpFlagValues: " + bavo.c());
            printWriter.println("MediaTransfer Flags: ");
            printWriter.println("  logDebugMessages: " + bawi.v());
            printWriter.println("  moveCoolDownMillis: " + bawi.x());
            printWriter.println("  includePerformanceLogs: " + bawi.u());
            printWriter.println("  optInMaxMediaRoutes: " + bawi.z());
            printWriter.println("  optInDismissToDisableMin: " + bawi.y());
            printWriter.println("  receiverModelName: ".concat(String.valueOf(bawi.C())));
            boolean z11 = bavl.c;
            bawi.B();
            if (bavo.a() && !bavl.b) {
                throw new IllegalStateException("MediaTransfer.isTablet referenced before Initializer.ensureAllFlagsRead() called.");
            }
            printWriter.println("  isTablet: " + bawi.s());
            boolean z12 = bavl.c;
            bawi.B();
            if (bavo.a() && !bavl.b) {
                throw new IllegalStateException("MediaTransfer.doNotReleaseCrashOnIllegalState referenced before Initializer.ensureAllFlagsRead() called.");
            }
            printWriter.println("  doNotReleaseCrashOnIllegalState: " + bawi.a());
            boolean z13 = bavl.c;
            bawi.B();
            if (bavo.a() && !bavl.b) {
                throw new IllegalStateException("MediaTransfer.routerScanIntervalMillis referenced before Initializer.ensureAllFlagsRead() called.");
            }
            printWriter.println("  routerScanIntervalMillis: " + bawi.o());
            boolean z14 = bavl.c;
            bawi.B();
            if (bavo.a() && !bavl.b) {
                throw new IllegalStateException("MediaTransfer.routerScanDurationMillis referenced before Initializer.ensureAllFlagsRead() called.");
            }
            printWriter.println("  routerScanDurationMillis: " + bawi.n());
            printWriter.println("  doNotReleaseSupportNonPixelPhones: " + bawi.t());
            boolean z15 = bavl.c;
            bawi.B();
            if (bavo.a() && !bavl.b) {
                throw new IllegalStateException("MediaTransfer.inactiveMediaStatePropagationDelayMillis referenced before Initializer.ensureAllFlagsRead() called.");
            }
            printWriter.println("  inactiveMediaStatePropagationDelayMillis: " + bawi.c());
            printWriter.println("  retryDelayMillis: " + bawi.D());
            boolean z16 = bavl.c;
            bawi.B();
            if (bavo.a() && !bavl.b) {
                throw new IllegalStateException("MediaTransfer.undoButtonDelayMillis referenced before Initializer.ensureAllFlagsRead() called.");
            }
            printWriter.println("  undoButtonDelayMillis: " + bawi.r());
            boolean z17 = bavl.c;
            bawi.B();
            if (bavo.a() && !bavl.b) {
                throw new IllegalStateException("MediaTransfer.transferTimeoutDelayMillis referenced before Initializer.ensureAllFlagsRead() called.");
            }
            printWriter.println("  transferTimeoutDelayMillis: " + bawi.q());
            boolean z18 = bavl.c;
            bawi.B();
            if (bavo.a() && !bavl.b) {
                throw new IllegalStateException("MediaTransfer.overallInactiveMediaStatePropagationDelayMillis referenced before Initializer.ensureAllFlagsRead() called.");
            }
            printWriter.println("  overallInactiveMediaStatePropagationDelayMillis: " + bawi.j());
            printWriter.println("  maxCachedOnBehalfOfLoggers: " + bawi.w());
            printWriter.println("  packageNameEligibilityCacheExpirationMillis: " + bawi.A());
            boolean z19 = bavl.c;
            bawi.B();
            if (bavo.a() && !bavl.b) {
                throw new IllegalStateException("MediaTransfer.skipMatchingNotCastingStates referenced before Initializer.ensureAllFlagsRead() called.");
            }
            printWriter.println("  skipMatchingNotCastingStates: " + bawi.p());
            printWriter.println("SecureConnections Flags: ");
            printWriter.println("  payloadTrackerCrashOnCacheEviction: " + bawo.h());
            printWriter.println("  specifyPayloadUrgency: " + bawo.i());
            printWriter.println("  enableBandwidthUpgrades: " + bawo.f());
            printWriter.println("  ncOutgoingConnectionRetryAttempts: " + bawo.g());
            boolean z20 = bavl.c;
            bawo.B();
            if (bavo.a() && !bavl.b) {
                throw new IllegalStateException("SecureConnections.ncOutgoingConnectionRetryIntervalMillis referenced before Initializer.ensureAllFlagsRead() called.");
            }
            printWriter.println("  ncOutgoingConnectionRetryIntervalMillis: " + bawo.c());
            printWriter.println("Settings Flags: ");
            printWriter.println("  handleTidepoolSequenceNumber: " + bawq.b());
            printWriter.println("SpatialOrchestration Flags: ");
            printWriter.println("  overrideDockState: " + bawu.f());
            printWriter.println("  forceStartAdvertising: " + bawu.d());
            printWriter.println("  forceStartDiscovery: " + bawu.e());
            printWriter.println("Wakeup Flags: ");
            printWriter.println("  throwOperationExceptionOnFailure: " + baww.b());
            printWriter.println("***** END DTDI Flags *****");
        }
        printWriter.println("Delegate eligibility:");
        bbbo a2 = bbhd.a();
        Objects.toString(a2);
        printWriter.println("  apiGateway=".concat(a2.toString()));
        bbbo a3 = bbhb.a();
        Objects.toString(a3);
        printWriter.println("  advsettings=".concat(a3.toString()));
        bbbo a4 = bbhu.a(this);
        Objects.toString(a4);
        printWriter.println("  sync=".concat(a4.toString()));
        bbbo a5 = bbhu.a(this);
        Objects.toString(a5);
        printWriter.println("  orchestration=".concat(a5.toString()));
        bbbo a6 = bbhu.a(this);
        Objects.toString(a6);
        printWriter.println("  mt=".concat(a6.toString()));
        bbbo a7 = bbjs.a(this);
        Objects.toString(a7);
        printWriter.println("  receiver=".concat(a7.toString()));
        bbbo a8 = bbhw.a();
        Objects.toString(a8);
        printWriter.println("  settings=".concat(a8.toString()));
        Set set = bbjo.e;
        bbbo a9 = bbjn.a();
        Objects.toString(a9);
        printWriter.println("  calltransfer=".concat(a9.toString()));
        bbbo a10 = bbhu.a(this);
        Objects.toString(a10);
        printWriter.println("  mediaTransferSettings=".concat(a10.toString()));
        int i = bare.m;
        bbbo a11 = bard.a();
        Objects.toString(a11);
        printWriter.println("  directDeviceAccess=".concat(a11.toString()));
        bbbo a12 = batx.a();
        Objects.toString(a12);
        printWriter.println("  fastInit=".concat(a12.toString()));
        qgp qgpVar = bake.i;
        bbbo a13 = bajt.a();
        Objects.toString(a13);
        printWriter.println("  appCapabilitiesMatching=".concat(a13.toString()));
        bbes bbesVar = this.c;
        if (bbesVar != null) {
            printWriter.println("ready: " + bbesVar.c.get());
        }
        bbbr bbbrVar = this.d;
        if (bbbrVar != null && (bassVar = bbbrVar.w) != null) {
            batm b2 = bassVar.b();
            printWriter.println("DiscoveryManager");
            batc batcVar = ((basr) b2).b;
            printWriter.println("  Proxy: NearbyPresence");
            Integer num = batcVar.j;
            printWriter.println("  discoveryStatus=".concat(num == null ? "null" : cmsr.a(num.intValue())));
        }
        bbbr bbbrVar2 = this.d;
        if (bbbrVar2 != null && (bahuVar = bbbrVar2.x) != null) {
            baip a14 = bahuVar.a();
            printWriter.println("AdvertisingManager");
            bahj bahjVar = (bahj) a14;
            baie baieVar = bahjVar.a;
            printWriter.println("  NearbyPresenceAdvertiser");
            Map map = baieVar.a;
            for (bair bairVar : map.keySet()) {
                bahy bahyVar = (bahy) map.get(bairVar);
                boolean z21 = false;
                boolean z22 = (bahyVar != null ? bahyVar.a : null) == null;
                boolean z23 = (bahyVar != null ? bahyVar.b : null) == null;
                if ((bahyVar != null ? bahyVar.c : null) == null) {
                    z21 = true;
                }
                printWriter.println("  .   configuration: " + bairVar + " private=" + z22 + " contacts=" + z23 + " public=" + z21);
            }
            printWriter.println("Connection");
            bahjVar.b.a().A(printWriter);
        }
        bbbr bbbrVar3 = this.d;
        if (bbbrVar3 != null && (bahtVar = bbbrVar3.y) != null) {
            baiq a15 = bahtVar.a();
            printWriter.println("AdvertisingManager");
            bahs bahsVar = (bahs) a15;
            bain bainVar = bahsVar.b;
            printWriter.println("  Proxy: NearbyPresence");
            AtomicBoolean atomicBoolean = bainVar.b;
            Objects.toString(atomicBoolean);
            printWriter.println("  isAdvertisingCallTransfer=".concat(String.valueOf(atomicBoolean)));
            AtomicBoolean atomicBoolean2 = bainVar.c;
            Objects.toString(atomicBoolean2);
            printWriter.println("  isAdvertisingSdk=".concat(String.valueOf(atomicBoolean2)));
            AtomicBoolean atomicBoolean3 = bainVar.d;
            Objects.toString(atomicBoolean3);
            printWriter.println("  isAdvertisingSdkContacts=".concat(String.valueOf(atomicBoolean3)));
            AtomicBoolean atomicBoolean4 = bainVar.e;
            Objects.toString(atomicBoolean4);
            printWriter.println("  isAdvertisingMediaTransfer=".concat(String.valueOf(atomicBoolean4)));
            printWriter.println("  callTransferBroadcastStatus=".concat(bain.e(bainVar.f)));
            printWriter.println("  sdkBroadcastStatus=".concat(bain.e(bainVar.g)));
            printWriter.println("  sdkContactsBroadcastStatus=".concat(bain.e(bainVar.h)));
            printWriter.println("  mediaTransferBroadcastStatus=".concat(bain.e(bainVar.i)));
            printWriter.println("Connection");
            bahsVar.c.a().A(printWriter);
        }
        bbbr bbbrVar4 = this.d;
        if (bbbrVar4 != null && (baptVar = bbbrVar4.c) != null) {
            baow b3 = ((bapq) baptVar).b();
            printWriter.println("Registry");
            Iterator it = b3.d.entrySet().iterator();
            while (it.hasNext()) {
                printWriter.println("  senderType=" + ((Number) ((Map.Entry) it.next()).getKey()).intValue());
            }
        }
        bbbr bbbrVar5 = this.d;
        if (bbbrVar5 != null && (bbdmVar = bbbrVar5.b) != null) {
            printWriter.println("OrchestrationController");
            bbdh bbdhVar = (bbdh) bbdmVar;
            bbde bbdeVar = bbdhVar.c;
            printWriter.println("  isListeningForEvents=" + bbdeVar.l);
            if (bawi.v()) {
                for (Map.Entry entry : bbdeVar.m.entrySet()) {
                    long longValue = ((Number) entry.getKey()).longValue();
                    boolean i2 = bbde.i(((bbdk) entry.getValue()).a);
                    List i3 = ((bbdk) entry.getValue()).a.i();
                    fxxm.e(i3, "getActions(...)");
                    ArrayList arrayList = new ArrayList(fxsr.o(i3, 10));
                    Iterator it2 = i3.iterator();
                    while (it2.hasNext()) {
                        arrayList.add(Integer.valueOf(((PresenceAction) it2.next()).a));
                    }
                    printWriter.println("  lastEvent [deviceId=" + longValue + " actions=" + arrayList + " hasMediaTransferAction=" + i2 + "]");
                }
            }
            baok baokVar = bbdeVar.e;
            if (baokVar != null) {
                printWriter.println("  ContextSyncController");
                printWriter.println("    isRegisteredForMediaStateLocalUpdates=" + baokVar.e);
            }
            bbcf bbcfVar = bbdhVar.b;
            printWriter.println("  AdvertisingController");
            printWriter.println("    isAdvertising: " + bbcfVar.l);
            fyfr fyfrVar = bbcfVar.m;
            Objects.toString(fyfrVar);
            printWriter.println("    advertisingJob: ".concat(String.valueOf(fyfrVar)));
            printWriter.println("    isEligibleTablet: " + bbcfVar.i.a(bbcfVar.b, bbcfVar.c));
        }
        bbbr bbbrVar6 = this.d;
        if (bbbrVar6 != null && (bbhxVar = bbbrVar6.h) != null) {
            printWriter.println("  TidepoolSettingsSubDelegate");
            bafq bafqVar = bbhxVar.a.c;
            printWriter.println("      CrossDeviceState: ".concat(bbht.a(bbhs.a((bbht) bafqVar.b.b()))));
            bbhr bbhrVar = (bbhr) bafqVar.c.b();
            printWriter.println("      CallTransferState: ".concat(bbhr.a(bbhrVar == null ? -1 : bbhrVar.a)));
            bbhm bbhmVar = bbhxVar.b;
            printWriter.println("  NearbyShareSettingsSubDelegate");
            printWriter.println("      NearbyShareVisibility: ".concat(bbhy.b(((bbhy) bbhmVar.c.d.b()).a)));
        }
        bbbr bbbrVar7 = this.d;
        if (bbbrVar7 != null && bbbrVar7.i != null) {
            printWriter.println("CallTransferLifecycleDelegateImpl");
        }
        bbbr bbbrVar8 = this.d;
        if (bbbrVar8 != null && (bakeVar = bbbrVar8.l) != null) {
            printWriter.println("AppCapabilitiesMatchingLifecycleDelegateImpl");
            printWriter.println("AppCapabilitiesRequestController");
            printWriter.println("  ongoingRequests:");
            for (Object obj : ((baje) bakeVar).d.d.keySet()) {
                fxxm.e(obj, "next(...)");
                bajj bajjVar = (bajj) obj;
                printWriter.println("    request [id=" + bajjVar.a + ", targetDevice=" + bajjVar.b + "]");
            }
        }
        bbbr bbbrVar9 = this.d;
        if (bbbrVar9 == null || (baqjVar = bbbrVar9.n) == null) {
            return;
        }
        baqjVar.l(printWriter);
    }

    @Override // com.google.android.chimera.Service
    public final IBinder onBind(Intent intent) {
        if (intent != null) {
            intent.getAction();
        }
        if (auub.c()) {
            atzb.h("Threading violation; must be called on main thread");
            if (fxxm.n(intent != null ? intent.getAction() : null, "com.google.android.gms.dtdi.core.lifecycle.action.BIND_PERSISTENT")) {
                return this.c.d;
            }
        }
        return null;
    }

    @Override // com.google.android.chimera.Service
    public final void onCreate() {
        Context a2;
        super.onCreate();
        if (auub.c() && (a2 = AppContextProvider.a()) != null) {
            this.g = new bjmq(a2, getClass(), 7, "LifecycleChimeraService");
        }
    }

    @Override // com.google.android.chimera.Service
    public final int onStartCommand(Intent intent, int i, int i2) {
        if (!auub.c()) {
            stopSelf(i2);
            return 2;
        }
        if (!this.h) {
            this.h = true;
            new aupz(1, 9).submit(new Runnable() { // from class: bbbn
                @Override // java.lang.Runnable
                public final void run() {
                    eixs eixsVar;
                    Throwable th;
                    bbbm bbbmVar;
                    eixb d;
                    fxuv fxuvVar;
                    fxuv fxuvVar2;
                    fxuv fxuvVar3;
                    fxuv fxuvVar4;
                    fxuv fxuvVar5;
                    banu banuVar;
                    LifecycleChimeraService lifecycleChimeraService;
                    bafq bafqVar;
                    fxuv fxuvVar6;
                    bamf bamfVar;
                    bass bassVar;
                    basw baswVar;
                    bahu bahuVar;
                    baht bahtVar;
                    bbij bbijVar;
                    baqj baqjVar;
                    bass bassVar2;
                    bamf bamfVar2;
                    bbbt bbbtVar;
                    LifecycleChimeraService lifecycleChimeraService2;
                    int i3;
                    fxuv fxuvVar7;
                    bafq bafqVar2;
                    bbhe bbheVar;
                    bbhc bbhcVar;
                    bapt baptVar;
                    bafq bafqVar3;
                    fxuv fxuvVar8;
                    bbhx bbhxVar;
                    bbjt bbjtVar;
                    eixs eixsVar2;
                    Throwable th2;
                    Context applicationContext;
                    baqj baqjVar2;
                    fyea b;
                    PackageManager packageManager;
                    LifecycleChimeraService lifecycleChimeraService3;
                    bahu bahuVar2;
                    baht bahtVar2;
                    bass bassVar3;
                    baqj baqjVar3;
                    basw baswVar2;
                    bbdh bbdhVar;
                    bbjt bbjtVar2;
                    batr batrVar;
                    bbkf bbkfVar;
                    bbhv bbhvVar;
                    bass bassVar4;
                    banu banuVar2;
                    fxuv fxuvVar9;
                    bare bareVar;
                    bare bareVar2;
                    bbjo bbjoVar;
                    bbhe bbheVar2;
                    bbbp bbbpVar;
                    baqj baqjVar4;
                    bbhv bbhvVar2;
                    bamf bamfVar3;
                    bbhc bbhcVar2;
                    bake bakeVar;
                    int i4;
                    bafh bafhVar;
                    eixb eixbVar;
                    eixb eixbVar2;
                    bapu v;
                    PackageManager packageManager2;
                    bajp bajpVar;
                    baqj baqjVar5;
                    badu a2;
                    badr badrVar;
                    bbhe bbheVar3;
                    bbij bbijVar2;
                    LifecycleChimeraService lifecycleChimeraService4;
                    ((eluo) LifecycleChimeraService.a.h()).x("Initializing lifecycle service");
                    LifecycleChimeraService lifecycleChimeraService5 = LifecycleChimeraService.this;
                    bjmq bjmqVar = lifecycleChimeraService5.g;
                    eixs k = bjmqVar != null ? bjmqVar.k("ensureAllFlagsRead") : null;
                    try {
                        bavk bavkVar = bavl.a;
                        if (!bavl.b) {
                            synchronized (bavkVar) {
                                if (!bavl.b) {
                                    fqbk.a.lK().c();
                                    baua.a();
                                    baua.b();
                                    fqbo.a.lK().b();
                                    bauc.a();
                                    fqbr.a.lK().d();
                                    baug.c();
                                    baug.a();
                                    baug.b();
                                    fqbu.c();
                                    fqbw.a.lK().b();
                                    baui.a();
                                    fqbz.a.lK().c();
                                    baul.a();
                                    baul.b();
                                    fqcc.a.lK().c();
                                    bauo.a();
                                    bauo.b();
                                    fqcf.a.lK().a();
                                    fqci.a.lK().p();
                                    bave.e();
                                    bave.o();
                                    bave.h();
                                    bave.b();
                                    bave.c();
                                    bave.g();
                                    bave.n();
                                    bave.j();
                                    bave.k();
                                    bave.l();
                                    bave.i();
                                    bave.f();
                                    bave.m();
                                    bave.d();
                                    bave.a();
                                    fqcm.a.lK().b();
                                    bavg.a();
                                    fqcp.a.lK().c();
                                    bavj.a();
                                    bavj.b();
                                    fqcs.a.lK().c();
                                    bavo.a();
                                    bavo.b();
                                    fqcv.a.lK().t();
                                    bawi.e();
                                    bawi.g();
                                    bawi.d();
                                    bawi.i();
                                    bawi.h();
                                    bawi.l();
                                    bawi.s();
                                    bawi.a();
                                    bawi.o();
                                    bawi.n();
                                    bawi.b();
                                    bawi.c();
                                    bawi.m();
                                    bawi.r();
                                    bawi.q();
                                    bawi.j();
                                    bawi.f();
                                    bawi.k();
                                    bawi.p();
                                    fqcy.a.lK().f();
                                    bawo.d();
                                    bawo.e();
                                    bawo.a();
                                    bawo.b();
                                    bawo.c();
                                    fqdb.a.lK().b();
                                    bawq.a();
                                    fqde.a.lK().d();
                                    bawu.c();
                                    bawu.a();
                                    bawu.b();
                                    fqdh.a.lK().b();
                                    baww.a();
                                    bavl.b = true;
                                }
                            }
                        }
                        fxvy.a(k, null);
                        bbbr bbbrVar = lifecycleChimeraService5.b;
                        fxxm.f(bbbrVar, "testOverridesComponentContainer");
                        bjmq bjmqVar2 = lifecycleChimeraService5.g;
                        eixs k2 = bjmqVar2 != null ? bjmqVar2.k("setupComponentContainerWithSeeds") : null;
                        try {
                            bbbmVar = lifecycleChimeraService5.e;
                            fxxm.f(bbbrVar, "overrideComponentContainer");
                            fxuv fxuvVar10 = bbbrVar.p;
                            if (fxuvVar10 == null) {
                                try {
                                    d = eizp.d("initMainCoroutineContext", eizq.a);
                                    try {
                                        ausn ausnVar = baew.a;
                                        fxuv a3 = baew.a(5);
                                        fxvy.a(d, null);
                                        fxuvVar = a3;
                                    } finally {
                                    }
                                } catch (Throwable th3) {
                                    th = th3;
                                    eixsVar = k2;
                                    try {
                                        throw th;
                                    } catch (Throwable th4) {
                                        fxvy.a(eixsVar, th);
                                        throw th4;
                                    }
                                }
                            } else {
                                fxuvVar = fxuvVar10;
                            }
                            fxuv fxuvVar11 = bbbrVar.p;
                            if (fxuvVar11 == null) {
                                d = eizp.d("initMainCoroutineContextWithJob", eizq.a);
                                try {
                                    fxuv a4 = baex.a(fxuvVar);
                                    fxvy.a(d, null);
                                    fxuvVar11 = a4;
                                } finally {
                                    try {
                                        throw th;
                                    } finally {
                                    }
                                }
                            }
                            fxuv fxuvVar12 = bbbrVar.q;
                            if (fxuvVar12 == null) {
                                d = eizp.d("initHighSpeedCoroutineContext", eizq.a);
                                try {
                                    ausn ausnVar2 = baew.a;
                                    fxuv a5 = baew.a(2);
                                    fxvy.a(d, null);
                                    fxuvVar2 = a5;
                                } finally {
                                    try {
                                        throw th;
                                    } finally {
                                    }
                                }
                            } else {
                                fxuvVar2 = fxuvVar12;
                            }
                            fxuv fxuvVar13 = bbbrVar.q;
                            if (fxuvVar13 == null) {
                                d = eizp.d("initHighSpeedCoroutineWithJobContext", eizq.a);
                                try {
                                    fxuv a6 = baex.a(fxuvVar2);
                                    fxvy.a(d, null);
                                    fxuvVar3 = a6;
                                } finally {
                                    try {
                                        throw th;
                                    } finally {
                                    }
                                }
                            } else {
                                fxuvVar3 = fxuvVar13;
                            }
                            fxuv fxuvVar14 = bbbrVar.s;
                            if (fxuvVar14 == null) {
                                d = eizp.d("initIOCoroutineContext", eizq.a);
                                try {
                                    ausn ausnVar3 = baew.a;
                                    fxuv a7 = baew.a(3);
                                    fxvy.a(d, null);
                                    fxuvVar4 = a7;
                                } finally {
                                    try {
                                        throw th;
                                    } finally {
                                    }
                                }
                            } else {
                                fxuvVar4 = fxuvVar14;
                            }
                            baqj baqjVar6 = bbbrVar.n;
                            if (baqjVar6 == null) {
                                d = eizp.d("initDeviceMap", eizq.a);
                                try {
                                    baqe baqeVar = new baqe();
                                    fxvy.a(d, null);
                                    baqjVar6 = baqeVar;
                                } finally {
                                    try {
                                        throw th;
                                    } finally {
                                    }
                                }
                            }
                            bafq bafqVar4 = bbbrVar.r;
                            if (bafqVar4 == null) {
                                d = eizp.d("initStateManager", eizq.a);
                                try {
                                    bafq bafqVar5 = new bafq();
                                    fxvy.a(d, null);
                                    bafqVar4 = bafqVar5;
                                } finally {
                                    try {
                                        throw th;
                                    } finally {
                                    }
                                }
                            }
                            bbbt bbbtVar2 = bbbrVar.m;
                            if (bbbtVar2 == null) {
                                d = eizp.d("initNPClientProvider", eizq.a);
                                try {
                                    bbbt bbbtVar3 = new bbbt(lifecycleChimeraService5);
                                    fxvy.a(d, null);
                                    bbbtVar2 = bbbtVar3;
                                } finally {
                                    try {
                                        throw th;
                                    } finally {
                                    }
                                }
                            }
                            banu banuVar3 = bbbrVar.t;
                            if (banuVar3 == null) {
                                d = eizp.d("initDdaApiThrottler", eizq.a);
                                try {
                                    fyea b2 = baex.b(fxuvVar4);
                                    Context applicationContext2 = lifecycleChimeraService5.getApplicationContext();
                                    fxxm.e(applicationContext2, "getApplicationContext(...)");
                                    bakh bakhVar = new bakh(qfj.THROTTLE_TYPE_GLOBAL_DDA_THROTTLE, new baky(applicationContext2, b2, 14), b2);
                                    fxuvVar5 = fxuvVar11;
                                    banu banuVar4 = new banu(new banr(bave.q(), new dpvs()), bakhVar);
                                    fxvy.a(d, null);
                                    banuVar = banuVar4;
                                } finally {
                                    try {
                                        throw th;
                                    } finally {
                                    }
                                }
                            } else {
                                fxuvVar5 = fxuvVar11;
                                banuVar = banuVar3;
                            }
                            bbij bbijVar3 = bbbrVar.z;
                            if (bbijVar3 == null) {
                                d = eizp.d("initWakeupManagerProvider", eizq.a);
                                try {
                                    Context applicationContext3 = lifecycleChimeraService5.getApplicationContext();
                                    fxxm.e(applicationContext3, "getApplicationContext(...)");
                                    bbij bbijVar4 = new bbij(applicationContext3, bafqVar4, baex.b(fxuvVar2), applicationContext3.getPackageManager());
                                    fxvy.a(d, null);
                                    bbijVar3 = bbijVar4;
                                } finally {
                                    try {
                                        throw th;
                                    } finally {
                                    }
                                }
                            }
                            bamf bamfVar4 = bbbrVar.u;
                            if (bamfVar4 == null) {
                                d = eizp.d("initConnectionManagerProvider", eizq.a);
                                try {
                                    Context applicationContext4 = lifecycleChimeraService5.getApplicationContext();
                                    fxxm.e(applicationContext4, "getApplicationContext(...)");
                                    Context applicationContext5 = lifecycleChimeraService5.getApplicationContext();
                                    fxxm.e(applicationContext5, "getApplicationContext(...)");
                                    fxxm.f(applicationContext5, "context");
                                    lifecycleChimeraService = lifecycleChimeraService5;
                                    bafqVar = bafqVar4;
                                    fxuvVar6 = fxuvVar5;
                                    bamf bamfVar5 = new bamf(applicationContext4, new bano(new baky(applicationContext5, null, 30), new dpvs()), baqjVar6, bbijVar3);
                                    fxvy.a(d, null);
                                    bamfVar = bamfVar5;
                                } finally {
                                    try {
                                        throw th;
                                    } finally {
                                    }
                                }
                            } else {
                                lifecycleChimeraService = lifecycleChimeraService5;
                                bafqVar = bafqVar4;
                                fxuvVar6 = fxuvVar5;
                                bamfVar = bamfVar4;
                            }
                            bass bassVar5 = bbbrVar.w;
                            if (bassVar5 == null) {
                                d = eizp.d("initDiscoveryManagerLegacyProvider", eizq.a);
                                try {
                                    bass bassVar6 = new bass(baqjVar6, bbbtVar2, fxuvVar, fxuvVar2);
                                    fxvy.a(d, null);
                                    bassVar = bassVar6;
                                } finally {
                                    try {
                                        throw th;
                                    } finally {
                                    }
                                }
                            } else {
                                bassVar = bassVar5;
                            }
                            basw baswVar3 = bbbrVar.v;
                            if (baswVar3 != null) {
                                baswVar = baswVar3;
                            } else if (bave.z()) {
                                d = eizp.d("initDiscoveryManagerProvider", eizq.a);
                                try {
                                    basw baswVar4 = new basw(baqjVar6, bbbtVar2, baex.b(fxuvVar2));
                                    fxvy.a(d, null);
                                    baswVar = baswVar4;
                                } finally {
                                    try {
                                        throw th;
                                    } finally {
                                    }
                                }
                            } else {
                                baswVar = null;
                            }
                            bahu bahuVar3 = bbbrVar.x;
                            if (bahuVar3 != null) {
                                bahuVar = bahuVar3;
                            } else if (bave.y()) {
                                d = eizp.d("initAdvertisingManagerProvider", eizq.a);
                                try {
                                    bahu bahuVar4 = new bahu(bamfVar, bbbtVar2, baex.b(fxuvVar2));
                                    fxvy.a(d, null);
                                    bahuVar = bahuVar4;
                                } finally {
                                    try {
                                        throw th;
                                    } finally {
                                    }
                                }
                            } else {
                                bahuVar = null;
                            }
                            baht bahtVar3 = bbbrVar.y;
                            if (bahtVar3 == null) {
                                d = eizp.d("initAdvertisingManagerLegacyProvider", eizq.a);
                                try {
                                    baht bahtVar4 = new baht(bamfVar, bbbtVar2, fxuvVar2);
                                    fxvy.a(d, null);
                                    bahtVar = bahtVar4;
                                } finally {
                                    try {
                                        throw th;
                                    } finally {
                                    }
                                }
                            } else {
                                bahtVar = bahtVar3;
                            }
                            if (bbbmVar.a(bbhd.a())) {
                                eixb d2 = eizp.d("initPersistentLCDelegate", eizq.a);
                                try {
                                    bbhe bbheVar4 = bbbrVar.d;
                                    if (bbheVar4 == null) {
                                        try {
                                            bbbtVar = bbbtVar2;
                                            i3 = 3;
                                            bbijVar2 = bbijVar3;
                                            eixbVar2 = d2;
                                            lifecycleChimeraService4 = lifecycleChimeraService;
                                            fxuvVar7 = fxuvVar;
                                            bafqVar2 = bafqVar;
                                        } catch (Throwable th5) {
                                            th = th5;
                                            eixbVar2 = d2;
                                        }
                                        try {
                                            bbheVar3 = new bbeq(lifecycleChimeraService4, baqjVar6, bassVar, bamfVar, bbijVar2, baex.b(fxuvVar6), baex.b(fxuvVar3));
                                            lifecycleChimeraService2 = lifecycleChimeraService4;
                                            baqjVar = baqjVar6;
                                            bassVar2 = bassVar;
                                            bamfVar2 = bamfVar;
                                            bbijVar = bbijVar2;
                                        } catch (Throwable th6) {
                                            th = th6;
                                            try {
                                                throw th;
                                            } finally {
                                            }
                                        }
                                    } else {
                                        bbijVar = bbijVar3;
                                        eixbVar2 = d2;
                                        baqjVar = baqjVar6;
                                        bassVar2 = bassVar;
                                        bamfVar2 = bamfVar;
                                        bbbtVar = bbbtVar2;
                                        lifecycleChimeraService2 = lifecycleChimeraService;
                                        i3 = 3;
                                        fxuvVar7 = fxuvVar;
                                        bafqVar2 = bafqVar;
                                        bbheVar3 = bbheVar4;
                                    }
                                    fxvy.a(eixbVar2, null);
                                    bbheVar = bbheVar3;
                                } catch (Throwable th7) {
                                    th = th7;
                                    eixbVar2 = d2;
                                }
                            } else {
                                bbijVar = bbijVar3;
                                baqjVar = baqjVar6;
                                bassVar2 = bassVar;
                                bamfVar2 = bamfVar;
                                bbbtVar = bbbtVar2;
                                lifecycleChimeraService2 = lifecycleChimeraService;
                                i3 = 3;
                                fxuvVar7 = fxuvVar;
                                bafqVar2 = bafqVar;
                                bbheVar = null;
                            }
                            if (bbbmVar.a(bbhb.a())) {
                                d = eizp.d("initAdvertisingSettingsLCDelegate", eizq.a);
                                try {
                                    bbhc bbhcVar3 = bbbrVar.e;
                                    if (bbhcVar3 == null) {
                                        bbhcVar3 = new bbei(bahuVar, bahtVar, bafqVar2, baex.b(fxuvVar3));
                                    }
                                    fxvy.a(d, null);
                                    bbhcVar = bbhcVar3;
                                } finally {
                                    try {
                                        throw th;
                                    } finally {
                                    }
                                }
                            } else {
                                bbhcVar = null;
                            }
                            if (bbbmVar.a(bbhu.a(lifecycleChimeraService2))) {
                                d = eizp.d("initContextSyncLCDelegate", eizq.a);
                                try {
                                    bapt baptVar2 = bbbrVar.c;
                                    if (baptVar2 == null) {
                                        Context applicationContext6 = lifecycleChimeraService2.getApplicationContext();
                                        fxxm.e(applicationContext6, "getApplicationContext(...)");
                                        baptVar2 = new bapq(applicationContext6, baqjVar, bafqVar2, (baoz) baoz.a.a());
                                    }
                                    fxvy.a(d, null);
                                    baptVar = baptVar2;
                                } finally {
                                    try {
                                        throw th;
                                    } finally {
                                    }
                                }
                            } else {
                                baptVar = null;
                            }
                            if (bbbmVar.a(bbhw.a())) {
                                d = eizp.d("initSettingsLCDelegate", eizq.a);
                                try {
                                    bbhx bbhxVar2 = bbbrVar.h;
                                    if (bbhxVar2 == null) {
                                        Context applicationContext7 = lifecycleChimeraService2.getApplicationContext();
                                        fxxm.e(applicationContext7, "getApplicationContext(...)");
                                        bafq bafqVar6 = bafqVar2;
                                        fxuv fxuvVar15 = fxuvVar2;
                                        bbhxVar2 = new bbhx(applicationContext7, bafqVar6, fxuvVar15, new bbhp(applicationContext7, bafqVar2, bbhg.a, baex.b(fxuvVar2)), new bbhm(applicationContext7, bafqVar2, baex.b(fxuvVar2)));
                                        bafqVar3 = bafqVar6;
                                        fxuvVar8 = fxuvVar15;
                                    } else {
                                        bafqVar3 = bafqVar2;
                                        fxuvVar8 = fxuvVar2;
                                    }
                                    fxvy.a(d, null);
                                    bbhxVar = bbhxVar2;
                                } finally {
                                    try {
                                        throw th;
                                    } finally {
                                    }
                                }
                            } else {
                                bafqVar3 = bafqVar2;
                                fxuvVar8 = fxuvVar2;
                                bbhxVar = null;
                            }
                            if (bbbmVar.a(bbjs.a(lifecycleChimeraService2))) {
                                d = eizp.d("initCastReceiverLCDelegate", eizq.a);
                                try {
                                    bbjt bbjtVar3 = bbbrVar.g;
                                    if (bbjtVar3 == null) {
                                        Context applicationContext8 = lifecycleChimeraService2.getApplicationContext();
                                        fxxm.e(applicationContext8, "getApplicationContext(...)");
                                        bbjtVar3 = new bbjr(applicationContext8);
                                    }
                                    fxvy.a(d, null);
                                    bbjtVar = bbjtVar3;
                                } finally {
                                    try {
                                        throw th;
                                    } finally {
                                    }
                                }
                            } else {
                                bbjtVar = null;
                            }
                        } catch (Throwable th8) {
                            th = th8;
                            eixsVar = k2;
                        }
                        try {
                            if (bbbmVar.a(bbhu.a(lifecycleChimeraService2))) {
                                try {
                                    eixb d3 = eizp.d("initDockingStateProvider", eizq.a);
                                    try {
                                        batr batrVar2 = bbbrVar.o;
                                        if (batrVar2 == null) {
                                            try {
                                                batrVar2 = new batp(lifecycleChimeraService2);
                                            } catch (Throwable th9) {
                                                th2 = th9;
                                                eixsVar2 = k2;
                                                try {
                                                    throw th2;
                                                } catch (Throwable th10) {
                                                    fxvy.a(d3, th2);
                                                    throw th10;
                                                }
                                            }
                                        }
                                        batr batrVar3 = batrVar2;
                                        fxvy.a(d3, null);
                                        eixb d4 = eizp.d("initOrchestrationLCDelegate", eizq.a);
                                        try {
                                            applicationContext = lifecycleChimeraService2.getApplicationContext();
                                            fxxm.e(applicationContext, "getApplicationContext(...)");
                                            baqjVar2 = baqjVar;
                                            b = baex.b(fxuvVar7);
                                            packageManager = applicationContext.getPackageManager();
                                        } catch (Throwable th11) {
                                            th = th11;
                                            eixsVar2 = k2;
                                        }
                                        try {
                                            if (packageManager == null) {
                                                throw new IllegalStateException("Required value was null.");
                                            }
                                            bahu bahuVar5 = bahuVar;
                                            lifecycleChimeraService3 = lifecycleChimeraService2;
                                            baht bahtVar5 = bahtVar;
                                            bbcf bbcfVar = new bbcf(applicationContext, bahuVar5, bahtVar5, batrVar3, new bbch(packageManager), new bbcs(applicationContext), auto.a(applicationContext), b);
                                            bahuVar2 = bahuVar5;
                                            bbjt bbjtVar4 = bbjtVar;
                                            bahtVar2 = bahtVar5;
                                            aumo.a();
                                            aumo.a();
                                            bbci bbciVar = new bbci(applicationContext, auto.a(applicationContext));
                                            bafh bafhVar2 = new bafh(applicationContext);
                                            String packageName = applicationContext.getPackageName();
                                            fxxm.e(packageName, "getPackageName(...)");
                                            bbcl bbclVar = new bbcl(applicationContext, packageName);
                                            new bbck(applicationContext);
                                            bbcp bbcpVar = new bbcp(applicationContext, bbciVar, bafhVar2, bbclVar);
                                            eixsVar2 = k2;
                                            bamf bamfVar6 = bamfVar2;
                                            basw baswVar5 = baswVar;
                                            bassVar3 = bassVar2;
                                            bbde bbdeVar = new bbde(applicationContext, baswVar5, bassVar3, bbcpVar, new bbcs(applicationContext), baqjVar2, bamfVar6);
                                            baqjVar3 = baqjVar2;
                                            bamfVar2 = bamfVar6;
                                            baswVar2 = baswVar5;
                                            bbdh bbdhVar2 = new bbdh(applicationContext, b, bbcfVar, bbdeVar);
                                            fxvy.a(d4, null);
                                            bbdhVar = bbdhVar2;
                                            bbjtVar2 = bbjtVar4;
                                            batrVar = batrVar3;
                                        } catch (Throwable th12) {
                                            th = th12;
                                            Throwable th13 = th;
                                            try {
                                                throw th13;
                                            } catch (Throwable th14) {
                                                fxvy.a(d4, th13);
                                                throw th14;
                                            }
                                        }
                                    } catch (Throwable th15) {
                                        eixsVar2 = k2;
                                        th2 = th15;
                                    }
                                } catch (Throwable th16) {
                                    th = th16;
                                    eixsVar2 = k2;
                                    th = th;
                                    eixsVar = eixsVar2;
                                    throw th;
                                }
                            } else {
                                baqjVar3 = baqjVar;
                                eixsVar2 = k2;
                                baswVar2 = baswVar;
                                bassVar3 = bassVar2;
                                bbjt bbjtVar5 = bbjtVar;
                                bahtVar2 = bahtVar;
                                bahuVar2 = bahuVar;
                                lifecycleChimeraService3 = lifecycleChimeraService2;
                                bbjtVar2 = bbjtVar5;
                                bbdhVar = null;
                                batrVar = null;
                            }
                            try {
                                if (bbbmVar.a(bbhu.a(lifecycleChimeraService3))) {
                                    d = eizp.d("initMediaTransferLCDelegate", eizq.a);
                                    try {
                                        bbkf bbkfVar2 = bbbrVar.f;
                                        if (bbkfVar2 == null) {
                                            eqci eqciVar = eqci.a;
                                            new caqj(Looper.getMainLooper());
                                            new bbjv(lifecycleChimeraService3, null, 30);
                                            bbkfVar2 = new bbkb(lifecycleChimeraService3, eqciVar, new bbkd(null));
                                        }
                                        fxvy.a(d, null);
                                        bbkfVar = bbkfVar2;
                                    } finally {
                                        try {
                                            throw th;
                                        } finally {
                                        }
                                    }
                                } else {
                                    bbkfVar = null;
                                }
                                if (bbbmVar.a(bbhu.a(lifecycleChimeraService3))) {
                                    d = eizp.d("initMediaTransferSettingLCDelegate", eizq.a);
                                    try {
                                        bbhv bbhvVar3 = bbbrVar.j;
                                        if (bbhvVar3 == null) {
                                            Context applicationContext9 = lifecycleChimeraService3.getApplicationContext();
                                            fxxm.e(applicationContext9, "getApplicationContext(...)");
                                            bbhvVar3 = new bbhv(applicationContext9);
                                        }
                                        fxvy.a(d, null);
                                        bbhvVar = bbhvVar3;
                                    } finally {
                                        try {
                                            throw th;
                                        } finally {
                                        }
                                    }
                                } else {
                                    bbhvVar = null;
                                }
                                if (bbhvVar != null) {
                                    bbhvVar.b = new bafh(bbhvVar.a);
                                }
                                int i5 = bare.m;
                                if (bbbmVar.a(bard.a())) {
                                    d = eizp.d("initDirectDeviceAccessLCDelegate", eizq.a);
                                    try {
                                        bare bareVar3 = bbbrVar.k;
                                        if (bareVar3 == null) {
                                            Context applicationContext10 = lifecycleChimeraService3.getApplicationContext();
                                            fxxm.e(applicationContext10, "getApplicationContext(...)");
                                            bati batiVar = new bati(applicationContext10);
                                            bass bassVar7 = bassVar3;
                                            baqj baqjVar7 = baqjVar3;
                                            barc barcVar = new barc(applicationContext10, bassVar7, bamfVar2, baqjVar7, banuVar, fxuvVar7, batiVar, new batg(applicationContext10, batiVar));
                                            bassVar4 = bassVar7;
                                            baqjVar3 = baqjVar7;
                                            banuVar2 = banuVar;
                                            fxuvVar9 = fxuvVar7;
                                            bareVar3 = barcVar;
                                        } else {
                                            bassVar4 = bassVar3;
                                            banuVar2 = banuVar;
                                            fxuvVar9 = fxuvVar7;
                                        }
                                        fxvy.a(d, null);
                                        bareVar = bareVar3;
                                    } finally {
                                        try {
                                            throw th;
                                        } finally {
                                        }
                                    }
                                } else {
                                    bassVar4 = bassVar3;
                                    banuVar2 = banuVar;
                                    fxuvVar9 = fxuvVar7;
                                    bareVar = null;
                                }
                                Set set = bbjo.e;
                                if (bbbmVar.a(bbjn.a())) {
                                    d = eizp.d("initCallTransferLCDelegate", eizq.a);
                                    try {
                                        bbjo bbjoVar2 = bbbrVar.i;
                                        if (bbjoVar2 == null) {
                                            Context applicationContext11 = lifecycleChimeraService3.getApplicationContext();
                                            fxxm.e(applicationContext11, "getApplicationContext(...)");
                                            ausn ausnVar4 = baew.a;
                                            bafq bafqVar7 = bafqVar3;
                                            bbjoVar2 = new bbjm(applicationContext11, bareVar, bafqVar7, baex.b(baex.a(baew.a(2))), new batg(applicationContext11));
                                            bareVar2 = bareVar;
                                            bafqVar3 = bafqVar7;
                                        } else {
                                            bareVar2 = bareVar;
                                        }
                                        fxvy.a(d, null);
                                        bbjoVar = bbjoVar2;
                                    } finally {
                                        try {
                                            throw th;
                                        } finally {
                                        }
                                    }
                                } else {
                                    bareVar2 = bareVar;
                                    bbjoVar = null;
                                }
                                if (!bbbmVar.a(batx.a()) || bahuVar2 == null || baswVar2 == null) {
                                    bbheVar2 = bbheVar;
                                    bbbpVar = null;
                                } else {
                                    d = eizp.d("initFastInitLCDelegate", eizq.a);
                                    try {
                                        bbbp bbbpVar2 = bbbrVar.A;
                                        if (bbbpVar2 == null) {
                                            bbbpVar2 = new batw(baex.b(fxuvVar8), bahuVar2, baswVar2);
                                        }
                                        fxvy.a(d, null);
                                        bbheVar2 = bbheVar;
                                        bbbpVar = bbbpVar2;
                                    } finally {
                                        try {
                                            throw th;
                                        } finally {
                                        }
                                    }
                                }
                                qgp qgpVar = bake.i;
                                if (bbbmVar.a(bajt.a())) {
                                    eixb d5 = eizp.d("initAppCapabilitiesMatchingLCDelegate", eizq.a);
                                    try {
                                        bake bakeVar2 = bbbrVar.l;
                                        if (bakeVar2 == null) {
                                            Context applicationContext12 = lifecycleChimeraService3.getApplicationContext();
                                            fxxm.e(applicationContext12, "getApplicationContext(...)");
                                            fyea b3 = baex.b(fxuvVar4);
                                            try {
                                                v = AppCapabilitiesMatchingDatabase.m.a().v();
                                                packageManager2 = applicationContext12.getPackageManager();
                                                bamf bamfVar7 = bamfVar2;
                                                baqjVar5 = baqjVar3;
                                                bbhvVar2 = bbhvVar;
                                                bajpVar = new bajp(applicationContext12, bamfVar7, baqjVar5, b3, v, packageManager2);
                                                bamfVar2 = bamfVar7;
                                                a2 = badt.a(applicationContext12, 1);
                                                badrVar = new badr(applicationContext12);
                                                ausn ausnVar5 = baew.a;
                                                eixbVar = d5;
                                            } catch (Throwable th17) {
                                                th = th17;
                                                eixbVar = d5;
                                            }
                                            try {
                                                baje bajeVar = new baje(baqjVar5, applicationContext12, banuVar2, bamfVar2, b3, v, packageManager2, bajpVar, new baix(applicationContext12, a2, badrVar, baex.b(baew.a(i3))));
                                                baqjVar4 = baqjVar5;
                                                bakeVar2 = bajeVar;
                                            } catch (Throwable th18) {
                                                th = th18;
                                                try {
                                                    throw th;
                                                } finally {
                                                }
                                            }
                                        } else {
                                            eixbVar = d5;
                                            baqjVar4 = baqjVar3;
                                            bbhvVar2 = bbhvVar;
                                        }
                                        fxvy.a(eixbVar, null);
                                        bamfVar3 = bamfVar2;
                                        bbhcVar2 = bbhcVar;
                                        bakeVar = bakeVar2;
                                    } catch (Throwable th19) {
                                        th = th19;
                                        eixbVar = d5;
                                    }
                                } else {
                                    baqjVar4 = baqjVar3;
                                    bbhvVar2 = bbhvVar;
                                    bamfVar3 = bamfVar2;
                                    bbhcVar2 = bbhcVar;
                                    bakeVar = null;
                                }
                                bbjo bbjoVar3 = bbjoVar;
                                banu banuVar5 = banuVar2;
                                bbbr bbbrVar2 = new bbbr(bbdhVar, baptVar, bbheVar2, bbhcVar2, bbkfVar, bbjtVar2, bbhxVar, bbjoVar3, bbhvVar2, bareVar2, bbbpVar, bakeVar, bbbtVar, bamfVar3, baswVar2, bassVar4, bahuVar2, bahtVar2, bbijVar, baqjVar4, batrVar, fxuvVar9, fxuvVar8, bafqVar3, fxuvVar4, banuVar5);
                                fxvy.a(eixsVar2, null);
                                d = eizp.d("injectDependency", eizq.a);
                                try {
                                    basw baswVar6 = bbbrVar2.v;
                                    baqg baqdVar = (!bave.z() || baswVar6 == null) ? bbbrVar2.w : new baqd(baswVar6);
                                    baqj baqjVar8 = bbbrVar2.n;
                                    if (baqjVar8 != null) {
                                        baqjVar8.m(baqdVar, bbbrVar2.u);
                                    }
                                    bbhe bbheVar5 = bbbrVar2.d;
                                    if (bbheVar5 != null) {
                                        ((bbeq) bbheVar5).j = bbbrVar2.i;
                                    }
                                    lifecycleChimeraService3.c.e = (bbeq) (true != (bbheVar5 instanceof bbeq) ? null : bbheVar5);
                                    bapt baptVar3 = bbbrVar2.c;
                                    bapt baptVar4 = true != (baptVar3 instanceof bapq) ? null : baptVar3;
                                    if (baptVar4 != null) {
                                        ((bapq) baptVar4).g = bbheVar5;
                                    }
                                    bbkf bbkfVar3 = bbbrVar2.f;
                                    if (bbkfVar3 != null) {
                                        ((bbkb) bbkfVar3).h = bbheVar5;
                                        if (bbheVar5 != null) {
                                            bbheVar5.b("com.google.android.gms.dtdi.MediaTransferChannel", ((bbkb) bbkfVar3).j);
                                        }
                                    }
                                    if (bbkfVar3 != null) {
                                        ((bbkb) bbkfVar3).g = bbbrVar2.b;
                                    }
                                    bbdm bbdmVar = bbbrVar2.b;
                                    if (bbdmVar != null) {
                                        bbde bbdeVar2 = ((bbdh) bbdmVar).c;
                                        bbcp bbcpVar2 = bbdeVar2.b;
                                        ((eluo) bbcp.a.h()).B("MTSettingDebug injectSyncLifecycleDelegate %s, listening for media state events", baptVar3);
                                        bbcpVar2.e = baptVar3;
                                        if (bawi.v()) {
                                            ((eluo) bbde.a.h()).x("MTDebug OrchestrationController initializing ContextSyncController during dependency injection.");
                                        }
                                        if (baptVar3 != null) {
                                            bbdeVar2.e = new baok(baptVar3, "OrchestrationController", new bbcv(bbdeVar2));
                                        } else {
                                            ((eluo) bbde.a.j()).x("MTDebug not eligible to connect to Sync due to null delegate");
                                        }
                                        ((bbdh) bbdmVar).b.j = baptVar3;
                                    }
                                    if (bbdmVar != null) {
                                        bbhv bbhvVar4 = bbbrVar2.j;
                                        bbde bbdeVar3 = ((bbdh) bbdmVar).c;
                                        bbdeVar3.d = bbhvVar4;
                                        bbhv bbhvVar5 = bbdeVar3.d;
                                        if (bbhvVar5 != null) {
                                            bbhvVar5.a(bbdeVar3.i);
                                        }
                                    }
                                    bbjt bbjtVar6 = bbbrVar2.g;
                                    if (bbjtVar6 != null) {
                                        ((bbjr) bbjtVar6).c = baptVar3;
                                    }
                                    if (bbjtVar6 != null) {
                                        ((bbjr) bbjtVar6).d = bbheVar5;
                                    }
                                    if (bbheVar5 != null) {
                                        ((bbeq) bbheVar5).i = bbbrVar2.h;
                                    }
                                    if (bbheVar5 != null) {
                                        ((bbeq) bbheVar5).g = bbbrVar2.j;
                                    }
                                    if (bbheVar5 != null) {
                                        ((bbeq) bbheVar5).h = bbbrVar2.k;
                                    }
                                    if (bbheVar5 != null) {
                                        ((bbeq) bbheVar5).k = bbbrVar2.l;
                                    }
                                    fxvy.a(d, null);
                                    d = eizp.d("startSettingsDelegateBackground", eizq.a);
                                    try {
                                        bbhx bbhxVar3 = bbbrVar2.h;
                                        if (bbhxVar3 != null) {
                                            bbhp bbhpVar = bbhxVar3.a;
                                            i4 = i3;
                                            fycr.b(bbhpVar.e, null, null, new bbho(bbhpVar, null), i4);
                                            bbhm bbhmVar = bbhxVar3.b;
                                            Context context = bbhmVar.b;
                                            fxxm.f(context, "context");
                                            Intent type = new Intent("com.google.android.gms.SHARE_NEARBY").setPackage("com.google.android.gms").setType("*/*");
                                            fxxm.e(type, "setType(...)");
                                            List<ResolveInfo> queryIntentActivities = context.getPackageManager().queryIntentActivities(type, 0);
                                            fxxm.e(queryIntentActivities, "queryIntentActivities(...)");
                                            if (queryIntentActivities.isEmpty()) {
                                                ((eluo) bbhm.a.h()).x("Not registering NS state observer: NS is not available");
                                            } else {
                                                ((eluo) bbhm.a.h()).x("Registering NS state observer");
                                                bbhmVar.a().t(bbhmVar.d);
                                                bbhmVar.b();
                                            }
                                        } else {
                                            i4 = i3;
                                        }
                                        fxvy.a(d, null);
                                        eizq eizqVar = eizq.a;
                                        fxvy.a(eizp.d("startDirectDeviceAccessDelegateBackground", eizqVar), null);
                                        fxvy.a(eizp.d("startCallTransferDelegateBackground", eizqVar), null);
                                        fxvy.a(eizp.d("startPersistentDelegateBackground", eizqVar), null);
                                        d = eizp.d("startAdvertisingSettingsDelegateBackground", eizqVar);
                                        try {
                                            bbhc bbhcVar4 = bbbrVar2.e;
                                            if (bbhcVar4 != null) {
                                                if (bave.y()) {
                                                    fyea fyeaVar = ((bbei) bbhcVar4).c;
                                                    fycr.b(fyeaVar, null, null, new bbea((bbei) bbhcVar4, null), i4);
                                                    fycr.b(fyeaVar, null, null, new bbed((bbei) bbhcVar4, null), i4);
                                                } else {
                                                    fycr.b(((bbei) bbhcVar4).c, null, null, new bbeh((bbei) bbhcVar4, null), i4);
                                                }
                                                ((eluo) bbei.a.h()).x("DTDI Persistent service started!");
                                            }
                                            fxvy.a(d, null);
                                            d = eizp.d("startAppCapabilitiesMatchingDelegateBackground", eizq.a);
                                            try {
                                                bake bakeVar3 = bbbrVar2.l;
                                                if (bakeVar3 != null) {
                                                    synchronized (((baje) bakeVar3).e) {
                                                        if (!((baje) bakeVar3).f) {
                                                            ((baje) bakeVar3).f = true;
                                                            ((baje) bakeVar3).h.a().x("com.google.android.gms.dtdi.AppCapabilitiesChannel", ((baje) bakeVar3).g);
                                                        }
                                                    }
                                                }
                                                fxvy.a(d, null);
                                                d = eizp.d("startFastInitDelegateBackground", eizq.a);
                                                try {
                                                    bbbp bbbpVar3 = bbbrVar2.A;
                                                    if (bbbpVar3 != null) {
                                                        batt battVar = new batt((batw) bbbpVar3, null);
                                                        fyea fyeaVar2 = ((batw) bbbpVar3).a;
                                                        fycr.b(fyeaVar2, null, null, battVar, i4);
                                                        fycr.b(fyeaVar2, null, null, new batu((batw) bbbpVar3, null), i4);
                                                        fycr.b(fyeaVar2, null, null, new batv((batw) bbbpVar3, null), i4);
                                                    }
                                                    fxvy.a(d, null);
                                                    d = eizp.d("startSyncDelegate", eizq.a);
                                                    try {
                                                        bapt baptVar5 = bbbrVar2.c;
                                                        if (baptVar5 != null) {
                                                            if (bave.v()) {
                                                                final bapq bapqVar = (bapq) baptVar5;
                                                                baph.b(new Runnable() { // from class: bapb
                                                                    @Override // java.lang.Runnable
                                                                    public final void run() {
                                                                        bapq.this.c();
                                                                    }
                                                                });
                                                            } else {
                                                                final bapq bapqVar2 = (bapq) baptVar5;
                                                                baps.a(new Runnable() { // from class: bapc
                                                                    @Override // java.lang.Runnable
                                                                    public final void run() {
                                                                        bapq.this.c();
                                                                    }
                                                                });
                                                            }
                                                        }
                                                        fxvy.a(d, null);
                                                        d = eizp.d("startOrchestrationDelegate", eizq.a);
                                                        try {
                                                            bbdm bbdmVar2 = bbbrVar2.b;
                                                            if (bbdmVar2 != null) {
                                                                ((eluo) bbdh.a.h()).x("Starting service.");
                                                                if (bave.v()) {
                                                                    ((bbdh) bbdmVar2).a();
                                                                } else {
                                                                    final bbdh bbdhVar3 = (bbdh) bbdmVar2;
                                                                    baps.a(new Runnable() { // from class: bbdf
                                                                        @Override // java.lang.Runnable
                                                                        public final void run() {
                                                                            bbdh.this.a();
                                                                        }
                                                                    });
                                                                }
                                                            }
                                                            fxvy.a(d, null);
                                                            d = eizp.d("startMediaTransferDelegate", eizq.a);
                                                            try {
                                                                bbkf bbkfVar4 = bbbrVar2.f;
                                                                if (bbkfVar4 != null) {
                                                                    if (((bbkb) bbkfVar4).d == null) {
                                                                        ((bbkb) bbkfVar4).d = aia$$ExternalSyntheticApiModelOutline0.m(((bbkb) bbkfVar4).b.getSystemService(aia$$ExternalSyntheticApiModelOutline0.m$1()));
                                                                    }
                                                                    if (bave.v()) {
                                                                        bbdm bbdmVar3 = ((bbkb) bbkfVar4).g;
                                                                        if (bbdmVar3 != null) {
                                                                            bbdmVar3.b(((bbkb) bbkfVar4).m);
                                                                        }
                                                                    } else {
                                                                        final bbkb bbkbVar = (bbkb) bbkfVar4;
                                                                        baps.a(new Runnable() { // from class: bbjy
                                                                            @Override // java.lang.Runnable
                                                                            public final void run() {
                                                                                bbkb bbkbVar2 = bbkb.this;
                                                                                bbdm bbdmVar4 = bbkbVar2.g;
                                                                                if (bbdmVar4 != null) {
                                                                                    bbdmVar4.b(bbkbVar2.m);
                                                                                }
                                                                            }
                                                                        });
                                                                    }
                                                                }
                                                                fxvy.a(d, null);
                                                                d = eizp.d("startCastReceiverDelegate", eizq.a);
                                                                try {
                                                                    bbjt bbjtVar7 = bbbrVar2.g;
                                                                    if (bbjtVar7 != null) {
                                                                        if (bave.v()) {
                                                                            ((bbjr) bbjtVar7).a();
                                                                        } else {
                                                                            final bbjr bbjrVar = (bbjr) bbjtVar7;
                                                                            baps.a(new Runnable() { // from class: bbjp
                                                                                @Override // java.lang.Runnable
                                                                                public final void run() {
                                                                                    bbjr.this.a();
                                                                                }
                                                                            });
                                                                        }
                                                                    }
                                                                    fxvy.a(d, null);
                                                                    d = eizp.d("startMediaTransferSettingsDelegate", eizq.a);
                                                                    try {
                                                                        bbhv bbhvVar6 = bbbrVar2.j;
                                                                        if (bbhvVar6 != null && (bafhVar = bbhvVar6.b) != null) {
                                                                            bbhi bbhiVar = bbhvVar6.d;
                                                                            fxxm.f(bbhiVar, "listener");
                                                                            bafhVar.c.add(bbhiVar);
                                                                        }
                                                                        fxvy.a(d, null);
                                                                        lifecycleChimeraService3.d = bbbrVar2;
                                                                        lifecycleChimeraService3.f = true;
                                                                        lifecycleChimeraService3.c.c.set(true);
                                                                        ((eluo) LifecycleChimeraService.a.h()).x("Finished delegate init");
                                                                    } finally {
                                                                    }
                                                                } finally {
                                                                    try {
                                                                        throw th;
                                                                    } finally {
                                                                    }
                                                                }
                                                            } finally {
                                                                try {
                                                                    throw th;
                                                                } finally {
                                                                }
                                                            }
                                                        } finally {
                                                            try {
                                                                throw th;
                                                            } finally {
                                                            }
                                                        }
                                                    } finally {
                                                        try {
                                                            throw th;
                                                        } finally {
                                                        }
                                                    }
                                                } finally {
                                                    try {
                                                        throw th;
                                                    } finally {
                                                    }
                                                }
                                            } finally {
                                                try {
                                                    throw th;
                                                } finally {
                                                }
                                            }
                                        } finally {
                                            try {
                                                throw th;
                                            } finally {
                                            }
                                        }
                                    } finally {
                                        try {
                                            throw th;
                                        } finally {
                                        }
                                    }
                                } finally {
                                    try {
                                        throw th;
                                    } finally {
                                    }
                                }
                            } catch (Throwable th20) {
                                th = th20;
                                eixsVar = eixsVar2;
                                th = th;
                                throw th;
                            }
                        } catch (Throwable th21) {
                            th = th21;
                            th = th;
                            eixsVar = eixsVar2;
                            throw th;
                        }
                    } finally {
                    }
                }
            });
        }
        return 1;
    }

    public LifecycleChimeraService(bbbr bbbrVar) {
        fxxm.f(bbbrVar, "testOverridesComponentContainer");
        this.b = bbbrVar;
        this.c = bbes.b;
        this.e = new bbbm();
    }

    public /* synthetic */ LifecycleChimeraService(bbbr bbbrVar, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? bbbr.a : bbbrVar);
    }
}
