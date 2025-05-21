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
import defpackage.arfc;
import defpackage.asmf;
import defpackage.asnd;
import defpackage.asot;
import defpackage.cblj;
import defpackage.cblw;
import defpackage.cblx;
import defpackage.cbmc;
import defpackage.cbmg;
import defpackage.cbmu;
import defpackage.cbon;
import defpackage.cboo;
import defpackage.cbor;
import defpackage.cbpv;
import defpackage.cbpz;
import defpackage.cbqj;
import defpackage.cbra;
import defpackage.cbre;
import defpackage.cbrh;
import defpackage.cbri;
import defpackage.cbrr;
import defpackage.cbru;
import defpackage.cbsl;
import defpackage.cbta;
import defpackage.cbtj;
import defpackage.cbtk;
import defpackage.cbtl;
import defpackage.cbtm;
import defpackage.cbuy;
import defpackage.cbvc;
import defpackage.cbvd;
import defpackage.cbve;
import defpackage.cbvi;
import defpackage.cbvj;
import defpackage.cbvk;
import defpackage.cbvo;
import defpackage.cbvv;
import defpackage.cbwb;
import defpackage.cevr;
import defpackage.cevs;
import defpackage.cevt;
import defpackage.dfae;
import defpackage.dfaq;
import defpackage.dfbl;
import defpackage.dvrm;
import defpackage.eiie;
import defpackage.eiig;
import defpackage.ejhf;
import defpackage.ensv;
import defpackage.fpzd;
import defpackage.fpzk;
import defpackage.fqiz;
import defpackage.fqjc;
import defpackage.fqjf;
import defpackage.fqjm;
import defpackage.fqjq;
import defpackage.fuvb;
import defpackage.fuxd;
import defpackage.fvaq;
import defpackage.fvbo;
import defpackage.fvdg;
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

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes5.dex */
public class TetherChimeraService extends Service {
    public static final asot a = cbta.a("TetherService");
    public static BluetoothStateChangeReceiver b;
    public static TracingBroadcastReceiver c;
    public ensv d;
    public cbri e;
    public cblx f;
    public cbtk g;
    public Timer h;
    public TimerTask i;
    public cbvj j;
    cbvo k;
    public dfaq l;
    public dfaq m;
    public final Object n;
    cbuy o;
    public cbve p;
    public cbvd q;
    public cbvc r;
    private ConnectivityManager s;
    private WifiManager t;
    private List u;
    private final Object v;

    /* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
    public class BluetoothStateChangeReceiver extends TracingBroadcastReceiver {
        public BluetoothStateChangeReceiver() {
            super("auth_magictether");
        }

        @Override // com.google.android.gms.libs.punchclock.tracing.TracingBroadcastReceiver
        public final void jz(Context context, Intent intent) {
            ((ejhf) ((ejhf) TetherChimeraService.a.h()).ah((char) 6229)).z("BluetoothStateChangeReceiver: %s", intent.getIntExtra("android.bluetooth.adapter.extra.STATE", 0));
            context.startService(cbvk.a());
        }
    }

    public TetherChimeraService() {
        this(new asmf(1, 10));
    }

    public static final cbtl j() {
        return cbtl.c(AppContextProvider.a());
    }

    private final void k(final boolean z, final boolean z2) {
        cbmu a2 = cbmu.a();
        final dfaq d = (!a2.w() || a2.k.k().c()) ? dfbl.d(null) : a2.c(a2.i.b().c());
        this.l = d;
        d.x(new dfae() { // from class: cbvb
            @Override // defpackage.dfae
            public final void hr(dfaq dfaqVar) {
                dfaq dfaqVar2 = d;
                TetherChimeraService tetherChimeraService = TetherChimeraService.this;
                if (dfaqVar2 != tetherChimeraService.l) {
                    ((ejhf) ((ejhf) TetherChimeraService.a.h()).ah((char) 6249)).x("isClientRoleRunningTask changed, ignoring result");
                    return;
                }
                boolean z3 = z2;
                if (!dfaqVar.m() || dfaqVar.i() == null) {
                    tetherChimeraService.f(z, z3);
                    return;
                }
                Boolean bool = (Boolean) dfaqVar.i();
                eiig.x(bool);
                tetherChimeraService.f(bool.booleanValue(), z3);
            }
        });
    }

    private final void l(final boolean z) {
        cbsl a2 = cbsl.a();
        final dfaq d = (!a2.i() || a2.h.k().c()) ? dfbl.d(null) : a2.b(a2.f.b().b());
        this.m = d;
        d.x(new dfae() { // from class: cbuz
            @Override // defpackage.dfae
            public final void hr(dfaq dfaqVar) {
                dfaq dfaqVar2 = d;
                final TetherChimeraService tetherChimeraService = TetherChimeraService.this;
                if (dfaqVar2 != tetherChimeraService.m) {
                    ((ejhf) ((ejhf) TetherChimeraService.a.h()).ah((char) 6250)).x("isHostRoleRunningTask changed, ignoring result");
                    return;
                }
                final boolean z2 = z;
                if (dfaqVar.m() && dfaqVar.i() != null) {
                    Boolean bool = (Boolean) dfaqVar.i();
                    eiig.x(bool);
                    z2 = bool.booleanValue();
                }
                if (fpzk.a.a().H()) {
                    tetherChimeraService.d.execute(new Runnable() { // from class: cbva
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
            ((ejhf) ((ejhf) a.h()).ah((char) 6237)).x("networkCapabilities is null");
            return false;
        }
        asot asotVar = a;
        ((ejhf) ((ejhf) asotVar.h()).ah(6236)).T("TRANSPORT_CELLULAR [%s], TRANSPORT_ETHERNET [%s], TRANSPORT_WIFI [%s]", Boolean.valueOf(networkCapabilities.hasTransport(0)), Boolean.valueOf(networkCapabilities.hasTransport(3)), Boolean.valueOf(networkCapabilities.hasTransport(1)));
        if (networkCapabilities.hasTransport(0) || networkCapabilities.hasTransport(3)) {
            return true;
        }
        if (networkCapabilities.hasTransport(1) && fpzk.x()) {
            if (num == null) {
                ((ejhf) ((ejhf) asotVar.j()).ah((char) 6248)).x("networkId is null");
                return false;
            }
            WifiManager wifiManager = this.t;
            if (wifiManager == null) {
                ((ejhf) ((ejhf) asotVar.j()).ah((char) 6247)).x("WifiManager is null");
                return false;
            }
            if (wifiManager.getConfiguredNetworks().isEmpty()) {
                ((ejhf) ((ejhf) asotVar.i()).ah((char) 6246)).x("configuredNetworks is empty, can not get Wifi security types for role switching");
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
                ((ejhf) ((ejhf) asotVar.j()).ah((char) 6245)).x("Did not find WifiConfiguration with matching networkId");
                return false;
            }
            BitSet bitSet = new BitSet();
            bitSet.set(1);
            bitSet.set(4);
            bitSet.set(8);
            if (wifiConfiguration.allowedKeyManagement.intersects(bitSet)) {
                return true;
            }
            ((ejhf) ((ejhf) asotVar.h()).ah((char) 6244)).x("No valid security type");
        }
        return false;
    }

    public final Boolean a() {
        if (cbwb.b()) {
            cblx cblxVar = this.f;
            return Boolean.valueOf(cblxVar != null && cblxVar.a());
        }
        if (cboo.u().q()) {
            ((ejhf) ((ejhf) a.h()).ah((char) 6240)).x("Connected to hotspot network, returning true");
            return true;
        }
        ((ejhf) ((ejhf) a.h()).ah((char) 6239)).x("Feature is disabled, returning null client state");
        return null;
    }

    public final Boolean b() {
        if (cbwb.b()) {
            cbri cbriVar = this.e;
            return Boolean.valueOf(cbriVar != null && cbriVar.f());
        }
        cbru a2 = cbru.a(AppContextProvider.a());
        if (a2 == null) {
            ((ejhf) ((ejhf) a.j()).ah((char) 6243)).x("RemoteDeviceManager is null, returning false for host running");
            return false;
        }
        if (a2.e()) {
            ((ejhf) ((ejhf) a.h()).ah((char) 6241)).x("Feature is disabled, returning null host state");
            return null;
        }
        ((ejhf) ((ejhf) a.h()).ah((char) 6242)).x("Managing devices, returning true");
        return true;
    }

    public final void c() {
        if (cbpv.b()) {
            cbmu a2 = cbmu.a();
            if (a2.w() && a2.k.k().d()) {
                a2.c(a2.i.b().e());
            }
            cblx cblxVar = this.f;
            if (cblxVar != null) {
                cblj cbljVar = cblxVar.c.e;
                cbmg cbmgVar = cbljVar.b;
                synchronized (cbmgVar) {
                    for (cbmc cbmcVar : cbmgVar.b.values()) {
                        if (cbmcVar.g && !cbmcVar.f) {
                            ((ejhf) cblj.a.h()).A("Scheduling immediate GetTetherAvailabilityWorker for device %s due to tidepool update", cbmcVar.b.a);
                            cbljVar.d(cbmcVar.b.a, 0);
                        }
                    }
                }
            }
        }
    }

    public final void d(boolean z) {
        if (fpzk.z()) {
            SharedConnectivitySettingsState.Builder builder = new SharedConnectivitySettingsState.Builder();
            builder.setInstantTetherEnabled(z).setInstantTetherSettingsPendingIntent(cbvv.a(getApplicationContext()));
            builder.build();
            throw null;
        }
        if (this.d.isShutdown()) {
            ((ejhf) ((ejhf) a.j()).ah((char) 6254)).x("PooledThreadPoolExecutor is shutdown, not executing runnable");
        } else {
            this.d.execute(new cbvi(this));
        }
    }

    @Override // com.google.android.chimera.Service
    public final void dump(FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        printWriter.append("==== TetherService Dump ====\n\n");
        if (fpzk.o()) {
            synchronized (this.v) {
                printWriter.append("    Last calls to setRoles:\n");
                Iterator it = this.u.iterator();
                while (it.hasNext()) {
                    printWriter.append(String.valueOf((eiie) it.next()));
                    printWriter.append("\n");
                }
            }
        }
        printWriter.append("==== Flags status ====\n");
        printWriter.append("TidepoolFeature.enableInstantHotspot:").println(cbpv.a(false));
        printWriter.append("NearbyTether__enableNearbyClient: ").println(fpzk.i());
        printWriter.append("NearbyTether__enableNearbyHost: ").println(fpzk.j());
        printWriter.append("NearbyTether__enableTidepoolUi: ").println(fpzk.p());
        printWriter.append("NearbyTether__enableWifiSharing: ").println(fpzk.s());
        printWriter.append("NearbyTether__disableProximityAuthInHost: ").println(fpzk.a.a().p());
        printWriter.append("NearbyTether__useSharedConnectivityService: ").println(fpzk.z());
        printWriter.append("NearbyTether__enableNearbyUpgradeMedium: ").println(fpzk.k());
        printWriter.append("NearbyTether__enableWorkProfile: ").println(fpzk.t());
        printWriter.append("NearbyTether__waitForDisconnectCallback: ").println(fpzk.A());
        printWriter.append("NearbyTether__checkConfigurationUsingConfiguredNetworks: ").println(fpzk.g());
        printWriter.append("NearbyTether__enableUserDefinedHotspotCredentials: ").println(fpzk.q());
        printWriter.append("NearbyTether__suppressClientNotificationsOnSamsungDevices: ").println(fpzk.w());
        printWriter.append("NearbyTether__enableSamsungDeviceDiscoveryFiltering: ").println(fpzk.n());
        printWriter.append("==== Tidepool status ====\n");
        printWriter.append("isInstantHotspotEnabled: ").println(cbwb.b());
        if (cbpv.b()) {
            printWriter.append("isInstantWifiEnabled: ").println(cbwb.c());
        }
        cblx cblxVar = this.f;
        if (cblxVar != null) {
            printWriter.append("==== Client Tether Role ====\n");
            printWriter.append("    ==== Client Orchestrator ====\n");
            PrintWriter append = printWriter.append("    Status: ");
            cblw cblwVar = cblxVar.c;
            append.append(String.valueOf(cblwVar.n)).append("\n");
            cbon cbonVar = cblwVar.d;
            if (fpzk.h()) {
                printWriter.append("    ==== WifiConnectionHandler ====\n");
                int i = cbtm.a;
                WifiInfo b2 = cbtm.b();
                printWriter.append(a.f(b2 != null ? Integer.valueOf(b2.getNetworkId()) : null, "    Current Network ID: ", "\n"));
                printWriter.append("    Last Connected HotspotIds:\n   ");
                Iterator it2 = cbonVar.e.iterator();
                while (it2.hasNext()) {
                    printWriter.append(String.valueOf((eiie) it2.next()));
                    printWriter.append("\n");
                }
                printWriter.append("    Last Configured NetworkIds:\n");
                Iterator it3 = cbonVar.d.iterator();
                while (it3.hasNext()) {
                    printWriter.append(String.valueOf((eiie) it3.next()));
                    printWriter.append("\n");
                }
            }
        } else {
            printWriter.println("Client role is null");
        }
        cbri cbriVar = this.e;
        if (cbriVar != null) {
            printWriter.append("==== Host Tether Role ====\n");
            synchronized (cbriVar.d) {
                cbqj cbqjVar = cbriVar.f;
                printWriter.append("    +++ NearbyHostWrapper +++\n");
                printWriter.append("Connected remote devices:\n");
                Iterator it4 = cbqjVar.c.values().iterator();
                while (it4.hasNext()) {
                    printWriter.println("        " + ((cbtj) it4.next()).toString() + "\n");
                }
                cbpz cbpzVar = cbriVar.i;
                if (cbpzVar != null) {
                    cbpzVar.b(printWriter);
                }
            }
        } else {
            printWriter.println("Host role is null");
        }
        int i2 = cevt.a;
        fvbo.f(printWriter, "writer");
        printWriter.append("==== Multidevice Dump ====\n");
        Map f = fuxd.f(new fuvb("TidepoolFeature.enableTidepoolEligibilityChecker", cevr.a), new fuvb("TidepoolFeature.enableInstantHotspot", cevs.a));
        com.google.android.gms.chimera.modules.multidevice.AppContextProvider appContextProvider = com.google.android.gms.chimera.modules.multidevice.AppContextProvider.c;
        Context a2 = appContextProvider == null ? arfc.a() : appContextProvider.a;
        for (Account account : asnd.h(a2, a2.getPackageName())) {
            printWriter.format("flags for account %s:\n", account);
            for (Map.Entry entry : f.entrySet()) {
                Object obj = (String) entry.getKey();
                Boolean bool = (Boolean) ((fvaq) ((fvdg) entry.getValue())).a(new dvrm(account));
                bool.booleanValue();
                printWriter.format("%s: %s\n", obj, bool);
            }
        }
        printWriter.append("==== Flags status ====\n");
        printWriter.append("MultideviceSettingsConfig__enable_link_your_devices: ").println(fqjm.a.a().b());
        printWriter.append("MultideviceClientApis__available: ").println(fqiz.c());
        PrintWriter append2 = printWriter.append("MultideviceSettingsConfig__enabled_devices_types: ");
        fqjm fqjmVar = fqjm.a;
        append2.println(fqjmVar.a().a());
        printWriter.append("MultideviceSettingsConfig__enable_opt_in_task : ").println(fqjmVar.a().c());
        printWriter.append("MultideviceClientApis__available: ").println(fqiz.c());
        printWriter.append("MultideviceClientApis__use_updated_profile_service_start_action: ").println(fqiz.a.a().b());
        PrintWriter append3 = printWriter.append("MultideviceTesting__enable_test_buttons: ");
        fqjq.c();
        append3.println(false);
        PrintWriter append4 = printWriter.append("MultideviceTesting__enable_fake_nearby_presence_rpc: ");
        fqjq.c();
        append4.println(false);
        printWriter.append("MultideviceDataLayer__rethrow_unsatisfied_link_error: ").println(fqjc.a.a().a());
        printWriter.append("MultideviceEnrollment__use_v_compatible_device_picker_layout: ").println(fqjf.a.a().b());
        printWriter.append("MultideviceEnrollment__fix_navigate_back_dispatch_callback: ").println(fqjf.a.a().a());
    }

    public final void e() {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        cbvo cbvoVar;
        boolean q = fpzk.x() ? cbor.u().q() : cboo.u().q();
        if (fpzk.x()) {
            z = j().a() != null;
            z2 = m(j().b(), j().d());
        } else {
            if (this.s != null) {
                Network a2 = j().a();
                if (a2 != null) {
                    ConnectivityManager connectivityManager = this.s;
                    eiig.x(connectivityManager);
                    z2 = m(connectivityManager.getNetworkCapabilities(a2), null);
                    z = true;
                }
            } else {
                ((ejhf) ((ejhf) a.i()).ah((char) 6255)).x("Could not get the connectivity manager for role switching");
            }
            z = false;
            z2 = false;
        }
        cbru a3 = cbru.a(AppContextProvider.a());
        boolean z5 = (this.i == null || a3 == null || a3.e()) ? false : true;
        WifiManager wifiManager = this.t;
        boolean z6 = wifiManager != null && wifiManager.isWifiEnabled();
        ejhf ejhfVar = (ejhf) ((ejhf) a.h()).ah(6256);
        Boolean valueOf = Boolean.valueOf(z);
        Boolean valueOf2 = Boolean.valueOf(z2);
        Boolean valueOf3 = Boolean.valueOf(q);
        Boolean valueOf4 = Boolean.valueOf(z6);
        Boolean valueOf5 = Boolean.valueOf(z5);
        ejhfVar.V("setRoles hasActiveNetworkConnection=%s canActiveNetworkBeTethered=%s isConnectedToInstantTether=%s isWifiEnabled=%s isHosting=%s", valueOf, valueOf2, valueOf3, valueOf4, valueOf5);
        if (fpzk.o()) {
            synchronized (this.v) {
                z3 = true;
                this.u.add(0, new eiie(Calendar.getInstance().getTime(), Arrays.asList(valueOf, valueOf2, valueOf3, valueOf4, valueOf5)));
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
        if (z && !q && z2 && (cbvoVar = this.k) != null && cbvoVar.c()) {
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
    
        if (defpackage.cbwb.c() != false) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0057, code lost:
    
        if (defpackage.cbwb.b() != false) goto L12;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void f(boolean r9, boolean r10) {
        /*
            r8 = this;
            cblx r0 = r8.f
            if (r0 == 0) goto Le8
            boolean r0 = r0.a()
            boolean r1 = defpackage.cbpv.b()
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L4b
            boolean r1 = defpackage.cbwb.b()
            boolean r4 = defpackage.cbwb.c()
            asot r5 = com.google.android.gms.magictether.service.TetherChimeraService.a
            ejgq r5 = r5.h()
            ejhf r5 = (defpackage.ejhf) r5
            r6 = 6262(0x1876, float:8.775E-42)
            ejgq r5 = r5.ah(r6)
            ejhf r5 = (defpackage.ejhf) r5
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r9)
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r4)
            java.lang.String r7 = "startNearbyClientRole: start: %s isInstantHotspotEnabled: %s isInstantWifiEnabled: %s"
            r5.T(r7, r6, r1, r4)
            if (r9 == 0) goto L49
            boolean r9 = defpackage.cbwb.b()
            if (r9 != 0) goto L47
            boolean r9 = defpackage.cbwb.c()
            if (r9 == 0) goto L49
        L47:
            r9 = r2
            goto L5a
        L49:
            r9 = r3
            goto L5a
        L4b:
            boolean r1 = defpackage.fpzk.u()
            if (r1 == 0) goto L5a
            if (r9 == 0) goto L49
            boolean r9 = defpackage.cbwb.b()
            if (r9 == 0) goto L49
            goto L47
        L5a:
            if (r9 == 0) goto L8e
            asot r9 = com.google.android.gms.magictether.service.TetherChimeraService.a
            ejgq r9 = r9.h()
            java.lang.String r10 = "Starting Nearby client role"
            r1 = 6261(0x1875, float:8.774E-42)
            defpackage.a.A(r9, r10, r1)
            cblx r9 = r8.f
            monitor-enter(r9)
            boolean r10 = r9.d     // Catch: java.lang.Throwable -> L8b
            if (r10 == 0) goto L7f
            asot r10 = defpackage.cblx.a     // Catch: java.lang.Throwable -> L8b
            ejgq r10 = r10.h()     // Catch: java.lang.Throwable -> L8b
            ejhf r10 = (defpackage.ejhf) r10     // Catch: java.lang.Throwable -> L8b
            java.lang.String r1 = "Client role already started"
            r10.x(r1)     // Catch: java.lang.Throwable -> L8b
            monitor-exit(r9)     // Catch: java.lang.Throwable -> L8b
            goto Lb9
        L7f:
            cblw r10 = r9.c     // Catch: java.lang.Throwable -> L8b
            r10.m()     // Catch: java.lang.Throwable -> L8b
            r9.d = r2     // Catch: java.lang.Throwable -> L8b
            defpackage.cbtb.x()     // Catch: java.lang.Throwable -> L8b
            monitor-exit(r9)     // Catch: java.lang.Throwable -> L8b
            goto Lb9
        L8b:
            r10 = move-exception
            monitor-exit(r9)     // Catch: java.lang.Throwable -> L8b
            throw r10
        L8e:
            asot r9 = com.google.android.gms.magictether.service.TetherChimeraService.a
            ejgq r9 = r9.h()
            java.lang.String r1 = "Stopping Nearby client role"
            r2 = 6260(0x1874, float:8.772E-42)
            defpackage.a.A(r9, r1, r2)
            cblx r9 = r8.f
            monitor-enter(r9)
            boolean r1 = r9.d     // Catch: java.lang.Throwable -> Le5
            if (r1 != 0) goto Lb1
            asot r10 = defpackage.cblx.a     // Catch: java.lang.Throwable -> Le5
            ejgq r10 = r10.h()     // Catch: java.lang.Throwable -> Le5
            ejhf r10 = (defpackage.ejhf) r10     // Catch: java.lang.Throwable -> Le5
            java.lang.String r1 = "Client role already stopped"
            r10.x(r1)     // Catch: java.lang.Throwable -> Le5
            monitor-exit(r9)     // Catch: java.lang.Throwable -> Le5
            goto Lb9
        Lb1:
            cblw r1 = r9.c     // Catch: java.lang.Throwable -> Le5
            r1.n(r10)     // Catch: java.lang.Throwable -> Le5
            r9.d = r3     // Catch: java.lang.Throwable -> Le5
            monitor-exit(r9)     // Catch: java.lang.Throwable -> Le5
        Lb9:
            cblx r9 = r8.f
            boolean r9 = r9.a()
            if (r0 == r9) goto Le8
            cbmu r9 = defpackage.cbmu.a()
            boolean r10 = r9.w()
            if (r10 == 0) goto Le8
            rjd r10 = r9.k
            rjf r10 = r10.k()
            boolean r10 = r10.c()
            if (r10 == 0) goto Le8
            cbns r10 = r9.i
            cbnr r10 = r10.d()
            enss r10 = r10.d()
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
    
        if (defpackage.cbwb.c() != false) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:111:0x0057, code lost:
    
        if (defpackage.cbwb.b() != false) goto L12;
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
        cbri cbriVar = this.e;
        if (cbriVar != null) {
            Context applicationContext = getApplicationContext();
            ((ejhf) cbri.a.h()).B("enableProximityAuth: %s", Boolean.valueOf(z));
            if (!z || !cbri.e(applicationContext, cbriVar.e)) {
                synchronized (cbriVar.d) {
                    cbriVar.h = cbrh.INACTIVE;
                    cbpz cbpzVar = cbriVar.i;
                    if (cbpzVar != null) {
                        if (z2) {
                            cbpzVar.a();
                        } else {
                            cbpzVar.h();
                        }
                        cbriVar.i = null;
                    }
                    cbriVar.a(applicationContext, true);
                }
                return;
            }
            synchronized (cbriVar.d) {
                cbriVar.h = cbrh.ACTIVE;
                cbra cbraVar = cbriVar.j;
                cbpz cbpzVar2 = cbriVar.i;
                int i = cbrr.a;
                int i2 = cbre.a;
                cbriVar.i = cbrr.a(applicationContext, cbraVar, cbpzVar2, cbre.a(cbre.c(applicationContext), applicationContext));
                if (cbriVar.i == null) {
                    cbriVar.e.k(7);
                } else {
                    cbriVar.e.k(6);
                }
            }
        }
    }

    public final void i() {
        ((ejhf) ((ejhf) a.h()).ah((char) 6271)).x("Stopping Nearby component.");
        synchronized (this.n) {
            if (this.g != null) {
                cbtl j = j();
                cbtk cbtkVar = this.g;
                eiig.x(cbtkVar);
                j.h(cbtkVar);
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
            this.o = new cbuy();
        }
        Context a2 = AppContextProvider.a();
        if (this.k == null) {
            this.k = new cbvo(a2);
        }
        this.s = (ConnectivityManager) a2.getSystemService("connectivity");
        this.t = (WifiManager) a2.getSystemService("wifi");
        super.onCreate();
    }

    @Override // com.google.android.chimera.Service
    public final void onDestroy() {
        cbve cbveVar;
        if (fpzd.i()) {
            this.d.shutdown();
            super.onDestroy();
            return;
        }
        ((ejhf) ((ejhf) a.h()).ah((char) 6270)).x("Stopping Instant Hotspot feature.");
        h(false, true);
        i();
        this.e = null;
        this.f = null;
        cbtl.f();
        cbru a2 = cbru.a(AppContextProvider.a());
        if (a2 != null && (cbveVar = this.p) != null) {
            Set set = a2.d;
            synchronized (set) {
                set.remove(cbveVar);
            }
            this.p = null;
        }
        this.s = null;
        this.t = null;
        cbvj cbvjVar = this.j;
        if (cbvjVar != null) {
            cbwb.e(cbvjVar);
            this.j = null;
        }
        cbwb.a();
        this.k = null;
        this.d.shutdown();
        super.onDestroy();
    }

    @Override // com.google.android.chimera.Service
    public final int onStartCommand(Intent intent, int i, int i2) {
        if (fpzd.i()) {
            stopSelf();
            return 2;
        }
        if (AppContextProvider.a().getPackageManager().hasSystemFeature("android.hardware.bluetooth_le")) {
            this.d.execute(new cbvi(this));
            return 1;
        }
        ((ejhf) ((ejhf) a.j()).ah((char) 6253)).x("Device does not support BLE.");
        stopSelf();
        return 2;
    }

    @Override // com.google.android.chimera.Service
    public final boolean onUnbind(Intent intent) {
        return false;
    }

    public TetherChimeraService(ensv ensvVar) {
        this.n = new Object();
        this.u = new ArrayList();
        this.v = new Object();
        this.d = ensvVar;
    }

    @Override // com.google.android.chimera.Service
    public final void onRebind(Intent intent) {
    }
}
