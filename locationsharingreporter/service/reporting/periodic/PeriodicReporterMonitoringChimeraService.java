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
import defpackage.auid;
import defpackage.ausn;
import defpackage.cdfy;
import defpackage.cdno;
import defpackage.ekvi;
import defpackage.eluo;
import defpackage.fsrb;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes5.dex */
public class PeriodicReporterMonitoringChimeraService extends Service {
    public static final ausn a = ausn.b("LSR", auid.LOCATION_SHARING_REPORTER);
    public DeviceSettingChangeManager b;
    public cdfy c;
    public final AtomicBoolean d = new AtomicBoolean(false);

    public static Intent a(ekvi ekviVar) {
        Intent intent = new Intent();
        if (ekviVar.h()) {
            intent.setAction((String) ekviVar.c());
        }
        intent.setComponent(new ComponentName(AppContextProvider.a(), "com.google.android.gms.locationsharingreporter.service.reporting.periodic.PeriodicReporterMonitoringService"));
        return intent;
    }

    private final synchronized void c() {
        if (fsrb.a.lK().av()) {
            cdno.a().submit(new Runnable() { // from class: cdhs
                @Override // java.lang.Runnable
                public final void run() {
                    PeriodicReporterMonitoringChimeraService.this.b();
                }
            }).hD(new Runnable() { // from class: cdht
                @Override // java.lang.Runnable
                public final void run() {
                    ((eluo) ((eluo) PeriodicReporterMonitoringChimeraService.a.h()).ai((char) 5907)).x("Stopped monitoring device settings");
                }
            }, cdno.b());
        } else {
            b();
        }
    }

    private final void d() {
        if (this.d.get()) {
            return;
        }
        ((eluo) ((eluo) a.h()).ai((char) 5920)).x("Monitoring service should not be in started state, stopping it");
        stopSelf();
    }

    public final synchronized void b() {
        ausn ausnVar = a;
        ((eluo) ((eluo) ausnVar.h()).ai((char) 5917)).x("Stopping monitoring device setting changes");
        DeviceSettingChangeManager deviceSettingChangeManager = this.b;
        if (deviceSettingChangeManager != null) {
            deviceSettingChangeManager.d();
        } else {
            ((eluo) ((eluo) ausnVar.j()).ai((char) 5918)).x("DeviceSettingChangeManager is null in onDestroy");
        }
        cdfy cdfyVar = this.c;
        if (cdfyVar != null) {
            cdfyVar.c();
        } else {
            ((eluo) ((eluo) ausnVar.j()).ai((char) 5919)).x("DeviceStateCallbackManager is null in onDestroy");
        }
        this.d.set(false);
    }

    @Override // com.google.android.chimera.Service
    public final IBinder onBind(Intent intent) {
        ((eluo) ((eluo) a.j()).ai((char) 5908)).x("PeriodicReporterMonitoringService is bound");
        return null;
    }

    @Override // com.google.android.chimera.Service
    public final void onCreate() {
        ((eluo) ((eluo) a.h()).ai((char) 5909)).x("PeriodicReporterMonitoringService created");
        super.onCreate();
    }

    @Override // com.google.android.chimera.Service
    public final void onDestroy() {
        ((eluo) ((eluo) a.h()).ai((char) 5910)).x("PeriodicReporterMonitoringService destroyed");
        c();
        super.onDestroy();
    }

    @Override // com.google.android.chimera.Service
    public final int onStartCommand(Intent intent, int i, int i2) {
        ausn ausnVar = a;
        ((eluo) ((eluo) ausnVar.h()).ai((char) 5911)).x("PeriodicReporterMonitoringService started");
        if (!fsrb.D() || !fsrb.a.lK().ao()) {
            ((eluo) ((eluo) ausnVar.h()).ai((char) 5912)).x("Not allowed to start periodic monitoring service, stopping it");
            stopSelf();
            return 2;
        }
        if (intent == null) {
            if (!fsrb.G()) {
                ((eluo) ((eluo) ausnVar.h()).ai((char) 5915)).x("Monitoring service received null intent, stopping service");
                d();
                return 2;
            }
            ((eluo) ((eluo) ausnVar.h()).ai((char) 5916)).x("MonitoringService started with null intent. Possibly restarting after a crash");
        }
        String action = intent == null ? "com.google.android.gms.locationsharingreporter.service.reporting.periodic.ACTION_START_MONITORING_SERVICE" : intent.getAction();
        if (action == null) {
            ((eluo) ((eluo) ausnVar.j()).ai((char) 5914)).x("Monitoring service received intent with null action");
            d();
            return 2;
        }
        if (action.hashCode() == 1915620472 && action.equals("com.google.android.gms.locationsharingreporter.service.reporting.periodic.ACTION_START_MONITORING_SERVICE")) {
            cdno.a().submit(new Runnable() { // from class: cdhq
                @Override // java.lang.Runnable
                public final void run() {
                    ausn ausnVar2 = PeriodicReporterMonitoringChimeraService.a;
                    ((eluo) ((eluo) ausnVar2.h()).ai((char) 5904)).x("Starting monitoring device setting changes");
                    PeriodicReporterMonitoringChimeraService periodicReporterMonitoringChimeraService = PeriodicReporterMonitoringChimeraService.this;
                    periodicReporterMonitoringChimeraService.d.set(true);
                    synchronized (periodicReporterMonitoringChimeraService) {
                        if (periodicReporterMonitoringChimeraService.b == null) {
                            periodicReporterMonitoringChimeraService.b = new DeviceSettingChangeManager();
                        }
                        DeviceSettingChangeManager deviceSettingChangeManager = periodicReporterMonitoringChimeraService.b;
                        ausn ausnVar3 = DeviceSettingChangeManager.a;
                        ((eluo) ((eluo) ausnVar3.h()).ai((char) 5817)).x("Attempting to start listening to device setting changes");
                        Context context = deviceSettingChangeManager.b;
                        deviceSettingChangeManager.b(cdmm.a(context));
                        deviceSettingChangeManager.c(cdmm.b(context));
                        AtomicBoolean atomicBoolean = deviceSettingChangeManager.c;
                        if (!atomicBoolean.get()) {
                            ((eluo) ((eluo) ausnVar3.h()).ai((char) 5818)).x("Starting listening to device setting changes");
                            IntentFilter intentFilter = new IntentFilter();
                            intentFilter.addAction("android.location.MODE_CHANGED");
                            intentFilter.addAction("android.os.action.POWER_SAVE_MODE_CHANGED");
                            ind.c(context, deviceSettingChangeManager, intentFilter, null, new aupp(deviceSettingChangeManager.d), 2);
                            atomicBoolean.set(true);
                        }
                        if (!fsrb.A() && !fsrb.z()) {
                            if (periodicReporterMonitoringChimeraService.c != null) {
                                ((eluo) ((eluo) ausnVar2.h()).ai(5905)).x("Unregistering network callbacks as is now internet connectivity optimisation is now disabled.");
                                cdfy cdfyVar = periodicReporterMonitoringChimeraService.c;
                                ekvl.y(cdfyVar);
                                cdfyVar.c();
                                periodicReporterMonitoringChimeraService.c = null;
                            }
                        }
                        if (periodicReporterMonitoringChimeraService.c == null) {
                            periodicReporterMonitoringChimeraService.c = new cdfy();
                        }
                        periodicReporterMonitoringChimeraService.c.b();
                    }
                }
            }).hD(new Runnable() { // from class: cdhr
                @Override // java.lang.Runnable
                public final void run() {
                    ((eluo) ((eluo) PeriodicReporterMonitoringChimeraService.a.h()).ai((char) 5906)).x("Started monitoring device settings");
                }
            }, cdno.b());
        } else {
            ((eluo) ((eluo) ausnVar.j()).ai((char) 5913)).B("Monitoring service received unrecognised action: %s", action);
            d();
        }
        return fsrb.G() ? 1 : 2;
    }
}
