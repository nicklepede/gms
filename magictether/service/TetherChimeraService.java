package com.google.android.gms.magictether.service;

import android.accounts.Account;
import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.wifi.WifiConfiguration;
import android.net.wifi.WifiInfo;
import android.net.wifi.WifiManager;
import android.net.wifi.sharedconnectivity.app.SharedConnectivitySettingsState;
import android.os.IBinder;
import com.google.android.chimera.Service;
import com.google.android.gms.chimera.modules.auth.magictether.AppContextProvider;
import com.google.android.gms.libs.punchclock.tracing.TracingBroadcastReceiver;
import com.google.android.gms.magictether.service.TetherChimeraService;
import defpackage.a;
import defpackage.athr;
import defpackage.aupz;
import defpackage.auqx;
import defpackage.ausn;
import defpackage.cdub;
import defpackage.cduo;
import defpackage.cdup;
import defpackage.cduu;
import defpackage.cduy;
import defpackage.cdvm;
import defpackage.cdxf;
import defpackage.cdxg;
import defpackage.cdxj;
import defpackage.cdyn;
import defpackage.cdyr;
import defpackage.cdzb;
import defpackage.cdzs;
import defpackage.cdzw;
import defpackage.cdzz;
import defpackage.ceaa;
import defpackage.ceaj;
import defpackage.ceam;
import defpackage.cebd;
import defpackage.cebs;
import defpackage.cecb;
import defpackage.cecc;
import defpackage.cecd;
import defpackage.cece;
import defpackage.cedq;
import defpackage.cedu;
import defpackage.cedv;
import defpackage.cedw;
import defpackage.ceea;
import defpackage.ceeb;
import defpackage.ceec;
import defpackage.ceeg;
import defpackage.ceen;
import defpackage.ceet;
import defpackage.chdc;
import defpackage.chdd;
import defpackage.chde;
import defpackage.dhlk;
import defpackage.dhlw;
import defpackage.dhmr;
import defpackage.dyej;
import defpackage.ekvj;
import defpackage.ekvl;
import defpackage.eluo;
import defpackage.eqgo;
import defpackage.fssz;
import defpackage.fstg;
import defpackage.ftcq;
import defpackage.ftct;
import defpackage.ftcw;
import defpackage.ftdd;
import defpackage.ftdh;
import defpackage.fxqz;
import defpackage.fxtb;
import defpackage.fxwo;
import defpackage.fxxm;
import defpackage.fxze;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.Calendar;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Timer;
import java.util.TimerTask;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes5.dex */
public class TetherChimeraService extends Service {
    public static final ausn a = cebs.a("TetherService");
    public static BluetoothStateChangeReceiver b;
    public static TracingBroadcastReceiver c;
    public eqgo d;
    public ceaa e;
    public cdup f;
    public cecc g;
    public Timer h;
    public TimerTask i;
    public ceeb j;
    ceeg k;
    public dhlw l;
    public dhlw m;
    public final Object n;
    cedq o;
    public cedw p;
    public cedv q;
    public cedu r;
    private ConnectivityManager s;
    private WifiManager t;
    private List u;
    private final Object v;

    /* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
    public class BluetoothStateChangeReceiver extends TracingBroadcastReceiver {
        public BluetoothStateChangeReceiver() {
            super("auth_magictether");
        }

        @Override // com.google.android.gms.libs.punchclock.tracing.TracingBroadcastReceiver
        public final void jP(Context context, Intent intent) {
            ((eluo) ((eluo) TetherChimeraService.a.h()).ai((char) 6248)).z("BluetoothStateChangeReceiver: %s", intent.getIntExtra("android.bluetooth.adapter.extra.STATE", 0));
            context.startService(ceec.a());
        }
    }

    public TetherChimeraService() {
        this(new aupz(1, 10));
    }

    public static final cecd j() {
        return cecd.c(AppContextProvider.a());
    }

    private final void k(final boolean z, final boolean z2) {
        cdvm a2 = cdvm.a();
        final dhlw d = (!a2.w() || a2.k.k().c()) ? dhmr.d(null) : a2.c(a2.i.b().c());
        this.l = d;
        d.x(new dhlk() { // from class: cedt
            @Override // defpackage.dhlk
            public final void hH(dhlw dhlwVar) {
                dhlw dhlwVar2 = d;
                TetherChimeraService tetherChimeraService = TetherChimeraService.this;
                if (dhlwVar2 != tetherChimeraService.l) {
                    ((eluo) ((eluo) TetherChimeraService.a.h()).ai((char) 6268)).x("isClientRoleRunningTask changed, ignoring result");
                    return;
                }
                boolean z3 = z2;
                if (!dhlwVar.m() || dhlwVar.i() == null) {
                    tetherChimeraService.f(z, z3);
                    return;
                }
                Boolean bool = (Boolean) dhlwVar.i();
                ekvl.y(bool);
                tetherChimeraService.f(bool.booleanValue(), z3);
            }
        });
    }

    private final void l(final boolean z) {
        cebd a2 = cebd.a();
        final dhlw d = (!a2.i() || a2.h.k().c()) ? dhmr.d(null) : a2.b(a2.f.b().b());
        this.m = d;
        d.x(new dhlk() { // from class: cedr
            @Override // defpackage.dhlk
            public final void hH(dhlw dhlwVar) {
                dhlw dhlwVar2 = d;
                final TetherChimeraService tetherChimeraService = TetherChimeraService.this;
                if (dhlwVar2 != tetherChimeraService.m) {
                    ((eluo) ((eluo) TetherChimeraService.a.h()).ai((char) 6269)).x("isHostRoleRunningTask changed, ignoring result");
                    return;
                }
                final boolean z2 = z;
                if (dhlwVar.m() && dhlwVar.i() != null) {
                    Boolean bool = (Boolean) dhlwVar.i();
                    ekvl.y(bool);
                    z2 = bool.booleanValue();
                }
                if (fstg.a.lK().H()) {
                    tetherChimeraService.d.execute(new Runnable() { // from class: ceds
                        @Override // java.lang.Runnable
                        public final void run() {
                            TetherChimeraService.this.g(z2);
                        }
                    });
                } else {
                    tetherChimeraService.g(z2);
                }
            }
        });
    }

    private final boolean m(NetworkCapabilities networkCapabilities, Integer num) {
        WifiConfiguration wifiConfiguration;
        if (networkCapabilities == null) {
            ((eluo) ((eluo) a.h()).ai((char) 6256)).x("networkCapabilities is null");
            return false;
        }
        ausn ausnVar = a;
        ((eluo) ((eluo) ausnVar.h()).ai(6255)).T("TRANSPORT_CELLULAR [%s], TRANSPORT_ETHERNET [%s], TRANSPORT_WIFI [%s]", Boolean.valueOf(networkCapabilities.hasTransport(0)), Boolean.valueOf(networkCapabilities.hasTransport(3)), Boolean.valueOf(networkCapabilities.hasTransport(1)));
        if (networkCapabilities.hasTransport(0) || networkCapabilities.hasTransport(3)) {
            return true;
        }
        if (networkCapabilities.hasTransport(1) && fstg.x()) {
            if (num == null) {
                ((eluo) ((eluo) ausnVar.j()).ai((char) 6267)).x("networkId is null");
                return false;
            }
            WifiManager wifiManager = this.t;
            if (wifiManager == null) {
                ((eluo) ((eluo) ausnVar.j()).ai((char) 6266)).x("WifiManager is null");
                return false;
            }
            if (wifiManager.getConfiguredNetworks().isEmpty()) {
                ((eluo) ((eluo) ausnVar.i()).ai((char) 6265)).x("configuredNetworks is empty, can not get Wifi security types for role switching");
                return false;
            }
            Iterator<WifiConfiguration> it = this.t.getConfiguredNetworks().iterator();
            while (true) {
                if (!it.hasNext()) {
                    wifiConfiguration = null;
                    break;
                }
                wifiConfiguration = it.next();
                if (wifiConfiguration.networkId == num.intValue()) {
                    break;
                }
            }
            if (wifiConfiguration == null) {
                ((eluo) ((eluo) ausnVar.j()).ai((char) 6264)).x("Did not find WifiConfiguration with matching networkId");
                return false;
            }
            BitSet bitSet = new BitSet();
            bitSet.set(1);
            bitSet.set(4);
            bitSet.set(8);
            if (wifiConfiguration.allowedKeyManagement.intersects(bitSet)) {
                return true;
            }
            ((eluo) ((eluo) ausnVar.h()).ai((char) 6263)).x("No valid security type");
        }
        return false;
    }

    public final Boolean a() {
        if (ceet.b()) {
            cdup cdupVar = this.f;
            return Boolean.valueOf(cdupVar != null && cdupVar.a());
        }
        if (cdxg.u().q()) {
            ((eluo) ((eluo) a.h()).ai((char) 6259)).x("Connected to hotspot network, returning true");
            return true;
        }
        ((eluo) ((eluo) a.h()).ai((char) 6258)).x("Feature is disabled, returning null client state");
        return null;
    }

    public final Boolean b() {
        if (ceet.b()) {
            ceaa ceaaVar = this.e;
            return Boolean.valueOf(ceaaVar != null && ceaaVar.f());
        }
        ceam a2 = ceam.a(AppContextProvider.a());
        if (a2 == null) {
            ((eluo) ((eluo) a.j()).ai((char) 6262)).x("RemoteDeviceManager is null, returning false for host running");
            return false;
        }
        if (a2.e()) {
            ((eluo) ((eluo) a.h()).ai((char) 6260)).x("Feature is disabled, returning null host state");
            return null;
        }
        ((eluo) ((eluo) a.h()).ai((char) 6261)).x("Managing devices, returning true");
        return true;
    }

    public final void c() {
        if (cdyn.b()) {
            cdvm a2 = cdvm.a();
            if (a2.w() && a2.k.k().d()) {
                a2.c(a2.i.b().e());
            }
            cdup cdupVar = this.f;
            if (cdupVar != null) {
                cdub cdubVar = cdupVar.c.e;
                cduy cduyVar = cdubVar.b;
                synchronized (cduyVar) {
                    for (cduu cduuVar : cduyVar.b.values()) {
                        if (cduuVar.g && !cduuVar.f) {
                            ((eluo) cdub.a.h()).A("Scheduling immediate GetTetherAvailabilityWorker for device %s due to tidepool update", cduuVar.b.a);
                            cdubVar.d(cduuVar.b.a, 0);
                        }
                    }
                }
            }
        }
    }

    public final void d(boolean z) {
        if (fstg.z()) {
            SharedConnectivitySettingsState.Builder builder = new SharedConnectivitySettingsState.Builder();
            builder.setInstantTetherEnabled(z).setInstantTetherSettingsPendingIntent(ceen.a(getApplicationContext()));
            builder.build();
            throw null;
        }
        if (this.d.isShutdown()) {
            ((eluo) ((eluo) a.j()).ai((char) 6273)).x("PooledThreadPoolExecutor is shutdown, not executing runnable");
        } else {
            this.d.execute(new ceea(this));
        }
    }

    @Override // com.google.android.chimera.Service
    public final void dump(FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        printWriter.append("==== TetherService Dump ====\n\n");
        if (fstg.o()) {
            synchronized (this.v) {
                printWriter.append("    Last calls to setRoles:\n");
                Iterator it = this.u.iterator();
                while (it.hasNext()) {
                    printWriter.append(String.valueOf((ekvj) it.next()));
                    printWriter.append("\n");
                }
            }
        }
        printWriter.append("==== Flags status ====\n");
        printWriter.append("TidepoolFeature.enableInstantHotspot:").println(cdyn.a(false));
        printWriter.append("NearbyTether__enableNearbyClient: ").println(fstg.i());
        printWriter.append("NearbyTether__enableNearbyHost: ").println(fstg.j());
        printWriter.append("NearbyTether__enableTidepoolUi: ").println(fstg.p());
        printWriter.append("NearbyTether__enableWifiSharing: ").println(fstg.s());
        printWriter.append("NearbyTether__disableProximityAuthInHost: ").println(fstg.a.lK().p());
        printWriter.append("NearbyTether__useSharedConnectivityService: ").println(fstg.z());
        printWriter.append("NearbyTether__enableNearbyUpgradeMedium: ").println(fstg.k());
        printWriter.append("NearbyTether__enableWorkProfile: ").println(fstg.t());
        printWriter.append("NearbyTether__waitForDisconnectCallback: ").println(fstg.A());
        printWriter.append("NearbyTether__checkConfigurationUsingConfiguredNetworks: ").println(fstg.g());
        printWriter.append("NearbyTether__enableUserDefinedHotspotCredentials: ").println(fstg.q());
        printWriter.append("NearbyTether__suppressClientNotificationsOnSamsungDevices: ").println(fstg.w());
        printWriter.append("NearbyTether__enableSamsungDeviceDiscoveryFiltering: ").println(fstg.n());
        printWriter.append("==== Tidepool status ====\n");
        printWriter.append("isInstantHotspotEnabled: ").println(ceet.b());
        if (cdyn.b()) {
            printWriter.append("isInstantWifiEnabled: ").println(ceet.c());
        }
        cdup cdupVar = this.f;
        if (cdupVar != null) {
            printWriter.append("==== Client Tether Role ====\n");
            printWriter.append("    ==== Client Orchestrator ====\n");
            PrintWriter append = printWriter.append("    Status: ");
            cduo cduoVar = cdupVar.c;
            append.append(String.valueOf(cduoVar.n)).append("\n");
            cdxf cdxfVar = cduoVar.d;
            if (fstg.h()) {
                printWriter.append("    ==== WifiConnectionHandler ====\n");
                int i = cece.a;
                WifiInfo b2 = cece.b();
                printWriter.append(a.f(b2 != null ? Integer.valueOf(b2.getNetworkId()) : null, "    Current Network ID: ", "\n"));
                printWriter.append("    Last Connected HotspotIds:\n   ");
                Iterator it2 = cdxfVar.e.iterator();
                while (it2.hasNext()) {
                    printWriter.append(String.valueOf((ekvj) it2.next()));
                    printWriter.append("\n");
                }
                printWriter.append("    Last Configured NetworkIds:\n");
                Iterator it3 = cdxfVar.d.iterator();
                while (it3.hasNext()) {
                    printWriter.append(String.valueOf((ekvj) it3.next()));
                    printWriter.append("\n");
                }
            }
        } else {
            printWriter.println("Client role is null");
        }
        ceaa ceaaVar = this.e;
        if (ceaaVar != null) {
            printWriter.append("==== Host Tether Role ====\n");
            synchronized (ceaaVar.d) {
                cdzb cdzbVar = ceaaVar.f;
                printWriter.append("    +++ NearbyHostWrapper +++\n");
                printWriter.append("Connected remote devices:\n");
                Iterator it4 = cdzbVar.c.values().iterator();
                while (it4.hasNext()) {
                    printWriter.println("        " + ((cecb) it4.next()).toString() + "\n");
                }
                cdyr cdyrVar = ceaaVar.i;
                if (cdyrVar != null) {
                    cdyrVar.b(printWriter);
                }
            }
        } else {
            printWriter.println("Host role is null");
        }
        int i2 = chde.a;
        fxxm.f(printWriter, "writer");
        printWriter.append("==== Multidevice Dump ====\n");
        Map f = fxtb.f(new fxqz("TidepoolFeature.enableTidepoolEligibilityChecker", chdc.a), new fxqz("TidepoolFeature.enableInstantHotspot", chdd.a));
        com.google.android.gms.chimera.modules.multidevice.AppContextProvider appContextProvider = com.google.android.gms.chimera.modules.multidevice.AppContextProvider.c;
        Context a2 = appContextProvider == null ? athr.a() : appContextProvider.a;
        for (Account account : auqx.h(a2, a2.getPackageName())) {
            printWriter.format("flags for account %s:\n", account);
            for (Map.Entry entry : f.entrySet()) {
                Object obj = (String) entry.getKey();
                Boolean bool = (Boolean) ((fxwo) ((fxze) entry.getValue())).a(new dyej(account));
                bool.booleanValue();
                printWriter.format("%s: %s\n", obj, bool);
            }
        }
        printWriter.append("==== Flags status ====\n");
        PrintWriter append2 = printWriter.append("MultideviceSettingsConfig__enable_link_your_devices: ");
        ftdd ftddVar = ftdd.a;
        append2.println(ftddVar.lK().b());
        printWriter.append("MultideviceClientApis__available: ").println(ftcq.c());
        printWriter.append("MultideviceSettingsConfig__enabled_devices_types: ").println(ftddVar.lK().a());
        printWriter.append("MultideviceSettingsConfig__enable_opt_in_task : ").println(ftddVar.lK().c());
        printWriter.append("MultideviceClientApis__available: ").println(ftcq.c());
        printWriter.append("MultideviceClientApis__use_updated_profile_service_start_action: ").println(ftcq.a.lK().b());
        PrintWriter append3 = printWriter.append("MultideviceTesting__enable_test_buttons: ");
        ftdh.c();
        append3.println(false);
        PrintWriter append4 = printWriter.append("MultideviceTesting__enable_fake_nearby_presence_rpc: ");
        ftdh.c();
        append4.println(false);
        printWriter.append("MultideviceDataLayer__rethrow_unsatisfied_link_error: ").println(ftct.a.lK().a());
        PrintWriter append5 = printWriter.append("MultideviceEnrollment__use_v_compatible_device_picker_layout: ");
        ftcw ftcwVar = ftcw.a;
        append5.println(ftcwVar.lK().b());
        printWriter.append("MultideviceEnrollment__fix_navigate_back_dispatch_callback: ").println(ftcwVar.lK().a());
    }

    public final void e() {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        ceeg ceegVar;
        boolean q = fstg.x() ? cdxj.u().q() : cdxg.u().q();
        if (fstg.x()) {
            z = j().a() != null;
            z2 = m(j().b(), j().d());
        } else {
            if (this.s != null) {
                Network a2 = j().a();
                if (a2 != null) {
                    ConnectivityManager connectivityManager = this.s;
                    ekvl.y(connectivityManager);
                    z2 = m(connectivityManager.getNetworkCapabilities(a2), null);
                    z = true;
                }
            } else {
                ((eluo) ((eluo) a.i()).ai((char) 6274)).x("Could not get the connectivity manager for role switching");
            }
            z = false;
            z2 = false;
        }
        ceam a3 = ceam.a(AppContextProvider.a());
        boolean z5 = (this.i == null || a3 == null || a3.e()) ? false : true;
        WifiManager wifiManager = this.t;
        boolean z6 = wifiManager != null && wifiManager.isWifiEnabled();
        eluo eluoVar = (eluo) ((eluo) a.h()).ai(6275);
        Boolean valueOf = Boolean.valueOf(z);
        Boolean valueOf2 = Boolean.valueOf(z2);
        Boolean valueOf3 = Boolean.valueOf(q);
        Boolean valueOf4 = Boolean.valueOf(z6);
        Boolean valueOf5 = Boolean.valueOf(z5);
        eluoVar.V("setRoles hasActiveNetworkConnection=%s canActiveNetworkBeTethered=%s isConnectedToInstantTether=%s isWifiEnabled=%s isHosting=%s", valueOf, valueOf2, valueOf3, valueOf4, valueOf5);
        if (fstg.o()) {
            synchronized (this.v) {
                z3 = true;
                this.u.add(0, new ekvj(Calendar.getInstance().getTime(), Arrays.asList(valueOf, valueOf2, valueOf3, valueOf4, valueOf5)));
                List list = this.u;
                this.u = list.subList(0, Math.min(list.size(), 20));
            }
        } else {
            z3 = true;
        }
        if (!z5) {
            z4 = z3;
        } else if (!z || z2) {
            boolean z7 = z3;
            k(false, z7);
            l(z7);
            return;
        } else {
            z2 = false;
            z = z3;
            z4 = z;
        }
        if (z && !q && z2 && (ceegVar = this.k) != null && ceegVar.c()) {
            k(false, z4);
            l(z4);
        } else if ((!z || q) && z6) {
            l(false);
            k(true, false);
        } else {
            l(false);
            k(false, true);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0045, code lost:
    
        if (defpackage.ceet.c() != false) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0057, code lost:
    
        if (defpackage.ceet.b() != false) goto L12;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void f(boolean r9, boolean r10) {
        /*
            r8 = this;
            cdup r0 = r8.f
            if (r0 == 0) goto Le8
            boolean r0 = r0.a()
            boolean r1 = defpackage.cdyn.b()
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L4b
            boolean r1 = defpackage.ceet.b()
            boolean r4 = defpackage.ceet.c()
            ausn r5 = com.google.android.gms.magictether.service.TetherChimeraService.a
            eltz r5 = r5.h()
            eluo r5 = (defpackage.eluo) r5
            r6 = 6281(0x1889, float:8.802E-42)
            eltz r5 = r5.ai(r6)
            eluo r5 = (defpackage.eluo) r5
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r9)
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r4)
            java.lang.String r7 = "startNearbyClientRole: start: %s isInstantHotspotEnabled: %s isInstantWifiEnabled: %s"
            r5.T(r7, r6, r1, r4)
            if (r9 == 0) goto L49
            boolean r9 = defpackage.ceet.b()
            if (r9 != 0) goto L47
            boolean r9 = defpackage.ceet.c()
            if (r9 == 0) goto L49
        L47:
            r9 = r2
            goto L5a
        L49:
            r9 = r3
            goto L5a
        L4b:
            boolean r1 = defpackage.fstg.u()
            if (r1 == 0) goto L5a
            if (r9 == 0) goto L49
            boolean r9 = defpackage.ceet.b()
            if (r9 == 0) goto L49
            goto L47
        L5a:
            if (r9 == 0) goto L8e
            ausn r9 = com.google.android.gms.magictether.service.TetherChimeraService.a
            eltz r9 = r9.h()
            java.lang.String r10 = "Starting Nearby client role"
            r1 = 6280(0x1888, float:8.8E-42)
            defpackage.a.A(r9, r10, r1)
            cdup r9 = r8.f
            monitor-enter(r9)
            boolean r10 = r9.d     // Catch: java.lang.Throwable -> L8b
            if (r10 == 0) goto L7f
            ausn r10 = defpackage.cdup.a     // Catch: java.lang.Throwable -> L8b
            eltz r10 = r10.h()     // Catch: java.lang.Throwable -> L8b
            eluo r10 = (defpackage.eluo) r10     // Catch: java.lang.Throwable -> L8b
            java.lang.String r1 = "Client role already started"
            r10.x(r1)     // Catch: java.lang.Throwable -> L8b
            monitor-exit(r9)     // Catch: java.lang.Throwable -> L8b
            goto Lb9
        L7f:
            cduo r10 = r9.c     // Catch: java.lang.Throwable -> L8b
            r10.m()     // Catch: java.lang.Throwable -> L8b
            r9.d = r2     // Catch: java.lang.Throwable -> L8b
            defpackage.cebt.x()     // Catch: java.lang.Throwable -> L8b
            monitor-exit(r9)     // Catch: java.lang.Throwable -> L8b
            goto Lb9
        L8b:
            r10 = move-exception
            monitor-exit(r9)     // Catch: java.lang.Throwable -> L8b
            throw r10
        L8e:
            ausn r9 = com.google.android.gms.magictether.service.TetherChimeraService.a
            eltz r9 = r9.h()
            java.lang.String r1 = "Stopping Nearby client role"
            r2 = 6279(0x1887, float:8.799E-42)
            defpackage.a.A(r9, r1, r2)
            cdup r9 = r8.f
            monitor-enter(r9)
            boolean r1 = r9.d     // Catch: java.lang.Throwable -> Le5
            if (r1 != 0) goto Lb1
            ausn r10 = defpackage.cdup.a     // Catch: java.lang.Throwable -> Le5
            eltz r10 = r10.h()     // Catch: java.lang.Throwable -> Le5
            eluo r10 = (defpackage.eluo) r10     // Catch: java.lang.Throwable -> Le5
            java.lang.String r1 = "Client role already stopped"
            r10.x(r1)     // Catch: java.lang.Throwable -> Le5
            monitor-exit(r9)     // Catch: java.lang.Throwable -> Le5
            goto Lb9
        Lb1:
            cduo r1 = r9.c     // Catch: java.lang.Throwable -> Le5
            r1.n(r10)     // Catch: java.lang.Throwable -> Le5
            r9.d = r3     // Catch: java.lang.Throwable -> Le5
            monitor-exit(r9)     // Catch: java.lang.Throwable -> Le5
        Lb9:
            cdup r9 = r8.f
            boolean r9 = r9.a()
            if (r0 == r9) goto Le8
            cdvm r9 = defpackage.cdvm.a()
            boolean r10 = r9.w()
            if (r10 == 0) goto Le8
            tch r10 = r9.k
            tcj r10 = r10.k()
            boolean r10 = r10.c()
            if (r10 == 0) goto Le8
            cdwk r10 = r9.i
            cdwj r10 = r10.d()
            eqgl r10 = r10.d()
            r9.c(r10)
            return
        Le5:
            r10 = move-exception
            monitor-exit(r9)     // Catch: java.lang.Throwable -> Le5
            throw r10
        Le8:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.magictether.service.TetherChimeraService.f(boolean, boolean):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0045, code lost:
    
        if (defpackage.ceet.c() != false) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:111:0x0057, code lost:
    
        if (defpackage.ceet.b() != false) goto L12;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void g(boolean r10) {
        /*
            Method dump skipped, instructions count: 481
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.magictether.service.TetherChimeraService.g(boolean):void");
    }

    public final void h(boolean z, boolean z2) {
        ceaa ceaaVar = this.e;
        if (ceaaVar != null) {
            Context applicationContext = getApplicationContext();
            ((eluo) ceaa.a.h()).B("enableProximityAuth: %s", Boolean.valueOf(z));
            if (!z || !ceaa.e(applicationContext, ceaaVar.e)) {
                synchronized (ceaaVar.d) {
                    ceaaVar.h = cdzz.INACTIVE;
                    cdyr cdyrVar = ceaaVar.i;
                    if (cdyrVar != null) {
                        if (z2) {
                            cdyrVar.a();
                        } else {
                            cdyrVar.h();
                        }
                        ceaaVar.i = null;
                    }
                    ceaaVar.a(applicationContext, true);
                }
                return;
            }
            synchronized (ceaaVar.d) {
                ceaaVar.h = cdzz.ACTIVE;
                cdzs cdzsVar = ceaaVar.j;
                cdyr cdyrVar2 = ceaaVar.i;
                int i = ceaj.a;
                int i2 = cdzw.a;
                ceaaVar.i = ceaj.a(applicationContext, cdzsVar, cdyrVar2, cdzw.a(cdzw.c(applicationContext), applicationContext));
                if (ceaaVar.i == null) {
                    ceaaVar.e.k(7);
                } else {
                    ceaaVar.e.k(6);
                }
            }
        }
    }

    public final void i() {
        ((eluo) ((eluo) a.h()).ai((char) 6290)).x("Stopping Nearby component.");
        synchronized (this.n) {
            if (this.g != null) {
                cecd j = j();
                cecc ceccVar = this.g;
                ekvl.y(ceccVar);
                j.h(ceccVar);
                this.g = null;
            }
        }
        g(false);
        f(false, false);
        this.h = null;
        this.i = null;
    }

    @Override // com.google.android.chimera.Service
    public final IBinder onBind(Intent intent) {
        return null;
    }

    @Override // com.google.android.chimera.Service
    public final void onCreate() {
        if (this.o == null) {
            this.o = new cedq();
        }
        Context a2 = AppContextProvider.a();
        if (this.k == null) {
            this.k = new ceeg(a2);
        }
        this.s = (ConnectivityManager) a2.getSystemService("connectivity");
        this.t = (WifiManager) a2.getSystemService("wifi");
        super.onCreate();
    }

    @Override // com.google.android.chimera.Service
    public final void onDestroy() {
        cedw cedwVar;
        if (fssz.i()) {
            this.d.shutdown();
            super.onDestroy();
            return;
        }
        ((eluo) ((eluo) a.h()).ai((char) 6289)).x("Stopping Instant Hotspot feature.");
        h(false, true);
        i();
        this.e = null;
        this.f = null;
        cecd.f();
        ceam a2 = ceam.a(AppContextProvider.a());
        if (a2 != null && (cedwVar = this.p) != null) {
            Set set = a2.d;
            synchronized (set) {
                set.remove(cedwVar);
            }
            this.p = null;
        }
        this.s = null;
        this.t = null;
        ceeb ceebVar = this.j;
        if (ceebVar != null) {
            ceet.e(ceebVar);
            this.j = null;
        }
        ceet.a();
        this.k = null;
        this.d.shutdown();
        super.onDestroy();
    }

    @Override // com.google.android.chimera.Service
    public final int onStartCommand(Intent intent, int i, int i2) {
        if (fssz.i()) {
            stopSelf();
            return 2;
        }
        if (AppContextProvider.a().getPackageManager().hasSystemFeature("android.hardware.bluetooth_le")) {
            this.d.execute(new ceea(this));
            return 1;
        }
        ((eluo) ((eluo) a.j()).ai((char) 6272)).x("Device does not support BLE.");
        stopSelf();
        return 2;
    }

    @Override // com.google.android.chimera.Service
    public final boolean onUnbind(Intent intent) {
        return false;
    }

    public TetherChimeraService(eqgo eqgoVar) {
        this.n = new Object();
        this.u = new ArrayList();
        this.v = new Object();
        this.d = eqgoVar;
    }

    @Override // com.google.android.chimera.Service
    public final void onRebind(Intent intent) {
    }
}
