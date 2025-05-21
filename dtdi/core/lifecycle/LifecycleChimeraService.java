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
import defpackage.arwm;
import defpackage.asmf;
import defpackage.asot;
import defpackage.asqh;
import defpackage.ayay;
import defpackage.aybq;
import defpackage.aydk;
import defpackage.aydt;
import defpackage.aydu;
import defpackage.aydv;
import defpackage.aydz;
import defpackage.ayef;
import defpackage.ayeo;
import defpackage.ayeq;
import defpackage.ayer;
import defpackage.ayes;
import defpackage.ayff;
import defpackage.ayfk;
import defpackage.ayfu;
import defpackage.aygf;
import defpackage.aykl;
import defpackage.aykx;
import defpackage.ayls;
import defpackage.aylv;
import defpackage.ayml;
import defpackage.aynf;
import defpackage.ayng;
import defpackage.ayou;
import defpackage.ayov;
import defpackage.aypd;
import defpackage.aypl;
import defpackage.aypp;
import defpackage.ayqb;
import defpackage.ayqe;
import defpackage.ayqg;
import defpackage.ayqk;
import defpackage.ayqm;
import defpackage.ayqq;
import defpackage.ayqu;
import defpackage.ayrj;
import defpackage.ayrl;
import defpackage.ayro;
import defpackage.ayrq;
import defpackage.ayru;
import defpackage.ayso;
import defpackage.aysu;
import defpackage.aysw;
import defpackage.aytb;
import defpackage.aytd;
import defpackage.ayxs;
import defpackage.ayxu;
import defpackage.ayxx;
import defpackage.ayyl;
import defpackage.ayzk;
import defpackage.ayzp;
import defpackage.ayzs;
import defpackage.ayzu;
import defpackage.azap;
import defpackage.azcz;
import defpackage.azdb;
import defpackage.azdk;
import defpackage.azdp;
import defpackage.azdq;
import defpackage.azdr;
import defpackage.azds;
import defpackage.azdu;
import defpackage.azdv;
import defpackage.azdw;
import defpackage.azfm;
import defpackage.azfn;
import defpackage.azfr;
import defpackage.bhib;
import defpackage.brdq;
import defpackage.ckkm;
import defpackage.fnjq;
import defpackage.fuwt;
import defpackage.fvbo;
import defpackage.fvjt;
import defpackage.onm;
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

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes4.dex */
public final class LifecycleChimeraService extends Service {
    public static final asot a = ayay.a("LifecycleService");
    public final ayxx b;
    public final azap c;
    public ayxx d;
    public final ayxs e;
    public volatile boolean f;
    public bhib g;
    private boolean h;

    public LifecycleChimeraService() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    @Override // com.google.android.chimera.Service
    protected final void dump(FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        ayml aymlVar;
        aygf aygfVar;
        azdv azdvVar;
        ayzu ayzuVar;
        aylv aylvVar;
        aydu ayduVar;
        aydv aydvVar;
        ayov ayovVar;
        if (printWriter == null) {
            return;
        }
        ayxu ayxuVar = !asqh.c() ? new ayxu(1, "Requires platform version O") : new ayxu();
        printWriter.println("Eligibility status: code=" + ayxuVar.a + " reason=" + ayxuVar.b);
        boolean z = this.f;
        StringBuilder sb = new StringBuilder("delegatesInitialized: ");
        sb.append(z);
        printWriter.println(sb.toString());
        if (ayru.d()) {
            printWriter.println("***** DTDI Flags *****");
            printWriter.println("Analytics Flags: ");
            printWriter.println("  dtdiUserType: " + ayqe.c());
            boolean z2 = ayrq.c;
            ayqe.B();
            if (ayru.a() && !ayrq.b) {
                throw new IllegalStateException("Analytics.gmsCoreLoggerDtdiPseudonymousConfig referenced before Initializer.ensureAllFlagsRead() called.");
            }
            brdq b = ayqe.b();
            Objects.toString(b);
            printWriter.println("  gmsCoreLoggerDtdiPseudonymousConfig: ".concat(String.valueOf(b)));
            printWriter.println("AppCapabilitiesMatching Flags: ");
            printWriter.println("  appCapabilitiesRequestTimeoutMs: " + ayqg.b());
            printWriter.println("CallTransfer Flags: ");
            boolean z3 = ayrq.c;
            ayqk.B();
            if (ayru.a() && !ayrq.b) {
                throw new IllegalStateException("CallTransfer.telecomMetadataDelegateAvailable referenced before Initializer.ensureAllFlagsRead() called.");
            }
            printWriter.println("  telecomMetadataDelegateAvailable: " + ayqk.c());
            printWriter.println("  outputSwitcherUseDynamicColors: " + ayqk.d());
            printWriter.println("  overrideTidepool: " + ayqk.e());
            fnjq.c();
            printWriter.println("Cast Flags: ");
            printWriter.println("  internalPrerelease: " + ayqm.b());
            printWriter.println("ContextSync Flags: ");
            boolean z4 = ayrq.c;
            ayqq.B();
            if (ayru.a() && !ayrq.b) {
                throw new IllegalStateException("ContextSync.telecomAvailable referenced before Initializer.ensureAllFlagsRead() called.");
            }
            printWriter.println("  telecomAvailable: " + ayqq.c());
            boolean z5 = ayrq.c;
            ayqq.B();
            if (ayru.a() && !ayrq.b) {
                throw new IllegalStateException("ContextSync.checkDeviceConnected referenced before Initializer.ensureAllFlagsRead() called.");
            }
            printWriter.println("  checkDeviceConnected: " + ayqq.a());
            printWriter.println("  restoreSendingMessages: " + ayqq.d());
            printWriter.println("DeviceDiscovery Flags: ");
            boolean z6 = ayrq.c;
            ayqu.B();
            if (ayru.a() && !ayrq.b) {
                throw new IllegalStateException("DeviceDiscovery.trustRelationshipFilterEnabled referenced before Initializer.ensureAllFlagsRead() called.");
            }
            printWriter.println("  trustRelationshipFilterEnabled: " + ayqu.c());
            printWriter.println("  enableDeduplicationHint: " + ayqu.d());
            boolean z7 = ayrq.c;
            ayqu.B();
            if (ayru.a() && !ayrq.b) {
                throw new IllegalStateException("DeviceDiscovery.outputSwitcherDeviceConnectionTimeoutDuration referenced before Initializer.ensureAllFlagsRead() called.");
            }
            printWriter.println("  outputSwitcherDeviceConnectionTimeoutDuration: " + ayqu.b());
            printWriter.println("DirectDeviceAccess Flags: ");
            printWriter.println("Dtdi Flags: ");
            printWriter.println("  doNotReleaseSkipFilteringIfNoMetadataPresentInCredential: " + ayrj.r());
            printWriter.println("  wakeupRequestTimeoutMs: " + ayrj.A());
            printWriter.println("  initTtcOnBgThreadPhase2: " + ayrj.t());
            printWriter.println("  ddaApiThrottlingGlobalRatePerMinute: " + ayrj.p());
            printWriter.println("  devicePickerDismissAfterApprovalMs: " + ayrj.q());
            printWriter.println("  useCollapsedDockingState: " + ayrj.y());
            printWriter.println("  unifySharingVisibilityConversion: " + ayrj.w());
            boolean z8 = ayrq.c;
            ayrj.B();
            if (ayru.a() && !ayrq.b) {
                throw new IllegalStateException("Dtdi.handleSpotifyStreamExpansion referenced before Initializer.ensureAllFlagsRead() called.");
            }
            printWriter.println("  handleSpotifyStreamExpansion: " + ayrj.f());
            printWriter.println("  requireConnectionCapabilitiesChangeOrDisconnect: " + ayrj.v());
            printWriter.println("  checkNearbyShareAvailable: " + ayrj.o());
            printWriter.println("  useBc25Styling: " + ayrj.x());
            printWriter.println("  useNewAdvertisingManager: " + ayrj.z());
            printWriter.println("  optimizeTtcDiscovery: " + ayrj.u());
            printWriter.println("  enableDirectConnectToService: " + ayrj.s());
            printWriter.println("FastInit Flags: ");
            printWriter.println("  prerelease: " + ayrl.b());
            printWriter.println("FoyerConfigFeature Flags: ");
            boolean z9 = ayrq.c;
            ayro.B();
            if (ayru.a() && !ayrq.b) {
                throw new IllegalStateException("FoyerConfigFeature.foyerUrl referenced before Initializer.ensureAllFlagsRead() called.");
            }
            printWriter.println("  foyerUrl: ".concat(String.valueOf(ayro.a())));
            boolean z10 = ayrq.c;
            ayro.B();
            if (ayru.a() && !ayrq.b) {
                throw new IllegalStateException("FoyerConfigFeature.homeGraphScope referenced before Initializer.ensureAllFlagsRead() called.");
            }
            printWriter.println("  homeGraphScope: ".concat(String.valueOf(ayro.b())));
            printWriter.println("Lifecycle Flags: ");
            printWriter.println("  injectDiscoveryDelegate: " + ayru.e());
            printWriter.println("  debugCrashOnUninitializedFlags: " + ayru.a());
            printWriter.println("  dumpFlagValues: " + ayru.d());
            printWriter.println("MediaTransfer Flags: ");
            printWriter.println("  logDebugMessages: " + ayso.v());
            printWriter.println("  moveCoolDownMillis: " + ayso.x());
            printWriter.println("  includePerformanceLogs: " + ayso.u());
            printWriter.println("  optInMaxMediaRoutes: " + ayso.z());
            printWriter.println("  optInDismissToDisableMin: " + ayso.y());
            printWriter.println("  receiverModelName: ".concat(String.valueOf(ayso.C())));
            boolean z11 = ayrq.c;
            ayso.B();
            if (ayru.a() && !ayrq.b) {
                throw new IllegalStateException("MediaTransfer.isTablet referenced before Initializer.ensureAllFlagsRead() called.");
            }
            printWriter.println("  isTablet: " + ayso.s());
            boolean z12 = ayrq.c;
            ayso.B();
            if (ayru.a() && !ayrq.b) {
                throw new IllegalStateException("MediaTransfer.doNotReleaseCrashOnIllegalState referenced before Initializer.ensureAllFlagsRead() called.");
            }
            printWriter.println("  doNotReleaseCrashOnIllegalState: " + ayso.a());
            boolean z13 = ayrq.c;
            ayso.B();
            if (ayru.a() && !ayrq.b) {
                throw new IllegalStateException("MediaTransfer.routerScanIntervalMillis referenced before Initializer.ensureAllFlagsRead() called.");
            }
            printWriter.println("  routerScanIntervalMillis: " + ayso.o());
            boolean z14 = ayrq.c;
            ayso.B();
            if (ayru.a() && !ayrq.b) {
                throw new IllegalStateException("MediaTransfer.routerScanDurationMillis referenced before Initializer.ensureAllFlagsRead() called.");
            }
            printWriter.println("  routerScanDurationMillis: " + ayso.n());
            printWriter.println("  doNotReleaseSupportNonPixelPhones: " + ayso.t());
            boolean z15 = ayrq.c;
            ayso.B();
            if (ayru.a() && !ayrq.b) {
                throw new IllegalStateException("MediaTransfer.inactiveMediaStatePropagationDelayMillis referenced before Initializer.ensureAllFlagsRead() called.");
            }
            printWriter.println("  inactiveMediaStatePropagationDelayMillis: " + ayso.c());
            printWriter.println("  retryDelayMillis: " + ayso.D());
            boolean z16 = ayrq.c;
            ayso.B();
            if (ayru.a() && !ayrq.b) {
                throw new IllegalStateException("MediaTransfer.undoButtonDelayMillis referenced before Initializer.ensureAllFlagsRead() called.");
            }
            printWriter.println("  undoButtonDelayMillis: " + ayso.r());
            boolean z17 = ayrq.c;
            ayso.B();
            if (ayru.a() && !ayrq.b) {
                throw new IllegalStateException("MediaTransfer.transferTimeoutDelayMillis referenced before Initializer.ensureAllFlagsRead() called.");
            }
            printWriter.println("  transferTimeoutDelayMillis: " + ayso.q());
            boolean z18 = ayrq.c;
            ayso.B();
            if (ayru.a() && !ayrq.b) {
                throw new IllegalStateException("MediaTransfer.overallInactiveMediaStatePropagationDelayMillis referenced before Initializer.ensureAllFlagsRead() called.");
            }
            printWriter.println("  overallInactiveMediaStatePropagationDelayMillis: " + ayso.j());
            printWriter.println("  maxCachedOnBehalfOfLoggers: " + ayso.w());
            printWriter.println("  packageNameEligibilityCacheExpirationMillis: " + ayso.A());
            boolean z19 = ayrq.c;
            ayso.B();
            if (ayru.a() && !ayrq.b) {
                throw new IllegalStateException("MediaTransfer.skipMatchingNotCastingStates referenced before Initializer.ensureAllFlagsRead() called.");
            }
            printWriter.println("  skipMatchingNotCastingStates: " + ayso.p());
            printWriter.println("SecureConnections Flags: ");
            printWriter.println("  payloadTrackerCrashOnCacheEviction: " + aysu.h());
            printWriter.println("  specifyPayloadUrgency: " + aysu.i());
            printWriter.println("  enableBandwidthUpgrades: " + aysu.f());
            printWriter.println("  ncOutgoingConnectionRetryAttempts: " + aysu.g());
            boolean z20 = ayrq.c;
            aysu.B();
            if (ayru.a() && !ayrq.b) {
                throw new IllegalStateException("SecureConnections.ncOutgoingConnectionRetryIntervalMillis referenced before Initializer.ensureAllFlagsRead() called.");
            }
            printWriter.println("  ncOutgoingConnectionRetryIntervalMillis: " + aysu.c());
            printWriter.println("Settings Flags: ");
            printWriter.println("  handleTidepoolSequenceNumber: " + aysw.b());
            printWriter.println("SpatialOrchestration Flags: ");
            printWriter.println("  doNotReleaseFwdSpatialEventsToInternalSubscriber: " + aytb.e());
            printWriter.println("  overrideDockState: " + aytb.h());
            printWriter.println("  forceStartAdvertising: " + aytb.f());
            printWriter.println("  forceStartDiscovery: " + aytb.g());
            printWriter.println("Wakeup Flags: ");
            printWriter.println("  throwOperationExceptionOnFailure: " + aytd.b());
            printWriter.println("***** END DTDI Flags *****");
        }
        printWriter.println("Delegate eligibility:");
        ayxu a2 = azdb.a();
        Objects.toString(a2);
        printWriter.println("  apiGateway=".concat(a2.toString()));
        ayxu a3 = azcz.a();
        Objects.toString(a3);
        printWriter.println("  advsettings=".concat(a3.toString()));
        ayxu a4 = azds.a(this);
        Objects.toString(a4);
        printWriter.println("  sync=".concat(a4.toString()));
        ayxu a5 = azds.a(this);
        Objects.toString(a5);
        printWriter.println("  orchestration=".concat(a5.toString()));
        ayxu a6 = azds.a(this);
        Objects.toString(a6);
        printWriter.println("  mt=".concat(a6.toString()));
        ayxu a7 = azfr.a(this);
        Objects.toString(a7);
        printWriter.println("  receiver=".concat(a7.toString()));
        ayxu a8 = azdu.a();
        Objects.toString(a8);
        printWriter.println("  settings=".concat(a8.toString()));
        Set set = azfn.f;
        ayxu a9 = azfm.a();
        Objects.toString(a9);
        printWriter.println("  calltransfer=".concat(a9.toString()));
        ayxu a10 = aypl.a();
        Objects.toString(a10);
        printWriter.println("  discovery=".concat(a10.toString()));
        ayxu a11 = azds.a(this);
        Objects.toString(a11);
        printWriter.println("  mediaTransferSettings=".concat(a11.toString()));
        int i = ayng.m;
        ayxu a12 = aynf.a();
        Objects.toString(a12);
        printWriter.println("  directDeviceAccess=".concat(a12.toString()));
        ayxu a13 = ayqb.a();
        Objects.toString(a13);
        printWriter.println("  fastInit=".concat(a13.toString()));
        onm onmVar = aygf.i;
        ayxu a14 = ayfu.a();
        Objects.toString(a14);
        printWriter.println("  appCapabilitiesMatching=".concat(a14.toString()));
        azap azapVar = this.c;
        if (azapVar != null) {
            printWriter.println("ready: " + azapVar.c.get());
        }
        ayxx ayxxVar = this.d;
        if (ayxxVar != null && (ayovVar = ayxxVar.x) != null) {
            aypp b2 = ayovVar.b();
            printWriter.println("DiscoveryManager");
            aypd aypdVar = ((ayou) b2).b;
            printWriter.println("  Proxy: NearbyPresence");
            Integer num = aypdVar.j;
            printWriter.println("  discoveryStatus=".concat(num == null ? "null" : ckkm.a(num.intValue())));
        }
        ayxx ayxxVar2 = this.d;
        if (ayxxVar2 != null && (aydvVar = ayxxVar2.y) != null) {
            ayeq a15 = aydvVar.a();
            printWriter.println("AdvertisingManager");
            aydk aydkVar = (aydk) a15;
            ayef ayefVar = aydkVar.a;
            printWriter.println("  NearbyPresenceAdvertiser");
            Map map = ayefVar.a;
            for (ayes ayesVar : map.keySet()) {
                aydz aydzVar = (aydz) map.get(ayesVar);
                boolean z21 = false;
                boolean z22 = (aydzVar != null ? aydzVar.a : null) == null;
                boolean z23 = (aydzVar != null ? aydzVar.b : null) == null;
                if ((aydzVar != null ? aydzVar.c : null) == null) {
                    z21 = true;
                }
                printWriter.println("  .   configuration: " + ayesVar + " private=" + z22 + " contacts=" + z23 + " public=" + z21);
            }
            printWriter.println("Connection");
            aydkVar.b.a().A(printWriter);
        }
        ayxx ayxxVar3 = this.d;
        if (ayxxVar3 != null && (ayduVar = ayxxVar3.z) != null) {
            ayer a16 = ayduVar.a();
            printWriter.println("AdvertisingManager");
            aydt aydtVar = (aydt) a16;
            ayeo ayeoVar = aydtVar.b;
            printWriter.println("  Proxy: NearbyPresence");
            AtomicBoolean atomicBoolean = ayeoVar.b;
            Objects.toString(atomicBoolean);
            printWriter.println("  isAdvertisingCallTransfer=".concat(String.valueOf(atomicBoolean)));
            AtomicBoolean atomicBoolean2 = ayeoVar.c;
            Objects.toString(atomicBoolean2);
            printWriter.println("  isAdvertisingSdk=".concat(String.valueOf(atomicBoolean2)));
            AtomicBoolean atomicBoolean3 = ayeoVar.d;
            Objects.toString(atomicBoolean3);
            printWriter.println("  isAdvertisingSdkContacts=".concat(String.valueOf(atomicBoolean3)));
            AtomicBoolean atomicBoolean4 = ayeoVar.e;
            Objects.toString(atomicBoolean4);
            printWriter.println("  isAdvertisingMediaTransfer=".concat(String.valueOf(atomicBoolean4)));
            printWriter.println("  callTransferBroadcastStatus=".concat(ayeo.e(ayeoVar.f)));
            printWriter.println("  sdkBroadcastStatus=".concat(ayeo.e(ayeoVar.g)));
            printWriter.println("  sdkContactsBroadcastStatus=".concat(ayeo.e(ayeoVar.h)));
            printWriter.println("  mediaTransferBroadcastStatus=".concat(ayeo.e(ayeoVar.i)));
            printWriter.println("Connection");
            aydtVar.c.a().A(printWriter);
        }
        ayxx ayxxVar4 = this.d;
        if (ayxxVar4 != null && (aylvVar = ayxxVar4.c) != null) {
            aykx b3 = ((ayls) aylvVar).b();
            printWriter.println("Registry");
            Iterator it = b3.d.entrySet().iterator();
            while (it.hasNext()) {
                printWriter.println("  senderType=" + ((Number) ((Map.Entry) it.next()).getKey()).intValue());
            }
        }
        ayxx ayxxVar5 = this.d;
        if (ayxxVar5 != null && (ayzuVar = ayxxVar5.b) != null) {
            printWriter.println("OrchestrationController");
            ayzp ayzpVar = (ayzp) ayzuVar;
            ayzk ayzkVar = ayzpVar.d;
            printWriter.println("  isListeningForEvents=" + ayzkVar.l);
            if (ayso.v()) {
                for (Map.Entry entry : ayzkVar.m.entrySet()) {
                    long longValue = ((Number) entry.getKey()).longValue();
                    boolean j = ayzk.j(((ayzs) entry.getValue()).a);
                    List i2 = ((ayzs) entry.getValue()).a.i();
                    fvbo.e(i2, "getActions(...)");
                    ArrayList arrayList = new ArrayList(fuwt.o(i2, 10));
                    Iterator it2 = i2.iterator();
                    while (it2.hasNext()) {
                        arrayList.add(Integer.valueOf(((PresenceAction) it2.next()).a));
                    }
                    printWriter.println("  lastEvent [deviceId=" + longValue + " actions=" + arrayList + " hasMediaTransferAction=" + j + "]");
                }
            }
            aykl ayklVar = ayzkVar.f;
            if (ayklVar != null) {
                printWriter.println("  ContextSyncController");
                printWriter.println("    isRegisteredForMediaStateLocalUpdates=" + ayklVar.f);
            }
            ayyl ayylVar = ayzpVar.c;
            printWriter.println("  AdvertisingController");
            printWriter.println("    isAdvertising: " + ayylVar.l);
            fvjt fvjtVar = ayylVar.m;
            Objects.toString(fvjtVar);
            printWriter.println("    advertisingJob: ".concat(String.valueOf(fvjtVar)));
            printWriter.println("    isEligibleTablet: " + ayylVar.i.a(ayylVar.b, ayylVar.c));
        }
        ayxx ayxxVar6 = this.d;
        if (ayxxVar6 != null && (azdvVar = ayxxVar6.h) != null) {
            printWriter.println("  TidepoolSettingsSubDelegate");
            aybq aybqVar = azdvVar.a.c;
            printWriter.println("      CrossDeviceState: ".concat(azdr.a(azdq.a((azdr) aybqVar.b.b()))));
            azdp azdpVar = (azdp) aybqVar.c.b();
            printWriter.println("      CallTransferState: ".concat(azdp.a(azdpVar == null ? -1 : azdpVar.a)));
            azdk azdkVar = azdvVar.b;
            printWriter.println("  NearbyShareSettingsSubDelegate");
            printWriter.println("      NearbyShareVisibility: ".concat(azdw.b(((azdw) azdkVar.c.d.b()).a)));
        }
        ayxx ayxxVar7 = this.d;
        if (ayxxVar7 != null && ayxxVar7.i != null) {
            printWriter.println("CallTransferLifecycleDelegateImpl");
        }
        ayxx ayxxVar8 = this.d;
        if (ayxxVar8 != null && (aygfVar = ayxxVar8.m) != null) {
            printWriter.println("AppCapabilitiesMatchingLifecycleDelegateImpl");
            printWriter.println("AppCapabilitiesRequestController");
            printWriter.println("  ongoingRequests:");
            for (Object obj : ((ayff) aygfVar).d.d.keySet()) {
                fvbo.e(obj, "next(...)");
                ayfk ayfkVar = (ayfk) obj;
                printWriter.println("    request [id=" + ayfkVar.a + ", targetDevice=" + ayfkVar.b + "]");
            }
        }
        ayxx ayxxVar9 = this.d;
        if (ayxxVar9 == null || (aymlVar = ayxxVar9.o) == null) {
            return;
        }
        aymlVar.l(printWriter);
    }

    @Override // com.google.android.chimera.Service
    public final IBinder onBind(Intent intent) {
        if (intent != null) {
            intent.getAction();
        }
        if (asqh.c()) {
            arwm.h("Threading violation; must be called on main thread");
            if (fvbo.n(intent != null ? intent.getAction() : null, "com.google.android.gms.dtdi.core.lifecycle.action.BIND_PERSISTENT")) {
                return this.c.d;
            }
        }
        return null;
    }

    @Override // com.google.android.chimera.Service
    public final void onCreate() {
        Context a2;
        super.onCreate();
        if (asqh.c() && (a2 = AppContextProvider.a()) != null) {
            this.g = new bhib(a2, getClass(), 7, "LifecycleChimeraService");
        }
    }

    @Override // com.google.android.chimera.Service
    public final int onStartCommand(Intent intent, int i, int i2) {
        if (!asqh.c()) {
            stopSelf(i2);
            return 2;
        }
        if (!this.h) {
            this.h = true;
            new asmf(1, 9).submit(new Runnable() { // from class: ayxt
                @Override // java.lang.Runnable
                public final void run() {
                    egkp egkpVar;
                    Throwable th;
                    ayxs ayxsVar;
                    egjy d;
                    fuyx fuyxVar;
                    fuyx fuyxVar2;
                    fuyx fuyxVar3;
                    fuyx fuyxVar4;
                    fuyx fuyxVar5;
                    ayjv ayjvVar;
                    LifecycleChimeraService lifecycleChimeraService;
                    aybq aybqVar;
                    fuyx fuyxVar6;
                    ayig ayigVar;
                    ayov ayovVar;
                    ayoy ayoyVar;
                    aydv aydvVar;
                    aydu ayduVar;
                    azeh azehVar;
                    ayov ayovVar2;
                    ayig ayigVar2;
                    ayxz ayxzVar;
                    fuyx fuyxVar7;
                    LifecycleChimeraService lifecycleChimeraService2;
                    aydu ayduVar2;
                    int i3;
                    fuyx fuyxVar8;
                    aybq aybqVar2;
                    azdc azdcVar;
                    azda azdaVar;
                    aylv aylvVar;
                    ayml aymlVar;
                    aybq aybqVar3;
                    azdv azdvVar;
                    azfs azfsVar;
                    aypm aypmVar;
                    egkp egkpVar2;
                    Throwable th2;
                    Context applicationContext;
                    ayov ayovVar3;
                    fvic b;
                    PackageManager packageManager;
                    LifecycleChimeraService lifecycleChimeraService3;
                    aydv aydvVar2;
                    aydu ayduVar3;
                    ayov ayovVar4;
                    ayzp ayzpVar;
                    aypv aypvVar;
                    azge azgeVar;
                    azdt azdtVar;
                    fuyx fuyxVar9;
                    aypm aypmVar2;
                    ayov ayovVar5;
                    ayjv ayjvVar2;
                    ayng ayngVar;
                    azdc azdcVar2;
                    ayng ayngVar2;
                    azfn azfnVar;
                    azda azdaVar2;
                    ayxv ayxvVar;
                    ayml aymlVar2;
                    azdt azdtVar2;
                    aylv aylvVar2;
                    aygf aygfVar;
                    int i4;
                    aybh aybhVar;
                    egjy egjyVar;
                    aylw v;
                    PackageManager packageManager2;
                    ayfq ayfqVar;
                    ayml aymlVar3;
                    axzu a2;
                    axzr axzrVar;
                    egjy egjyVar2;
                    azdc azdcVar3;
                    azeh azehVar2;
                    LifecycleChimeraService lifecycleChimeraService4;
                    ((ejhf) LifecycleChimeraService.a.h()).x("Initializing lifecycle service");
                    LifecycleChimeraService lifecycleChimeraService5 = LifecycleChimeraService.this;
                    bhib bhibVar = lifecycleChimeraService5.g;
                    egkp k = bhibVar != null ? bhibVar.k("ensureAllFlagsRead") : null;
                    try {
                        ayrp ayrpVar = ayrq.a;
                        if (!ayrq.b) {
                            synchronized (ayrpVar) {
                                if (!ayrq.b) {
                                    fnjg.a.a().c();
                                    ayqe.a();
                                    ayqe.b();
                                    fnjk.a.a().b();
                                    ayqg.a();
                                    fnjn.a.a().d();
                                    ayqk.c();
                                    ayqk.a();
                                    ayqk.b();
                                    fnjq.c();
                                    fnjs.a.a().b();
                                    ayqm.a();
                                    fnjv.a.a().d();
                                    ayqq.c();
                                    ayqq.a();
                                    ayqq.b();
                                    fnjy.a.a().d();
                                    ayqu.c();
                                    ayqu.a();
                                    ayqu.b();
                                    fnkb.a.a().a();
                                    fnke.a.a().o();
                                    ayrj.d();
                                    ayrj.n();
                                    ayrj.g();
                                    ayrj.b();
                                    ayrj.c();
                                    ayrj.l();
                                    ayrj.j();
                                    ayrj.f();
                                    ayrj.i();
                                    ayrj.a();
                                    ayrj.k();
                                    ayrj.m();
                                    ayrj.h();
                                    ayrj.e();
                                    fnkh.a.a().b();
                                    ayrl.a();
                                    fnkk.a.a().c();
                                    ayro.a();
                                    ayro.b();
                                    fnkn.a.a().d();
                                    ayru.c();
                                    ayru.a();
                                    ayru.b();
                                    fnkq.a.a().t();
                                    ayso.e();
                                    ayso.g();
                                    ayso.d();
                                    ayso.i();
                                    ayso.h();
                                    ayso.l();
                                    ayso.s();
                                    ayso.a();
                                    ayso.o();
                                    ayso.n();
                                    ayso.b();
                                    ayso.c();
                                    ayso.m();
                                    ayso.r();
                                    ayso.q();
                                    ayso.j();
                                    ayso.f();
                                    ayso.k();
                                    ayso.p();
                                    fnkt.a.a().f();
                                    aysu.d();
                                    aysu.e();
                                    aysu.a();
                                    aysu.b();
                                    aysu.c();
                                    fnkw.a.a().b();
                                    aysw.a();
                                    fnkz.a.a().e();
                                    aytb.a();
                                    aytb.d();
                                    aytb.b();
                                    aytb.c();
                                    fnlc.a.a().b();
                                    aytd.a();
                                    ayrq.b = true;
                                }
                            }
                        }
                        fvaa.a(k, null);
                        ayxx ayxxVar = lifecycleChimeraService5.b;
                        fvbo.f(ayxxVar, "testOverridesComponentContainer");
                        bhib bhibVar2 = lifecycleChimeraService5.g;
                        egkp k2 = bhibVar2 != null ? bhibVar2.k("setupComponentContainerWithSeeds") : null;
                        try {
                            ayxsVar = lifecycleChimeraService5.e;
                            fvbo.f(ayxxVar, "overrideComponentContainer");
                            fuyx fuyxVar10 = ayxxVar.q;
                            if (fuyxVar10 == null) {
                                try {
                                    d = egmm.d("initMainCoroutineContext", egmn.a);
                                    try {
                                        asot asotVar = ayaw.a;
                                        fuyx a3 = ayaw.a(5);
                                        fvaa.a(d, null);
                                        fuyxVar = a3;
                                    } finally {
                                    }
                                } catch (Throwable th3) {
                                    th = th3;
                                    egkpVar = k2;
                                    try {
                                        throw th;
                                    } catch (Throwable th4) {
                                        fvaa.a(egkpVar, th);
                                        throw th4;
                                    }
                                }
                            } else {
                                fuyxVar = fuyxVar10;
                            }
                            fuyx fuyxVar11 = ayxxVar.q;
                            if (fuyxVar11 == null) {
                                d = egmm.d("initMainCoroutineContextWithJob", egmn.a);
                                try {
                                    fuyx a4 = ayax.a(fuyxVar);
                                    fvaa.a(d, null);
                                    fuyxVar11 = a4;
                                } finally {
                                    try {
                                        throw th;
                                    } finally {
                                    }
                                }
                            }
                            fuyx fuyxVar12 = ayxxVar.r;
                            if (fuyxVar12 == null) {
                                d = egmm.d("initHighSpeedCoroutineContext", egmn.a);
                                try {
                                    asot asotVar2 = ayaw.a;
                                    fuyx a5 = ayaw.a(2);
                                    fvaa.a(d, null);
                                    fuyxVar2 = a5;
                                } finally {
                                    try {
                                        throw th;
                                    } finally {
                                    }
                                }
                            } else {
                                fuyxVar2 = fuyxVar12;
                            }
                            fuyx fuyxVar13 = ayxxVar.r;
                            if (fuyxVar13 == null) {
                                d = egmm.d("initHighSpeedCoroutineWithJobContext", egmn.a);
                                try {
                                    fuyx a6 = ayax.a(fuyxVar2);
                                    fvaa.a(d, null);
                                    fuyxVar3 = a6;
                                } finally {
                                    try {
                                        throw th;
                                    } finally {
                                    }
                                }
                            } else {
                                fuyxVar3 = fuyxVar13;
                            }
                            fuyx fuyxVar14 = ayxxVar.t;
                            if (fuyxVar14 == null) {
                                d = egmm.d("initIOCoroutineContext", egmn.a);
                                try {
                                    asot asotVar3 = ayaw.a;
                                    fuyx a7 = ayaw.a(3);
                                    fvaa.a(d, null);
                                    fuyxVar4 = a7;
                                } finally {
                                    try {
                                        throw th;
                                    } finally {
                                    }
                                }
                            } else {
                                fuyxVar4 = fuyxVar14;
                            }
                            ayml aymlVar4 = ayxxVar.o;
                            if (aymlVar4 == null) {
                                d = egmm.d("initDeviceMap", egmn.a);
                                try {
                                    aymg aymgVar = new aymg();
                                    fvaa.a(d, null);
                                    aymlVar4 = aymgVar;
                                } finally {
                                    try {
                                        throw th;
                                    } finally {
                                    }
                                }
                            }
                            aybq aybqVar4 = ayxxVar.s;
                            if (aybqVar4 == null) {
                                d = egmm.d("initStateManager", egmn.a);
                                try {
                                    aybq aybqVar5 = new aybq();
                                    fvaa.a(d, null);
                                    aybqVar4 = aybqVar5;
                                } finally {
                                    try {
                                        throw th;
                                    } finally {
                                    }
                                }
                            }
                            ayxz ayxzVar2 = ayxxVar.n;
                            if (ayxzVar2 == null) {
                                d = egmm.d("initNPClientProvider", egmn.a);
                                try {
                                    ayxz ayxzVar3 = new ayxz(lifecycleChimeraService5);
                                    fvaa.a(d, null);
                                    ayxzVar2 = ayxzVar3;
                                } finally {
                                    try {
                                        throw th;
                                    } finally {
                                    }
                                }
                            }
                            ayjv ayjvVar3 = ayxxVar.u;
                            if (ayjvVar3 == null) {
                                d = egmm.d("initDdaApiThrottler", egmn.a);
                                try {
                                    fvic b2 = ayax.b(fuyxVar4);
                                    Context applicationContext2 = lifecycleChimeraService5.getApplicationContext();
                                    fvbo.e(applicationContext2, "getApplicationContext(...)");
                                    aygi aygiVar = new aygi(omg.THROTTLE_TYPE_GLOBAL_DDA_THROTTLE, new aygz(applicationContext2, b2, 14), b2);
                                    fuyxVar5 = fuyxVar11;
                                    ayjv ayjvVar4 = new ayjv(new ayjs(ayrj.p(), new dnlj()), aygiVar);
                                    fvaa.a(d, null);
                                    ayjvVar = ayjvVar4;
                                } finally {
                                    try {
                                        throw th;
                                    } finally {
                                    }
                                }
                            } else {
                                fuyxVar5 = fuyxVar11;
                                ayjvVar = ayjvVar3;
                            }
                            azeh azehVar3 = ayxxVar.A;
                            if (azehVar3 == null) {
                                d = egmm.d("initWakeupManagerProvider", egmn.a);
                                try {
                                    Context applicationContext3 = lifecycleChimeraService5.getApplicationContext();
                                    fvbo.e(applicationContext3, "getApplicationContext(...)");
                                    azeh azehVar4 = new azeh(applicationContext3, aybqVar4, ayax.b(fuyxVar2), applicationContext3.getPackageManager());
                                    fvaa.a(d, null);
                                    azehVar3 = azehVar4;
                                } finally {
                                    try {
                                        throw th;
                                    } finally {
                                    }
                                }
                            }
                            ayig ayigVar3 = ayxxVar.v;
                            if (ayigVar3 == null) {
                                d = egmm.d("initConnectionManagerProvider", egmn.a);
                                try {
                                    Context applicationContext4 = lifecycleChimeraService5.getApplicationContext();
                                    fvbo.e(applicationContext4, "getApplicationContext(...)");
                                    Context applicationContext5 = lifecycleChimeraService5.getApplicationContext();
                                    fvbo.e(applicationContext5, "getApplicationContext(...)");
                                    fvbo.f(applicationContext5, "context");
                                    lifecycleChimeraService = lifecycleChimeraService5;
                                    aybqVar = aybqVar4;
                                    fuyxVar6 = fuyxVar5;
                                    ayig ayigVar4 = new ayig(applicationContext4, new ayjp(new aygz(applicationContext5, null, 30), new dnlj()), aymlVar4, azehVar3);
                                    fvaa.a(d, null);
                                    ayigVar = ayigVar4;
                                } finally {
                                    try {
                                        throw th;
                                    } finally {
                                    }
                                }
                            } else {
                                lifecycleChimeraService = lifecycleChimeraService5;
                                aybqVar = aybqVar4;
                                fuyxVar6 = fuyxVar5;
                                ayigVar = ayigVar3;
                            }
                            ayov ayovVar6 = ayxxVar.x;
                            if (ayovVar6 == null) {
                                d = egmm.d("initDiscoveryManagerLegacyProvider", egmn.a);
                                try {
                                    ayov ayovVar7 = new ayov(aymlVar4, ayxzVar2, fuyxVar, fuyxVar2);
                                    fvaa.a(d, null);
                                    ayovVar = ayovVar7;
                                } finally {
                                    try {
                                        throw th;
                                    } finally {
                                    }
                                }
                            } else {
                                ayovVar = ayovVar6;
                            }
                            ayoy ayoyVar2 = ayxxVar.w;
                            if (ayoyVar2 != null) {
                                ayoyVar = ayoyVar2;
                            } else if (ayrl.b()) {
                                d = egmm.d("initDiscoveryManagerProvider", egmn.a);
                                try {
                                    ayoy ayoyVar3 = new ayoy(aymlVar4, ayxzVar2, ayax.b(fuyxVar2));
                                    fvaa.a(d, null);
                                    ayoyVar = ayoyVar3;
                                } finally {
                                    try {
                                        throw th;
                                    } finally {
                                    }
                                }
                            } else {
                                ayoyVar = null;
                            }
                            aydv aydvVar3 = ayxxVar.y;
                            if (aydvVar3 != null) {
                                aydvVar = aydvVar3;
                            } else if (ayrj.z()) {
                                d = egmm.d("initAdvertisingManagerProvider", egmn.a);
                                try {
                                    aydv aydvVar4 = new aydv(ayigVar, ayxzVar2, ayax.b(fuyxVar2));
                                    fvaa.a(d, null);
                                    aydvVar = aydvVar4;
                                } finally {
                                    try {
                                        throw th;
                                    } finally {
                                    }
                                }
                            } else {
                                aydvVar = null;
                            }
                            aydu ayduVar4 = ayxxVar.z;
                            if (ayduVar4 == null) {
                                d = egmm.d("initAdvertisingManagerLegacyProvider", egmn.a);
                                try {
                                    aydu ayduVar5 = new aydu(ayigVar, ayxzVar2, fuyxVar2);
                                    fvaa.a(d, null);
                                    ayduVar = ayduVar5;
                                } finally {
                                    try {
                                        throw th;
                                    } finally {
                                    }
                                }
                            } else {
                                ayduVar = ayduVar4;
                            }
                            if (ayxsVar.a(azdb.a())) {
                                egjy d2 = egmm.d("initPersistentLCDelegate", egmn.a);
                                try {
                                    azdc azdcVar4 = ayxxVar.d;
                                    if (azdcVar4 == null) {
                                        try {
                                            ayxzVar = ayxzVar2;
                                            fuyxVar7 = fuyxVar2;
                                            ayduVar2 = ayduVar;
                                            i3 = 3;
                                            azehVar2 = azehVar3;
                                            egjyVar2 = d2;
                                            lifecycleChimeraService4 = lifecycleChimeraService;
                                            fuyxVar8 = fuyxVar;
                                            aybqVar2 = aybqVar;
                                        } catch (Throwable th5) {
                                            th = th5;
                                            egjyVar2 = d2;
                                        }
                                        try {
                                            azdcVar3 = new azan(lifecycleChimeraService4, aymlVar4, ayovVar, ayigVar, azehVar2, ayax.b(fuyxVar6), ayax.b(fuyxVar3));
                                            lifecycleChimeraService2 = lifecycleChimeraService4;
                                            ayovVar2 = ayovVar;
                                            ayigVar2 = ayigVar;
                                            azehVar = azehVar2;
                                        } catch (Throwable th6) {
                                            th = th6;
                                            try {
                                                throw th;
                                            } finally {
                                            }
                                        }
                                    } else {
                                        azehVar = azehVar3;
                                        egjyVar2 = d2;
                                        ayovVar2 = ayovVar;
                                        ayigVar2 = ayigVar;
                                        ayxzVar = ayxzVar2;
                                        fuyxVar7 = fuyxVar2;
                                        lifecycleChimeraService2 = lifecycleChimeraService;
                                        ayduVar2 = ayduVar;
                                        i3 = 3;
                                        fuyxVar8 = fuyxVar;
                                        aybqVar2 = aybqVar;
                                        azdcVar3 = azdcVar4;
                                    }
                                    fvaa.a(egjyVar2, null);
                                    azdcVar = azdcVar3;
                                } catch (Throwable th7) {
                                    th = th7;
                                    egjyVar2 = d2;
                                }
                            } else {
                                azehVar = azehVar3;
                                ayovVar2 = ayovVar;
                                ayigVar2 = ayigVar;
                                ayxzVar = ayxzVar2;
                                fuyxVar7 = fuyxVar2;
                                lifecycleChimeraService2 = lifecycleChimeraService;
                                ayduVar2 = ayduVar;
                                i3 = 3;
                                fuyxVar8 = fuyxVar;
                                aybqVar2 = aybqVar;
                                azdcVar = null;
                            }
                            if (ayxsVar.a(azcz.a())) {
                                d = egmm.d("initAdvertisingSettingsLCDelegate", egmn.a);
                                try {
                                    azda azdaVar3 = ayxxVar.e;
                                    if (azdaVar3 == null) {
                                        azdaVar3 = new azaf(aydvVar, ayduVar2, aybqVar2, ayax.b(fuyxVar3));
                                    }
                                    fvaa.a(d, null);
                                    azdaVar = azdaVar3;
                                } finally {
                                    try {
                                        throw th;
                                    } finally {
                                    }
                                }
                            } else {
                                azdaVar = null;
                            }
                            if (ayxsVar.a(azds.a(lifecycleChimeraService2))) {
                                d = egmm.d("initContextSyncLCDelegate", egmn.a);
                                try {
                                    aylv aylvVar3 = ayxxVar.c;
                                    if (aylvVar3 == null) {
                                        Context applicationContext6 = lifecycleChimeraService2.getApplicationContext();
                                        fvbo.e(applicationContext6, "getApplicationContext(...)");
                                        aylvVar3 = new ayls(applicationContext6, aymlVar4, aybqVar2, (ayla) ayla.a.a());
                                    }
                                    fvaa.a(d, null);
                                    aylvVar = aylvVar3;
                                } finally {
                                    try {
                                        throw th;
                                    } finally {
                                    }
                                }
                            } else {
                                aylvVar = null;
                            }
                            if (ayxsVar.a(azdu.a())) {
                                d = egmm.d("initSettingsLCDelegate", egmn.a);
                                try {
                                    azdv azdvVar2 = ayxxVar.h;
                                    if (azdvVar2 == null) {
                                        Context applicationContext7 = lifecycleChimeraService2.getApplicationContext();
                                        fvbo.e(applicationContext7, "getApplicationContext(...)");
                                        aymlVar = aymlVar4;
                                        aybq aybqVar6 = aybqVar2;
                                        fuyx fuyxVar15 = fuyxVar7;
                                        azdvVar2 = new azdv(applicationContext7, aybqVar6, fuyxVar15, new azdn(applicationContext7, aybqVar2, azde.a, ayax.b(fuyxVar7)), new azdk(applicationContext7, aybqVar2, ayax.b(fuyxVar7)));
                                        aybqVar3 = aybqVar6;
                                        fuyxVar7 = fuyxVar15;
                                    } else {
                                        aymlVar = aymlVar4;
                                        aybqVar3 = aybqVar2;
                                    }
                                    fvaa.a(d, null);
                                    azdvVar = azdvVar2;
                                } finally {
                                    try {
                                        throw th;
                                    } finally {
                                    }
                                }
                            } else {
                                aymlVar = aymlVar4;
                                aybqVar3 = aybqVar2;
                                azdvVar = null;
                            }
                            if (ayxsVar.a(azfr.a(lifecycleChimeraService2))) {
                                d = egmm.d("initCastReceiverLCDelegate", egmn.a);
                                try {
                                    azfs azfsVar2 = ayxxVar.g;
                                    if (azfsVar2 == null) {
                                        Context applicationContext8 = lifecycleChimeraService2.getApplicationContext();
                                        fvbo.e(applicationContext8, "getApplicationContext(...)");
                                        azfsVar2 = new azfq(applicationContext8);
                                    }
                                    fvaa.a(d, null);
                                    azfsVar = azfsVar2;
                                } finally {
                                    try {
                                        throw th;
                                    } finally {
                                    }
                                }
                            } else {
                                azfsVar = null;
                            }
                            if (ayru.e() && ayxsVar.a(aypl.a())) {
                                d = egmm.d("initDiscoveryLCDelegate", egmn.a);
                                try {
                                    aypm aypmVar3 = ayxxVar.j;
                                    if (aypmVar3 == null) {
                                        aypmVar3 = new aynx(ayovVar2);
                                    }
                                    fvaa.a(d, null);
                                    aypmVar = aypmVar3;
                                } finally {
                                    try {
                                        throw th;
                                    } finally {
                                    }
                                }
                            } else {
                                aypmVar = null;
                            }
                            try {
                                if (ayxsVar.a(azds.a(lifecycleChimeraService2))) {
                                    try {
                                        egjy d3 = egmm.d("initDockingStateProvider", egmn.a);
                                        try {
                                            aypv aypvVar2 = ayxxVar.p;
                                            if (aypvVar2 == null) {
                                                try {
                                                    aypvVar2 = new aypt(lifecycleChimeraService2);
                                                } catch (Throwable th8) {
                                                    th2 = th8;
                                                    egkpVar2 = k2;
                                                    try {
                                                        throw th2;
                                                    } catch (Throwable th9) {
                                                        fvaa.a(d3, th2);
                                                        throw th9;
                                                    }
                                                }
                                            }
                                            aypv aypvVar3 = aypvVar2;
                                            fvaa.a(d3, null);
                                            egjy d4 = egmm.d("initOrchestrationLCDelegate", egmn.a);
                                            try {
                                                applicationContext = lifecycleChimeraService2.getApplicationContext();
                                                fvbo.e(applicationContext, "getApplicationContext(...)");
                                                ayovVar3 = ayovVar2;
                                                b = ayax.b(fuyxVar8);
                                                packageManager = applicationContext.getPackageManager();
                                            } catch (Throwable th10) {
                                                th = th10;
                                                egkpVar2 = k2;
                                            }
                                            try {
                                                if (packageManager == null) {
                                                    throw new IllegalStateException("Required value was null.");
                                                }
                                                aydu ayduVar6 = ayduVar2;
                                                aydv aydvVar5 = aydvVar;
                                                lifecycleChimeraService3 = lifecycleChimeraService2;
                                                ayyl ayylVar = new ayyl(applicationContext, aydvVar5, ayduVar6, aypvVar3, new ayyn(packageManager), new ayyy(applicationContext), aspu.a(applicationContext), b);
                                                aydvVar2 = aydvVar5;
                                                ayduVar3 = ayduVar6;
                                                asiu.a();
                                                asiu.a();
                                                ayyo ayyoVar = new ayyo(applicationContext, aspu.a(applicationContext));
                                                aybh aybhVar2 = new aybh(applicationContext);
                                                String packageName = applicationContext.getPackageName();
                                                fvbo.e(packageName, "getPackageName(...)");
                                                ayyr ayyrVar = new ayyr(applicationContext, packageName);
                                                new ayyq(applicationContext);
                                                ayyv ayyvVar = new ayyv(applicationContext, ayyoVar, aybhVar2, ayyrVar);
                                                egkpVar2 = k2;
                                                ayig ayigVar5 = ayigVar2;
                                                ayml aymlVar5 = aymlVar;
                                                ayzk ayzkVar = new ayzk(applicationContext, ayovVar3, ayyvVar, new ayyy(applicationContext), aymlVar5, ayigVar5);
                                                ayovVar4 = ayovVar3;
                                                aymlVar = aymlVar5;
                                                ayigVar2 = ayigVar5;
                                                ayzp ayzpVar2 = new ayzp(applicationContext, b, ayylVar, ayzkVar);
                                                fvaa.a(d4, null);
                                                ayzpVar = ayzpVar2;
                                                aypvVar = aypvVar3;
                                            } catch (Throwable th11) {
                                                th = th11;
                                                Throwable th12 = th;
                                                try {
                                                    throw th12;
                                                } catch (Throwable th13) {
                                                    fvaa.a(d4, th12);
                                                    throw th13;
                                                }
                                            }
                                        } catch (Throwable th14) {
                                            egkpVar2 = k2;
                                            th2 = th14;
                                        }
                                    } catch (Throwable th15) {
                                        th = th15;
                                        egkpVar2 = k2;
                                        th = th;
                                        egkpVar = egkpVar2;
                                        throw th;
                                    }
                                } else {
                                    ayovVar4 = ayovVar2;
                                    aydvVar2 = aydvVar;
                                    egkpVar2 = k2;
                                    ayduVar3 = ayduVar2;
                                    lifecycleChimeraService3 = lifecycleChimeraService2;
                                    ayzpVar = null;
                                    aypvVar = null;
                                }
                            } catch (Throwable th16) {
                                th = th16;
                                th = th;
                                egkpVar = egkpVar2;
                                throw th;
                            }
                        } catch (Throwable th17) {
                            th = th17;
                            egkpVar = k2;
                        }
                        try {
                            if (ayxsVar.a(azds.a(lifecycleChimeraService3))) {
                                d = egmm.d("initMediaTransferLCDelegate", egmn.a);
                                try {
                                    azge azgeVar2 = ayxxVar.f;
                                    if (azgeVar2 == null) {
                                        enop enopVar = enop.a;
                                        new byhr(Looper.getMainLooper());
                                        new azfu(lifecycleChimeraService3, null, 30);
                                        azgeVar2 = new azga(lifecycleChimeraService3, enopVar, new azgc(null));
                                    }
                                    fvaa.a(d, null);
                                    azgeVar = azgeVar2;
                                } finally {
                                    try {
                                        throw th;
                                    } finally {
                                    }
                                }
                            } else {
                                azgeVar = null;
                            }
                            if (ayxsVar.a(azds.a(lifecycleChimeraService3))) {
                                d = egmm.d("initMediaTransferSettingLCDelegate", egmn.a);
                                try {
                                    azdt azdtVar3 = ayxxVar.k;
                                    if (azdtVar3 == null) {
                                        Context applicationContext9 = lifecycleChimeraService3.getApplicationContext();
                                        fvbo.e(applicationContext9, "getApplicationContext(...)");
                                        azdtVar3 = new azdt(applicationContext9);
                                    }
                                    fvaa.a(d, null);
                                    azdtVar = azdtVar3;
                                } finally {
                                    try {
                                        throw th;
                                    } finally {
                                    }
                                }
                            } else {
                                azdtVar = null;
                            }
                            if (azdtVar != null) {
                                azdtVar.b = new aybh(azdtVar.a);
                            }
                            int i5 = ayng.m;
                            if (ayxsVar.a(aynf.a())) {
                                d = egmm.d("initDirectDeviceAccessLCDelegate", egmn.a);
                                try {
                                    ayng ayngVar3 = ayxxVar.l;
                                    if (ayngVar3 == null) {
                                        Context applicationContext10 = lifecycleChimeraService3.getApplicationContext();
                                        fvbo.e(applicationContext10, "getApplicationContext(...)");
                                        aypj aypjVar = new aypj(applicationContext10);
                                        ayml aymlVar6 = aymlVar;
                                        ayne ayneVar = new ayne(applicationContext10, ayovVar4, ayigVar2, aymlVar6, ayjvVar, fuyxVar8, aypjVar, new ayph(applicationContext10, aypjVar));
                                        aymlVar = aymlVar6;
                                        fuyxVar9 = fuyxVar8;
                                        aypmVar2 = aypmVar;
                                        ayovVar5 = ayovVar4;
                                        ayjvVar2 = ayjvVar;
                                        ayngVar3 = ayneVar;
                                    } else {
                                        fuyxVar9 = fuyxVar8;
                                        aypmVar2 = aypmVar;
                                        ayovVar5 = ayovVar4;
                                        ayjvVar2 = ayjvVar;
                                    }
                                    fvaa.a(d, null);
                                    ayngVar = ayngVar3;
                                } finally {
                                    try {
                                        throw th;
                                    } finally {
                                    }
                                }
                            } else {
                                fuyxVar9 = fuyxVar8;
                                aypmVar2 = aypmVar;
                                ayovVar5 = ayovVar4;
                                ayjvVar2 = ayjvVar;
                                ayngVar = null;
                            }
                            Set set = azfn.f;
                            if (ayxsVar.a(azfm.a())) {
                                d = egmm.d("initCallTransferLCDelegate", egmn.a);
                                try {
                                    azfn azfnVar2 = ayxxVar.i;
                                    if (azfnVar2 == null) {
                                        Context applicationContext11 = lifecycleChimeraService3.getApplicationContext();
                                        fvbo.e(applicationContext11, "getApplicationContext(...)");
                                        asiu.a();
                                        asot asotVar4 = ayaw.a;
                                        aybq aybqVar7 = aybqVar3;
                                        azfnVar2 = new azfl(applicationContext11, ayngVar, aybqVar7, ayax.b(ayax.a(ayaw.a(2))), new ayph(applicationContext11));
                                        aybqVar3 = aybqVar7;
                                        azdcVar2 = azdcVar;
                                        ayngVar2 = ayngVar;
                                    } else {
                                        azdcVar2 = azdcVar;
                                        ayngVar2 = ayngVar;
                                    }
                                    fvaa.a(d, null);
                                    azfnVar = azfnVar2;
                                } finally {
                                    try {
                                        throw th;
                                    } finally {
                                    }
                                }
                            } else {
                                azdcVar2 = azdcVar;
                                ayngVar2 = ayngVar;
                                azfnVar = null;
                            }
                            if (!ayxsVar.a(ayqb.a()) || aydvVar2 == null || ayoyVar == null) {
                                azdaVar2 = azdaVar;
                                ayxvVar = null;
                            } else {
                                d = egmm.d("initFastInitLCDelegate", egmn.a);
                                try {
                                    ayxv ayxvVar2 = ayxxVar.B;
                                    if (ayxvVar2 == null) {
                                        ayxvVar2 = new ayqa(ayax.b(fuyxVar7), aydvVar2, ayoyVar);
                                    }
                                    fvaa.a(d, null);
                                    azdaVar2 = azdaVar;
                                    ayxvVar = ayxvVar2;
                                } finally {
                                    try {
                                        throw th;
                                    } finally {
                                    }
                                }
                            }
                            onm onmVar = aygf.i;
                            if (ayxsVar.a(ayfu.a())) {
                                egjy d5 = egmm.d("initAppCapabilitiesMatchingLCDelegate", egmn.a);
                                try {
                                    aygf aygfVar2 = ayxxVar.m;
                                    if (aygfVar2 == null) {
                                        Context applicationContext12 = lifecycleChimeraService3.getApplicationContext();
                                        fvbo.e(applicationContext12, "getApplicationContext(...)");
                                        fvic b3 = ayax.b(fuyxVar4);
                                        try {
                                            v = AppCapabilitiesMatchingDatabase.l.a().v();
                                            packageManager2 = applicationContext12.getPackageManager();
                                            ayig ayigVar6 = ayigVar2;
                                            aymlVar3 = aymlVar;
                                            azdtVar2 = azdtVar;
                                            ayfqVar = new ayfq(applicationContext12, ayigVar6, aymlVar3, b3, v, packageManager2);
                                            ayigVar2 = ayigVar6;
                                            a2 = axzt.a(applicationContext12, 1);
                                            axzrVar = new axzr(applicationContext12);
                                            asot asotVar5 = ayaw.a;
                                            egjyVar = d5;
                                        } catch (Throwable th18) {
                                            th = th18;
                                            egjyVar = d5;
                                        }
                                        try {
                                            aymlVar2 = aymlVar3;
                                            aygfVar2 = new ayff(aymlVar3, applicationContext12, ayjvVar2, ayigVar2, b3, v, packageManager2, ayfqVar, new ayey(applicationContext12, a2, axzrVar, ayax.b(ayaw.a(i3))));
                                        } catch (Throwable th19) {
                                            th = th19;
                                            try {
                                                throw th;
                                            } finally {
                                            }
                                        }
                                    } else {
                                        egjyVar = d5;
                                        aymlVar2 = aymlVar;
                                        azdtVar2 = azdtVar;
                                    }
                                    fvaa.a(egjyVar, null);
                                    aylvVar2 = aylvVar;
                                    aygfVar = aygfVar2;
                                } catch (Throwable th20) {
                                    th = th20;
                                    egjyVar = d5;
                                }
                            } else {
                                aymlVar2 = aymlVar;
                                azdtVar2 = azdtVar;
                                aylvVar2 = aylvVar;
                                aygfVar = null;
                            }
                            ayig ayigVar7 = ayigVar2;
                            azda azdaVar4 = azdaVar2;
                            ayxx ayxxVar2 = new ayxx(ayzpVar, aylvVar2, azdcVar2, azdaVar4, azgeVar, azfsVar, azdvVar, azfnVar, aypmVar2, azdtVar2, ayngVar2, ayxvVar, aygfVar, ayxzVar, ayigVar7, ayoyVar, ayovVar5, aydvVar2, ayduVar3, azehVar, aymlVar2, aypvVar, fuyxVar9, fuyxVar7, aybqVar3, fuyxVar4, ayjvVar2);
                            fvaa.a(egkpVar2, null);
                            d = egmm.d("injectDependency", egmn.a);
                            try {
                                ayoy ayoyVar4 = ayxxVar2.w;
                                aymi aymfVar = (!ayrl.b() || ayoyVar4 == null) ? ayxxVar2.x : new aymf(ayoyVar4);
                                ayml aymlVar7 = ayxxVar2.o;
                                if (aymlVar7 != null) {
                                    aymlVar7.m(aymfVar, ayxxVar2.v);
                                }
                                azdc azdcVar5 = ayxxVar2.d;
                                if (azdcVar5 != null) {
                                    ((azan) azdcVar5).l = ayxxVar2.i;
                                }
                                lifecycleChimeraService3.c.e = (azan) (true != (azdcVar5 instanceof azan) ? null : azdcVar5);
                                aylv aylvVar4 = ayxxVar2.c;
                                aylv aylvVar5 = true != (aylvVar4 instanceof ayls) ? null : aylvVar4;
                                if (aylvVar5 != null) {
                                    ((ayls) aylvVar5).g = azdcVar5;
                                }
                                azge azgeVar3 = ayxxVar2.f;
                                if (azgeVar3 != null) {
                                    ((azga) azgeVar3).h = azdcVar5;
                                    if (azdcVar5 != null) {
                                        azdcVar5.b("com.google.android.gms.dtdi.MediaTransferChannel", ((azga) azgeVar3).j);
                                    }
                                }
                                if (azgeVar3 != null) {
                                    ((azga) azgeVar3).g = ayxxVar2.b;
                                }
                                ayzu ayzuVar = ayxxVar2.b;
                                if (ayzuVar != null) {
                                    ayzk ayzkVar2 = ((ayzp) ayzuVar).d;
                                    ayyv ayyvVar2 = ayzkVar2.b;
                                    ((ejhf) ayyv.a.h()).B("MTSettingDebug injectSyncLifecycleDelegate %s, listening for media state events", aylvVar4);
                                    ayyvVar2.e = aylvVar4;
                                    if (ayso.v()) {
                                        ((ejhf) ayzk.a.h()).x("MTDebug OrchestrationController initializing ContextSyncController during dependency injection.");
                                    }
                                    if (aylvVar4 != null) {
                                        ayzkVar2.f = new aykl(aylvVar4, "OrchestrationController", new ayzc(ayzkVar2));
                                    } else {
                                        ((ejhf) ayzk.a.j()).x("MTDebug not eligible to connect to Sync due to null delegate");
                                    }
                                    ((ayzp) ayzuVar).c.j = aylvVar4;
                                }
                                if (ayzuVar != null) {
                                    azdt azdtVar4 = ayxxVar2.k;
                                    ayzk ayzkVar3 = ((ayzp) ayzuVar).d;
                                    ayzkVar3.d = azdtVar4;
                                    azdt azdtVar5 = ayzkVar3.d;
                                    if (azdtVar5 != null) {
                                        azdtVar5.a(ayzkVar3.i);
                                    }
                                }
                                azfs azfsVar3 = ayxxVar2.g;
                                if (azfsVar3 != null) {
                                    ((azfq) azfsVar3).c = aylvVar4;
                                }
                                if (azfsVar3 != null) {
                                    ((azfq) azfsVar3).d = azdcVar5;
                                }
                                if (ayru.e()) {
                                    if (azdcVar5 != null) {
                                        ((azan) azdcVar5).k = ayxxVar2.j;
                                    }
                                    if (ayzuVar != null) {
                                        ((ayzp) ayzuVar).d.e = ayxxVar2.j;
                                    }
                                }
                                if (aytb.e() && azdcVar5 != null) {
                                    ((azan) azdcVar5).i = ayzuVar;
                                }
                                if (azdcVar5 != null) {
                                    ((azan) azdcVar5).j = ayxxVar2.h;
                                }
                                if (azdcVar5 != null) {
                                    ((azan) azdcVar5).g = ayxxVar2.k;
                                }
                                if (azdcVar5 != null) {
                                    ((azan) azdcVar5).h = ayxxVar2.l;
                                }
                                if (azdcVar5 != null) {
                                    ((azan) azdcVar5).m = ayxxVar2.m;
                                }
                                fvaa.a(d, null);
                                d = egmm.d("startSettingsDelegateBackground", egmn.a);
                                try {
                                    azdv azdvVar3 = ayxxVar2.h;
                                    if (azdvVar3 != null) {
                                        azdn azdnVar = azdvVar3.a;
                                        i4 = i3;
                                        fvgt.b(azdnVar.e, null, null, new azdm(azdnVar, null), i4);
                                        boolean o = ayrj.o();
                                        azdk azdkVar = azdvVar3.b;
                                        if (o) {
                                            Context context = azdkVar.b;
                                            fvbo.f(context, "context");
                                            Intent type = new Intent("com.google.android.gms.SHARE_NEARBY").setPackage("com.google.android.gms").setType("*/*");
                                            fvbo.e(type, "setType(...)");
                                            List<ResolveInfo> queryIntentActivities = context.getPackageManager().queryIntentActivities(type, 0);
                                            fvbo.e(queryIntentActivities, "queryIntentActivities(...)");
                                            if (queryIntentActivities.isEmpty()) {
                                                ((ejhf) azdk.a.h()).x("Not registering NS state observer: NS is not available");
                                            }
                                        }
                                        ((ejhf) azdk.a.h()).x("Registering NS state observer");
                                        azdkVar.a().t(azdkVar.d);
                                        azdkVar.b();
                                    } else {
                                        i4 = i3;
                                    }
                                    Throwable th21 = null;
                                    fvaa.a(d, null);
                                    egmn egmnVar = egmn.a;
                                    fvaa.a(egmm.d("startDirectDeviceAccessDelegateBackground", egmnVar), null);
                                    fvaa.a(egmm.d("startCallTransferDelegateBackground", egmnVar), null);
                                    fvaa.a(egmm.d("startPersistentDelegateBackground", egmnVar), null);
                                    d = egmm.d("startAdvertisingSettingsDelegateBackground", egmnVar);
                                    try {
                                        azda azdaVar5 = ayxxVar2.e;
                                        if (azdaVar5 != null) {
                                            fvgt.b(((azaf) azdaVar5).c, null, null, new azae((azaf) azdaVar5, null), i4);
                                            ((ejhf) azaf.a.h()).x("DTDI Persistent service started!");
                                            th21 = null;
                                        }
                                        fvaa.a(d, th21);
                                        d = egmm.d("startAppCapabilitiesMatchingDelegateBackground", egmn.a);
                                        try {
                                            aygf aygfVar3 = ayxxVar2.m;
                                            if (aygfVar3 != null) {
                                                synchronized (((ayff) aygfVar3).e) {
                                                    if (!((ayff) aygfVar3).f) {
                                                        ((ayff) aygfVar3).f = true;
                                                        ((ayff) aygfVar3).h.a().x("com.google.android.gms.dtdi.AppCapabilitiesChannel", ((ayff) aygfVar3).g);
                                                    }
                                                }
                                            }
                                            fvaa.a(d, null);
                                            d = egmm.d("startFastInitDelegateBackground", egmn.a);
                                            try {
                                                ayxv ayxvVar3 = ayxxVar2.B;
                                                if (ayxvVar3 != null) {
                                                    aypx aypxVar = new aypx((ayqa) ayxvVar3, null);
                                                    fvic fvicVar = ((ayqa) ayxvVar3).a;
                                                    fvgt.b(fvicVar, null, null, aypxVar, i4);
                                                    fvgt.b(fvicVar, null, null, new aypy((ayqa) ayxvVar3, null), i4);
                                                    fvgt.b(fvicVar, null, null, new aypz((ayqa) ayxvVar3, null), i4);
                                                }
                                                fvaa.a(d, null);
                                                d = egmm.d("startSyncDelegate", egmn.a);
                                                try {
                                                    aylv aylvVar6 = ayxxVar2.c;
                                                    if (aylvVar6 != null) {
                                                        if (ayrj.t()) {
                                                            final ayls aylsVar = (ayls) aylvVar6;
                                                            aylj.b(new Runnable() { // from class: aylc
                                                                @Override // java.lang.Runnable
                                                                public final void run() {
                                                                    ayls.this.c();
                                                                }
                                                            });
                                                        } else {
                                                            final ayls aylsVar2 = (ayls) aylvVar6;
                                                            aylu.a(new Runnable() { // from class: ayld
                                                                @Override // java.lang.Runnable
                                                                public final void run() {
                                                                    ayls.this.c();
                                                                }
                                                            });
                                                        }
                                                    }
                                                    fvaa.a(d, null);
                                                    d = egmm.d("startOrchestrationDelegate", egmn.a);
                                                    try {
                                                        ayzu ayzuVar2 = ayxxVar2.b;
                                                        if (ayzuVar2 != null) {
                                                            ((ejhf) ayzp.a.h()).x("Starting service.");
                                                            if (ayrj.t()) {
                                                                ((ayzp) ayzuVar2).a();
                                                            } else {
                                                                final ayzp ayzpVar3 = (ayzp) ayzuVar2;
                                                                aylu.a(new Runnable() { // from class: ayzl
                                                                    @Override // java.lang.Runnable
                                                                    public final void run() {
                                                                        ayzp.this.a();
                                                                    }
                                                                });
                                                            }
                                                        }
                                                        fvaa.a(d, null);
                                                        d = egmm.d("startMediaTransferDelegate", egmn.a);
                                                        try {
                                                            azge azgeVar4 = ayxxVar2.f;
                                                            if (azgeVar4 != null) {
                                                                if (((azga) azgeVar4).d == null) {
                                                                    ((azga) azgeVar4).d = atm$$ExternalSyntheticApiModelOutline0.m(((azga) azgeVar4).b.getSystemService(atm$$ExternalSyntheticApiModelOutline0.m181m$1()));
                                                                }
                                                                if (ayrj.t()) {
                                                                    ayzu ayzuVar3 = ((azga) azgeVar4).g;
                                                                    if (ayzuVar3 != null) {
                                                                        ayzuVar3.b(((azga) azgeVar4).m);
                                                                    }
                                                                } else {
                                                                    final azga azgaVar = (azga) azgeVar4;
                                                                    aylu.a(new Runnable() { // from class: azfx
                                                                        @Override // java.lang.Runnable
                                                                        public final void run() {
                                                                            azga azgaVar2 = azga.this;
                                                                            ayzu ayzuVar4 = azgaVar2.g;
                                                                            if (ayzuVar4 != null) {
                                                                                ayzuVar4.b(azgaVar2.m);
                                                                            }
                                                                        }
                                                                    });
                                                                }
                                                            }
                                                            fvaa.a(d, null);
                                                            d = egmm.d("startCastReceiverDelegate", egmn.a);
                                                            try {
                                                                azfs azfsVar4 = ayxxVar2.g;
                                                                if (azfsVar4 != null) {
                                                                    if (ayrj.t()) {
                                                                        ((azfq) azfsVar4).a();
                                                                    } else {
                                                                        final azfq azfqVar = (azfq) azfsVar4;
                                                                        aylu.a(new Runnable() { // from class: azfo
                                                                            @Override // java.lang.Runnable
                                                                            public final void run() {
                                                                                azfq.this.a();
                                                                            }
                                                                        });
                                                                    }
                                                                }
                                                                fvaa.a(d, null);
                                                                d = egmm.d("startMediaTransferSettingsDelegate", egmn.a);
                                                                try {
                                                                    azdt azdtVar6 = ayxxVar2.k;
                                                                    if (azdtVar6 != null && (aybhVar = azdtVar6.b) != null) {
                                                                        azdg azdgVar = azdtVar6.d;
                                                                        fvbo.f(azdgVar, "listener");
                                                                        aybhVar.c.add(azdgVar);
                                                                    }
                                                                    fvaa.a(d, null);
                                                                    lifecycleChimeraService3.d = ayxxVar2;
                                                                    lifecycleChimeraService3.f = true;
                                                                    lifecycleChimeraService3.c.c.set(true);
                                                                    ((ejhf) LifecycleChimeraService.a.h()).x("Finished delegate init");
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
                        } catch (Throwable th22) {
                            th = th22;
                            egkpVar = egkpVar2;
                            th = th;
                            throw th;
                        }
                    } finally {
                    }
                }
            });
        }
        return 1;
    }

    public LifecycleChimeraService(ayxx ayxxVar) {
        fvbo.f(ayxxVar, "testOverridesComponentContainer");
        this.b = ayxxVar;
        this.c = azap.b;
        this.e = new ayxs();
    }

    public /* synthetic */ LifecycleChimeraService(ayxx ayxxVar, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? ayxx.a : ayxxVar);
    }
}
