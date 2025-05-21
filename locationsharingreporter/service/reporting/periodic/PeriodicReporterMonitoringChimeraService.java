package com.google.android.gms.locationsharingreporter.service.reporting.periodic;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.IBinder;
import com.google.android.chimera.Service;
import com.google.android.gms.chimera.modules.locationsharingreporter.AppContextProvider;
import com.google.android.gms.locationsharingreporter.service.reporting.periodic.DeviceSettingChangeManager;
import com.google.android.gms.locationsharingreporter.service.reporting.periodic.PeriodicReporterMonitoringChimeraService;
import defpackage.asej;
import defpackage.asot;
import defpackage.caxi;
import defpackage.cbew;
import defpackage.eiid;
import defpackage.ejhf;
import defpackage.fpxh;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes5.dex */
public class PeriodicReporterMonitoringChimeraService extends Service {
    public static final asot a = asot.b("LSR", asej.LOCATION_SHARING_REPORTER);
    public DeviceSettingChangeManager b;
    public caxi c;
    public final AtomicBoolean d = new AtomicBoolean(false);

    public static Intent a(eiid eiidVar) {
        Intent intent = new Intent();
        if (eiidVar.h()) {
            intent.setAction((String) eiidVar.c());
        }
        intent.setComponent(new ComponentName(AppContextProvider.a(), "com.google.android.gms.locationsharingreporter.service.reporting.periodic.PeriodicReporterMonitoringService"));
        return intent;
    }

    private final synchronized void c() {
        if (fpxh.a.a().aw()) {
            cbew.a().submit(new Runnable() { // from class: cayx
                @Override // java.lang.Runnable
                public final void run() {
                    PeriodicReporterMonitoringChimeraService.this.b();
                }
            }).hn(new Runnable() { // from class: cayy
                @Override // java.lang.Runnable
                public final void run() {
                    ((ejhf) ((ejhf) PeriodicReporterMonitoringChimeraService.a.h()).ah((char) 5888)).x("Stopped monitoring device settings");
                }
            }, cbew.b());
        } else {
            b();
        }
    }

    private final void d() {
        if (this.d.get()) {
            return;
        }
        ((ejhf) ((ejhf) a.h()).ah((char) 5901)).x("Monitoring service should not be in started state, stopping it");
        stopSelf();
    }

    public final synchronized void b() {
        asot asotVar = a;
        ((ejhf) ((ejhf) asotVar.h()).ah((char) 5898)).x("Stopping monitoring device setting changes");
        DeviceSettingChangeManager deviceSettingChangeManager = this.b;
        if (deviceSettingChangeManager != null) {
            deviceSettingChangeManager.d();
        } else {
            ((ejhf) ((ejhf) asotVar.j()).ah((char) 5899)).x("DeviceSettingChangeManager is null in onDestroy");
        }
        caxi caxiVar = this.c;
        if (caxiVar != null) {
            caxiVar.c();
        } else {
            ((ejhf) ((ejhf) asotVar.j()).ah((char) 5900)).x("DeviceStateCallbackManager is null in onDestroy");
        }
        this.d.set(false);
    }

    @Override // com.google.android.chimera.Service
    public final IBinder onBind(Intent intent) {
        ((ejhf) ((ejhf) a.j()).ah((char) 5889)).x("PeriodicReporterMonitoringService is bound");
        return null;
    }

    @Override // com.google.android.chimera.Service
    public final void onCreate() {
        ((ejhf) ((ejhf) a.h()).ah((char) 5890)).x("PeriodicReporterMonitoringService created");
        super.onCreate();
    }

    @Override // com.google.android.chimera.Service
    public final void onDestroy() {
        ((ejhf) ((ejhf) a.h()).ah((char) 5891)).x("PeriodicReporterMonitoringService destroyed");
        c();
        super.onDestroy();
    }

    @Override // com.google.android.chimera.Service
    public final int onStartCommand(Intent intent, int i, int i2) {
        asot asotVar = a;
        ((ejhf) ((ejhf) asotVar.h()).ah((char) 5892)).x("PeriodicReporterMonitoringService started");
        if (!fpxh.E() || !fpxh.a.a().ap()) {
            ((ejhf) ((ejhf) asotVar.h()).ah((char) 5893)).x("Not allowed to start periodic monitoring service, stopping it");
            stopSelf();
            return 2;
        }
        if (intent == null) {
            if (!fpxh.I()) {
                ((ejhf) ((ejhf) asotVar.h()).ah((char) 5896)).x("Monitoring service received null intent, stopping service");
                d();
                return 2;
            }
            ((ejhf) ((ejhf) asotVar.h()).ah((char) 5897)).x("MonitoringService started with null intent. Possibly restarting after a crash");
        }
        String action = intent == null ? "com.google.android.gms.locationsharingreporter.service.reporting.periodic.ACTION_START_MONITORING_SERVICE" : intent.getAction();
        if (action == null) {
            ((ejhf) ((ejhf) asotVar.j()).ah((char) 5895)).x("Monitoring service received intent with null action");
            d();
            return 2;
        }
        if (action.hashCode() == 1915620472 && action.equals("com.google.android.gms.locationsharingreporter.service.reporting.periodic.ACTION_START_MONITORING_SERVICE")) {
            cbew.a().submit(new Runnable() { // from class: cayv
                @Override // java.lang.Runnable
                public final void run() {
                    asot asotVar2 = PeriodicReporterMonitoringChimeraService.a;
                    ((ejhf) ((ejhf) asotVar2.h()).ah((char) 5885)).x("Starting monitoring device setting changes");
                    PeriodicReporterMonitoringChimeraService periodicReporterMonitoringChimeraService = PeriodicReporterMonitoringChimeraService.this;
                    periodicReporterMonitoringChimeraService.d.set(true);
                    synchronized (periodicReporterMonitoringChimeraService) {
                        if (periodicReporterMonitoringChimeraService.b == null) {
                            periodicReporterMonitoringChimeraService.b = new DeviceSettingChangeManager();
                        }
                        DeviceSettingChangeManager deviceSettingChangeManager = periodicReporterMonitoringChimeraService.b;
                        asot asotVar3 = DeviceSettingChangeManager.a;
                        ((ejhf) ((ejhf) asotVar3.h()).ah((char) 5803)).x("Attempting to start listening to device setting changes");
                        Context context = deviceSettingChangeManager.b;
                        deviceSettingChangeManager.b(cbdu.a(context));
                        deviceSettingChangeManager.c(cbdu.b(context));
                        AtomicBoolean atomicBoolean = deviceSettingChangeManager.c;
                        if (!atomicBoolean.get()) {
                            ((ejhf) ((ejhf) asotVar3.h()).ah((char) 5804)).x("Starting listening to device setting changes");
                            IntentFilter intentFilter = new IntentFilter();
                            intentFilter.addAction("android.location.MODE_CHANGED");
                            intentFilter.addAction("android.os.action.POWER_SAVE_MODE_CHANGED");
                            iln.c(context, deviceSettingChangeManager, intentFilter, null, new aslv(deviceSettingChangeManager.d), 2);
                            atomicBoolean.set(true);
                        }
                        if (!fpxh.A() && !fpxh.z()) {
                            if (periodicReporterMonitoringChimeraService.c != null) {
                                ((ejhf) ((ejhf) asotVar2.h()).ah(5886)).x("Unregistering network callbacks as is now internet connectivity optimisation is now disabled.");
                                caxi caxiVar = periodicReporterMonitoringChimeraService.c;
                                eiig.x(caxiVar);
                                caxiVar.c();
                                periodicReporterMonitoringChimeraService.c = null;
                            }
                        }
                        if (periodicReporterMonitoringChimeraService.c == null) {
                            periodicReporterMonitoringChimeraService.c = new caxi();
                        }
                        periodicReporterMonitoringChimeraService.c.b();
                    }
                }
            }).hn(new Runnable() { // from class: cayw
                @Override // java.lang.Runnable
                public final void run() {
                    ((ejhf) ((ejhf) PeriodicReporterMonitoringChimeraService.a.h()).ah((char) 5887)).x("Started monitoring device settings");
                }
            }, cbew.b());
        } else {
            ((ejhf) ((ejhf) asotVar.j()).ah((char) 5894)).B("Monitoring service received unrecognised action: %s", action);
            d();
        }
        return fpxh.I() ? 1 : 2;
    }
}
