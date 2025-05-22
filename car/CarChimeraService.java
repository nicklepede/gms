package com.google.android.gms.car;

import android.app.NotificationChannel;
import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.hardware.usb.UsbAccessory;
import android.os.Binder;
import android.os.Build;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import android.widget.RemoteViews;
import com.google.android.chimera.Service;
import com.google.android.chimera.config.ModuleManager;
import com.google.android.gms.R;
import com.google.android.gms.car.CarChimeraService;
import com.google.android.gms.car.bluetooth.data.CarBluetoothData;
import com.google.android.gms.car.compat.TracingBroadcastReceiver;
import com.google.android.gms.car.diagnostics.CriticalError;
import com.google.android.gms.carsetup.BinderParcel;
import com.google.android.gms.carsetup.CarInfoInternal;
import defpackage.a;
import defpackage.amrj;
import defpackage.amsd;
import defpackage.amsp;
import defpackage.amtc;
import defpackage.amtd;
import defpackage.amte;
import defpackage.amtf;
import defpackage.amua;
import defpackage.amzp;
import defpackage.amzq;
import defpackage.amzr;
import defpackage.amzv;
import defpackage.ancx;
import defpackage.ancy;
import defpackage.andk;
import defpackage.anfm;
import defpackage.anjh;
import defpackage.anmb;
import defpackage.anmc;
import defpackage.anpe;
import defpackage.antd;
import defpackage.antf;
import defpackage.anzj;
import defpackage.anzm;
import defpackage.anzn;
import defpackage.aoai;
import defpackage.atzs;
import defpackage.auub;
import defpackage.bzqb;
import defpackage.dpka;
import defpackage.dpkb;
import defpackage.dxer;
import defpackage.dxff;
import defpackage.eflm;
import defpackage.ekvl;
import defpackage.elel;
import defpackage.elhz;
import defpackage.elpp;
import defpackage.elrj;
import defpackage.eltz;
import defpackage.eluq;
import defpackage.eoky;
import defpackage.eokz;
import defpackage.etry;
import defpackage.etrz;
import defpackage.fojq;
import defpackage.folx;
import defpackage.fonw;
import defpackage.ilt;
import defpackage.ind;
import java.io.Closeable;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Map;
import java.util.Queue;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes3.dex */
public class CarChimeraService extends Service implements amtd {
    public static final eluq a = ancy.a("CAR.SERVICE");
    private static final elhz c = elhz.K("android.permission-group.MICROPHONE", "android.permission-group.PHONE");
    public amua b;
    private ConnectionStatusReceiver d;
    private amte f;
    private bzqb i;
    private final anzj e = new anzm();
    private final amrj g = new amrj() { // from class: amrf
        @Override // defpackage.amrj
        public final void a(Intent intent) {
            String action = intent.getAction();
            boolean equals = "com.google.android.gms.car.CarChimeraService.EXIT_APP".equals(action);
            CarChimeraService carChimeraService = CarChimeraService.this;
            if (!equals) {
                if (!"android.hardware.usb.action.USB_ACCESSORY_DETACHED".equals(action) || ((UsbAccessory) intent.getParcelableExtra("accessory")) == null) {
                    return;
                }
                carChimeraService.c(CriticalError.a(eoky.PROTOCOL_BYEBYE_REQUESTED_BY_USER, eokz.BYEBYE_BY_USER));
                return;
            }
            if (!fonw.e()) {
                carChimeraService.c(CriticalError.a(eoky.PROTOCOL_BYEBYE_REQUESTED_BY_USER, eokz.BYEBYE_BY_USER));
            } else {
                CarChimeraService.a.j().ai(1786).x("Received debug request to reset connection.");
                carChimeraService.b.u();
            }
        }
    };
    private final amrj h = new amrj() { // from class: amrg
        @Override // defpackage.amrj
        public final void a(Intent intent) {
            if ("com.google.android.gms.car.CarChimeraService.EXIT_APP".equals(intent.getAction())) {
                CarChimeraService.this.c(CriticalError.a(eoky.PROTOCOL_BYEBYE_REQUESTED_BY_USER, eokz.BYEBYE_BY_USER));
            }
        }
    };

    /* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
    class ConnectionStatusReceiver extends TracingBroadcastReceiver {
        private amrj a;
        private final Object b;

        public ConnectionStatusReceiver(amrj amrjVar) {
            super("car");
            this.b = new Object();
            this.a = amrjVar;
        }

        final void b(amrj amrjVar) {
            synchronized (this.b) {
                this.a = amrjVar;
            }
        }

        @Override // com.google.android.gms.libs.punchclock.tracing.TracingBroadcastReceiver
        public final void jP(Context context, Intent intent) {
            synchronized (this.b) {
                eluq eluqVar = CarChimeraService.a;
                this.a.a(intent);
            }
        }
    }

    @Override // defpackage.amtd
    public final void a() {
        stopForeground(true);
        a.h().ai(1790).x("stopped foreground service");
    }

    @Override // defpackage.amtd
    public final void b() {
        int a2 = amzp.a(this);
        ilt iltVar = new ilt(this);
        iltVar.r(getString(R.string.car_app_name));
        iltVar.j(getString(R.string.car_notification_message));
        iltVar.n(a2);
        iltVar.A = getResources().getColor(R.color.car_light_blue_500);
        iltVar.l = 2;
        if (fonw.e() && Build.VERSION.SDK_INT >= 24) {
            eluq eluqVar = amzq.a;
            RemoteViews remoteViews = new RemoteViews(ModuleManager.get(this).getCurrentModuleApk().apkPackageName, R.layout.car_connected_notification_layout);
            remoteViews.setOnClickPendingIntent(R.id.car_exit_button, PendingIntent.getBroadcast(this, 211696329, new Intent().setAction("com.google.android.gms.car.CarChimeraService.EXIT_APP").setPackage(getPackageName()), 0));
            iltVar.D = remoteViews;
        }
        andk.a(iltVar, getString(R.string.car_app_name));
        if (auub.c()) {
            amzr b = amzr.b(this);
            if (b.a("car.default_notification_channel") == null) {
                b.c(new NotificationChannel("car.default_notification_channel", getString(R.string.car_app_name), 3));
            }
            iltVar.G = "car.default_notification_channel";
        }
        startForeground(2, iltVar.b());
        a.h().ai(1792).x("started foreground service");
    }

    public final void c(CriticalError criticalError) {
        this.b.r(criticalError);
    }

    @Override // defpackage.amtd
    public final void d() {
        stopSelf();
    }

    @Override // com.google.android.chimera.Service
    public final void dump(FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        char c2;
        if (amtf.a(this, "android.permission.DUMP") != 0) {
            printWriter.println("Permission Denial: can't dump CarService from from pid=" + Binder.getCallingPid() + ", uid=" + Binder.getCallingUid());
            return;
        }
        ancx.a(printWriter);
        amzq.a(this, printWriter);
        int length = strArr.length;
        if (length == 0) {
            amua amuaVar = this.b;
            if (amuaVar != null) {
                amuaVar.n(printWriter);
                return;
            }
            return;
        }
        String str = strArr[0];
        if (str.hashCode() != 113762 || !str.equals("set")) {
            printWriter.println("Error: Unknown command: ".concat(String.valueOf(str)));
            return;
        }
        if (length < 4) {
            printWriter.println("Error: not enough arguments to set.");
            printWriter.println("set [setting] [string|boolean] [value]");
            return;
        }
        try {
            String str2 = strArr[2];
            int hashCode = str2.hashCode();
            if (hashCode == -891985903) {
                if (str2.equals("string")) {
                    c2 = 1;
                }
                c2 = 65535;
            } else if (hashCode != -189262159) {
                if (hashCode == 64711720 && str2.equals("boolean")) {
                    c2 = 0;
                }
                c2 = 65535;
            } else {
                if (str2.equals("stringset")) {
                    c2 = 2;
                }
                c2 = 65535;
            }
            if (c2 != 0) {
                if (c2 == 1) {
                    this.b.w(strArr[1], strArr[3]);
                } else if (c2 != 2) {
                    printWriter.println(a.x(str2, "Error: Unknown value type: "));
                    return;
                } else {
                    String str3 = strArr[1];
                    Arrays.asList(strArr[3].split(",", -1));
                    amua.K();
                }
            } else if (strArr[3].equals("true")) {
                this.b.v(strArr[1], true);
            } else {
                if (!strArr[3].equals("false")) {
                    printWriter.println("Error: Unrecognized boolean value: " + strArr[3]);
                    return;
                }
                this.b.v(strArr[1], false);
            }
            printWriter.println("Success. Set " + strArr[1] + " to " + strArr[3]);
        } catch (IllegalStateException e) {
            printWriter.println("Error: ".concat(String.valueOf(e.getMessage())));
        }
    }

    @Override // com.google.android.chimera.Service
    public final IBinder onBind(Intent intent) {
        if (!amzv.c.a()) {
            return null;
        }
        if ("com.google.android.gms.car.service.START".equals(intent.getAction())) {
            return this.i;
        }
        a.j().ai(1794).B("No binder for action %s", intent.getAction());
        return null;
    }

    @Override // com.google.android.chimera.Service
    public final void onCreate() {
        super.onCreate();
        dpka dpkaVar = dpka.AUDIO;
        Map map = dpkb.a;
        Queue queue = (Queue) map.get(dpkaVar);
        ekvl.y(queue);
        elel elelVar = new elel(500);
        synchronized (queue) {
            try {
                elelVar.addAll(queue);
                map.put(dpkaVar, new elrj(elelVar));
            } catch (Throwable th) {
                th = th;
                while (true) {
                    try {
                        throw th;
                    } catch (Throwable th2) {
                        th = th2;
                    }
                }
            }
        }
        Map map2 = dpkb.b;
        dxff dxffVar = (dxff) map2.get(dpkaVar);
        ekvl.y(dxffVar);
        dxff dxffVar2 = new dxff(500);
        for (dxer dxerVar : dxffVar.b(dxffVar.b, Integer.MAX_VALUE)) {
            dxffVar2.a(dxerVar);
        }
        map2.put(dpkaVar, dxffVar2);
        this.f = amte.a(this);
        a.h().ai(1796).x("onCreate");
        this.b = new amua(new amsp(this, getApplicationContext(), this, this.f, anmc.f(this, new anmb() { // from class: amrh
            @Override // defpackage.anmb
            public final elgo a() {
                eluq eluqVar = CarChimeraService.a;
                int i = elgo.d;
                return elpg.a;
            }
        }), amzv.c));
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.hardware.usb.action.USB_ACCESSORY_DETACHED");
        intentFilter.addAction("com.google.android.gms.car.CarChimeraService.EXIT_APP");
        ConnectionStatusReceiver connectionStatusReceiver = new ConnectionStatusReceiver(this.g);
        this.d = connectionStatusReceiver;
        ind.b(this, connectionStatusReceiver, intentFilter, 2);
        int i = bzqb.b;
        elpp elppVar = elpp.a;
        this.i = anjh.a(this, this.b, c, anpe.a);
    }

    @Override // com.google.android.chimera.Service
    public final void onDestroy() {
        a.h().ai(1797).x("onDestroy");
        ConnectionStatusReceiver connectionStatusReceiver = this.d;
        if (connectionStatusReceiver != null) {
            unregisterReceiver(connectionStatusReceiver);
            this.d = null;
        }
        super.onDestroy();
        this.b.x();
    }

    @Override // com.google.android.chimera.Service
    public final int onStartCommand(Intent intent, int i, int i2) {
        boolean z;
        if (intent == null) {
            stopSelf(i2);
            return 2;
        }
        if (!amzv.c.a()) {
            return 2;
        }
        if (!this.e.a(this, intent)) {
            a.j().ai(1806).x("Failed validation, not starting anything");
            return 2;
        }
        final eflm eflmVar = null;
        final antf antfVar = null;
        eflmVar = null;
        if ("com.google.android.gms.car.HANDOFF".equals(intent.getAction())) {
            IBinder iBinder = ((BinderParcel) intent.getParcelableExtra("connection_tear_down_helper")).a;
            if (iBinder != null) {
                IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.carsetup.ITransferStateCallbacks");
                antfVar = queryLocalInterface instanceof antf ? (antf) queryLocalInterface : new antd(iBinder);
            }
            Closeable closeable = new Closeable() { // from class: amri
                @Override // java.io.Closeable, java.lang.AutoCloseable
                public final void close() {
                    eluq eluqVar = CarChimeraService.a;
                    try {
                        antf.this.a();
                    } catch (RemoteException e) {
                        CarChimeraService.a.j().s(e).ai(1788).x("Failed to call transferStateCallbacks.close().");
                    }
                }
            };
            amsd d = this.b.d();
            ekvl.y(intent.getByteArrayExtra("car_handoff_car_info"));
            CarInfoInternal carInfoInternal = (CarInfoInternal) atzs.b(intent, "car_handoff_car_info", CarInfoInternal.CREATOR);
            boolean booleanExtra = fojq.a.lK().a() ? intent.getBooleanExtra("car_handoff_is_car_audio_service_migration_enabled", false) : false;
            int intExtra = intent.getIntExtra("car_handoff_connection_type", 1);
            amtc amtcVar = new amtc(this, intExtra, intent.getIntExtra("car_handoff_analytics_session_id", 0), closeable, carInfoInternal, booleanExtra, (CarBluetoothData) intent.getParcelableExtra("car_handoff_starting_bluetooth_device"), d.d());
            final ComponentName unflattenFromString = ComponentName.unflattenFromString(intent.getStringExtra("car_handoff_component"));
            final long longExtra = intent.getLongExtra("car_handoff_session_id", 0L);
            boolean booleanExtra2 = intent.getBooleanExtra("car_handoff_user_authorized_projection", false);
            unflattenFromString.flattenToString();
            if (folx.c()) {
                amtf.d();
            }
            amtcVar.j = booleanExtra2;
            if (longExtra != amtcVar.g) {
                amtcVar.g = longExtra;
                anzn anznVar = amtcVar.b;
                final anfm anfmVar = amtcVar.c;
                final aoai aoaiVar = (aoai) anznVar;
                aoaiVar.d.post(new Runnable() { // from class: anzr
                    @Override // java.lang.Runnable
                    public final void run() {
                        aoai aoaiVar2 = aoai.this;
                        ekvl.r(aoaiVar2.h == null, "Cannot resume already live car connection");
                        aoaiVar2.h = new anzz(aoaiVar2, longExtra, unflattenFromString, anfmVar);
                        anzz anzzVar = aoaiVar2.h;
                        long j = anzzVar.b;
                        Intent intent2 = new Intent();
                        intent2.setComponent(anzzVar.c);
                        int i3 = true != auub.f() ? 65 : 4161;
                        aoai aoaiVar3 = anzzVar.g;
                        if (((Boolean) aoaiVar3.b.lK()).booleanValue() ? aumo.a().d(aoaiVar3.c, intent2, anzzVar, i3) : aoaiVar3.c.bindService(intent2, anzzVar, i3)) {
                            anzzVar.h = 1;
                        }
                        if (anzzVar.h != 1) {
                            aoaiVar3.i.b();
                        }
                    }
                });
            }
            eluq eluqVar = a;
            eltz ai = eluqVar.h().ai(1804);
            Integer valueOf = Integer.valueOf(intExtra);
            etry etryVar = etry.NO_USER_DATA;
            ai.K("Overriding delegate with new Lite CarServiceBinder, sessionId: %d, connectionType: %s", longExtra, new etrz(etryVar, valueOf));
            AtomicReference atomicReference = this.b.k;
            while (true) {
                if (atomicReference.compareAndSet(d, amtcVar)) {
                    z = true;
                    break;
                }
                if (atomicReference.get() != d) {
                    z = false;
                    break;
                }
            }
            ekvl.r(z, "Failed to update delegate");
            eluqVar.h().ai(1805).B("Updating receiver callback and sessionId for connectionType: %s", new etrz(etryVar, Integer.valueOf(intExtra)));
            this.d.b(intExtra == 2 ? this.h : this.g);
        } else if ("com.google.android.gms.car.HANDOFF_USER_AUTHORIZATION".equals(intent.getAction())) {
            amsd d2 = this.b.d();
            long longExtra2 = intent.getLongExtra("car_handoff_session_id", 0L);
            int intExtra2 = intent.getIntExtra("car_handoff_connection_type", 1);
            if (d2.d() != d2) {
                amtc amtcVar2 = (amtc) d2;
                if (folx.c()) {
                    amtf.d();
                }
                if (amtcVar2.g == longExtra2) {
                    boolean booleanExtra3 = intent.getBooleanExtra("car_handoff_user_authorized_projection", false);
                    if (!booleanExtra3 && intent.hasExtra("car_handoff_user_not_authorized_projection_bye_bye_reason")) {
                        int intExtra3 = intent.getIntExtra("car_handoff_user_not_authorized_projection_bye_bye_reason", 0);
                        eflm b = eflm.b(intExtra3);
                        if (b == null) {
                            a.i().ai(1803).z("Unknown ByeByeReason number %d given, should never happen", intExtra3);
                        }
                        eflmVar = b;
                    }
                    if (folx.c()) {
                        amtf.d();
                    }
                    amtcVar2.j = booleanExtra3;
                    if (longExtra2 == amtcVar2.g) {
                        if (!booleanExtra3) {
                            if (eflmVar != null) {
                                anzn anznVar2 = amtcVar2.b;
                                aoai.a.h().ai(2962).z("Teardown initiated for ByeByeReason %d", eflmVar.h);
                                final aoai aoaiVar2 = (aoai) anznVar2;
                                aoaiVar2.d.post(new Runnable() { // from class: anzp
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        eflm eflmVar2 = eflmVar;
                                        anzz anzzVar = aoai.this.h;
                                        if (anzzVar != null) {
                                            try {
                                                anjp anjpVar = anzzVar.j;
                                                ekvl.z(anjpVar, "Can not send ByeByeRequest because StartupService is not connected.");
                                                anjpVar.a(anzzVar.b, eflmVar2.h);
                                            } catch (RemoteException e) {
                                                aoai.a.h().s(e).ai(2948).B("Couldn't send bye-bye request to %s, but it could be fine.", anzzVar.c);
                                            }
                                        }
                                    }
                                });
                            } else {
                                amtcVar2.b.a();
                            }
                            amtcVar2.d().q();
                            amtcVar2.d().r(CriticalError.a(eoky.PROTOCOL_BYEBYE_REQUESTED_BY_USER, eokz.BYEBYE_BY_USER));
                            amtcVar2.G();
                        } else if (amtcVar2.i) {
                            amtcVar2.I();
                        }
                    }
                    a.h().ai(1802).B("Updating receiver callback and sessionId for connectionType: %s", new etrz(etry.NO_USER_DATA, Integer.valueOf(intExtra2)));
                    this.d.b(intExtra2 == 2 ? this.h : this.g);
                } else {
                    a.j().ai(1801).A("received user authorization on an invalid session %d", longExtra2);
                }
            } else {
                a.j().ai(1800).x("received user authorization without car handoff command");
            }
        }
        return 2;
    }
}
