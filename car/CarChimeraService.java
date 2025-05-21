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
import defpackage.akpy;
import defpackage.akqs;
import defpackage.akre;
import defpackage.akrr;
import defpackage.akrs;
import defpackage.akrt;
import defpackage.akru;
import defpackage.aksp;
import defpackage.akye;
import defpackage.akyf;
import defpackage.akyg;
import defpackage.akyk;
import defpackage.albm;
import defpackage.albn;
import defpackage.albz;
import defpackage.aleb;
import defpackage.alhw;
import defpackage.alkq;
import defpackage.alkr;
import defpackage.alnt;
import defpackage.alrs;
import defpackage.alru;
import defpackage.alxy;
import defpackage.alyb;
import defpackage.alyc;
import defpackage.alyx;
import defpackage.arxd;
import defpackage.asqh;
import defpackage.bxhl;
import defpackage.dmym;
import defpackage.dmyn;
import defpackage.duud;
import defpackage.duuj;
import defpackage.ecyr;
import defpackage.eiig;
import defpackage.eirg;
import defpackage.eiuu;
import defpackage.ejck;
import defpackage.ejec;
import defpackage.ejgq;
import defpackage.ejhh;
import defpackage.elxk;
import defpackage.elxl;
import defpackage.erdc;
import defpackage.erdd;
import defpackage.flse;
import defpackage.fluo;
import defpackage.flwn;
import defpackage.ikd;
import defpackage.iln;
import java.io.Closeable;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Map;
import java.util.Queue;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes3.dex */
public class CarChimeraService extends Service implements akrs {
    public static final ejhh a = albn.a("CAR.SERVICE");
    private static final eiuu c = eiuu.K("android.permission-group.MICROPHONE", "android.permission-group.PHONE");
    public aksp b;
    private ConnectionStatusReceiver d;
    private akrt f;
    private bxhl i;
    private final alxy e = new alyb();
    private final akpy g = new akpy() { // from class: akpu
        @Override // defpackage.akpy
        public final void a(Intent intent) {
            String action = intent.getAction();
            boolean equals = "com.google.android.gms.car.CarChimeraService.EXIT_APP".equals(action);
            CarChimeraService carChimeraService = CarChimeraService.this;
            if (!equals) {
                if (!"android.hardware.usb.action.USB_ACCESSORY_DETACHED".equals(action) || ((UsbAccessory) intent.getParcelableExtra("accessory")) == null) {
                    return;
                }
                carChimeraService.c(CriticalError.a(elxk.PROTOCOL_BYEBYE_REQUESTED_BY_USER, elxl.BYEBYE_BY_USER));
                return;
            }
            if (!flwn.e()) {
                carChimeraService.c(CriticalError.a(elxk.PROTOCOL_BYEBYE_REQUESTED_BY_USER, elxl.BYEBYE_BY_USER));
            } else {
                CarChimeraService.a.j().ah(1782).x("Received debug request to reset connection.");
                carChimeraService.b.u();
            }
        }
    };
    private final akpy h = new akpy() { // from class: akpv
        @Override // defpackage.akpy
        public final void a(Intent intent) {
            if ("com.google.android.gms.car.CarChimeraService.EXIT_APP".equals(intent.getAction())) {
                CarChimeraService.this.c(CriticalError.a(elxk.PROTOCOL_BYEBYE_REQUESTED_BY_USER, elxl.BYEBYE_BY_USER));
            }
        }
    };

    /* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
    class ConnectionStatusReceiver extends TracingBroadcastReceiver {
        private akpy a;
        private final Object b;

        public ConnectionStatusReceiver(akpy akpyVar) {
            super("car");
            this.b = new Object();
            this.a = akpyVar;
        }

        final void b(akpy akpyVar) {
            synchronized (this.b) {
                this.a = akpyVar;
            }
        }

        @Override // com.google.android.gms.libs.punchclock.tracing.TracingBroadcastReceiver
        public final void jz(Context context, Intent intent) {
            synchronized (this.b) {
                ejhh ejhhVar = CarChimeraService.a;
                this.a.a(intent);
            }
        }
    }

    @Override // defpackage.akrs
    public final void a() {
        stopForeground(true);
        a.h().ah(1786).x("stopped foreground service");
    }

    @Override // defpackage.akrs
    public final void b() {
        int a2 = akye.a(this);
        ikd ikdVar = new ikd(this);
        ikdVar.m(getString(R.string.car_app_name));
        ikdVar.l(getString(R.string.car_notification_message));
        ikdVar.g(a2);
        ikdVar.A = getResources().getColor(R.color.car_light_blue_500);
        ikdVar.l = 2;
        if (flwn.e() && Build.VERSION.SDK_INT >= 24) {
            ejhh ejhhVar = akyf.a;
            RemoteViews remoteViews = new RemoteViews(ModuleManager.get(this).getCurrentModuleApk().apkPackageName, R.layout.car_connected_notification_layout);
            remoteViews.setOnClickPendingIntent(R.id.car_exit_button, PendingIntent.getBroadcast(this, 211696329, new Intent().setAction("com.google.android.gms.car.CarChimeraService.EXIT_APP").setPackage(getPackageName()), 0));
            ikdVar.D = remoteViews;
        }
        albz.a(ikdVar, getString(R.string.car_app_name));
        if (asqh.c()) {
            akyg b = akyg.b(this);
            if (b.a("car.default_notification_channel") == null) {
                b.c(new NotificationChannel("car.default_notification_channel", getString(R.string.car_app_name), 3));
            }
            ikdVar.G = "car.default_notification_channel";
        }
        startForeground(2, ikdVar.b());
        a.h().ah(1788).x("started foreground service");
    }

    public final void c(CriticalError criticalError) {
        this.b.r(criticalError);
    }

    @Override // defpackage.akrs
    public final void d() {
        stopSelf();
    }

    @Override // com.google.android.chimera.Service
    public final void dump(FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        char c2;
        if (akru.a(this, "android.permission.DUMP") != 0) {
            printWriter.println("Permission Denial: can't dump CarService from from pid=" + Binder.getCallingPid() + ", uid=" + Binder.getCallingUid());
            return;
        }
        albm.a(printWriter);
        akyf.a(this, printWriter);
        int length = strArr.length;
        if (length == 0) {
            aksp akspVar = this.b;
            if (akspVar != null) {
                akspVar.n(printWriter);
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
                    aksp.K();
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
        if (!akyk.c.a()) {
            return null;
        }
        if ("com.google.android.gms.car.service.START".equals(intent.getAction())) {
            return this.i;
        }
        a.j().ah(1790).B("No binder for action %s", intent.getAction());
        return null;
    }

    @Override // com.google.android.chimera.Service
    public final void onCreate() {
        super.onCreate();
        dmym dmymVar = dmym.AUDIO;
        Map map = dmyn.a;
        Queue queue = (Queue) map.get(dmymVar);
        eiig.x(queue);
        eirg eirgVar = new eirg(500);
        synchronized (queue) {
            try {
                eirgVar.addAll(queue);
                map.put(dmymVar, new ejec(eirgVar));
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
        Map map2 = dmyn.b;
        duuj duujVar = (duuj) map2.get(dmymVar);
        eiig.x(duujVar);
        duuj duujVar2 = new duuj(500);
        for (duud duudVar : duujVar.b(duujVar.b, Integer.MAX_VALUE)) {
            duujVar2.a(duudVar);
        }
        map2.put(dmymVar, duujVar2);
        this.f = akrt.a(this);
        a.h().ah(1792).x("onCreate");
        this.b = new aksp(new akre(this, getApplicationContext(), this, this.f, alkr.f(this, new alkq() { // from class: akpw
            @Override // defpackage.alkq
            public final eitj a() {
                ejhh ejhhVar = CarChimeraService.a;
                int i = eitj.d;
                return ejcb.a;
            }
        }), akyk.c));
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.hardware.usb.action.USB_ACCESSORY_DETACHED");
        intentFilter.addAction("com.google.android.gms.car.CarChimeraService.EXIT_APP");
        ConnectionStatusReceiver connectionStatusReceiver = new ConnectionStatusReceiver(this.g);
        this.d = connectionStatusReceiver;
        iln.b(this, connectionStatusReceiver, intentFilter, 2);
        int i = bxhl.b;
        ejck ejckVar = ejck.a;
        this.i = alhw.a(this, this.b, c, alnt.a);
    }

    @Override // com.google.android.chimera.Service
    public final void onDestroy() {
        a.h().ah(1793).x("onDestroy");
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
        if (!akyk.c.a()) {
            return 2;
        }
        if (!this.e.a(this, intent)) {
            a.j().ah(1802).x("Failed validation, not starting anything");
            return 2;
        }
        final ecyr ecyrVar = null;
        final alru alruVar = null;
        ecyrVar = null;
        if ("com.google.android.gms.car.HANDOFF".equals(intent.getAction())) {
            IBinder iBinder = ((BinderParcel) intent.getParcelableExtra("connection_tear_down_helper")).a;
            if (iBinder != null) {
                IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.carsetup.ITransferStateCallbacks");
                alruVar = queryLocalInterface instanceof alru ? (alru) queryLocalInterface : new alrs(iBinder);
            }
            Closeable closeable = new Closeable() { // from class: akpx
                @Override // java.io.Closeable, java.lang.AutoCloseable
                public final void close() {
                    ejhh ejhhVar = CarChimeraService.a;
                    try {
                        alru.this.a();
                    } catch (RemoteException e) {
                        CarChimeraService.a.j().s(e).ah(1784).x("Failed to call transferStateCallbacks.close().");
                    }
                }
            };
            akqs d = this.b.d();
            eiig.x(intent.getByteArrayExtra("car_handoff_car_info"));
            CarInfoInternal carInfoInternal = (CarInfoInternal) arxd.b(intent, "car_handoff_car_info", CarInfoInternal.CREATOR);
            boolean booleanExtra = flse.a.a().a() ? intent.getBooleanExtra("car_handoff_is_car_audio_service_migration_enabled", false) : false;
            int intExtra = intent.getIntExtra("car_handoff_connection_type", 1);
            akrr akrrVar = new akrr(this, intExtra, intent.getIntExtra("car_handoff_analytics_session_id", 0), closeable, carInfoInternal, booleanExtra, (CarBluetoothData) intent.getParcelableExtra("car_handoff_starting_bluetooth_device"), d.d());
            final ComponentName unflattenFromString = ComponentName.unflattenFromString(intent.getStringExtra("car_handoff_component"));
            final long longExtra = intent.getLongExtra("car_handoff_session_id", 0L);
            boolean booleanExtra2 = intent.getBooleanExtra("car_handoff_user_authorized_projection", false);
            unflattenFromString.flattenToString();
            if (fluo.c()) {
                akru.d();
            }
            akrrVar.j = booleanExtra2;
            if (longExtra != akrrVar.g) {
                akrrVar.g = longExtra;
                alyc alycVar = akrrVar.b;
                final aleb alebVar = akrrVar.c;
                final alyx alyxVar = (alyx) alycVar;
                alyxVar.d.post(new Runnable() { // from class: alyg
                    @Override // java.lang.Runnable
                    public final void run() {
                        alyx alyxVar2 = alyx.this;
                        eiig.q(alyxVar2.h == null, "Cannot resume already live car connection");
                        alyxVar2.h = new alyo(alyxVar2, longExtra, unflattenFromString, alebVar);
                        alyo alyoVar = alyxVar2.h;
                        long j = alyoVar.b;
                        Intent intent2 = new Intent();
                        intent2.setComponent(alyoVar.c);
                        int i3 = true != asqh.f() ? 65 : 4161;
                        alyx alyxVar3 = alyoVar.g;
                        if (((Boolean) alyxVar3.b.a()).booleanValue() ? asiu.a().d(alyxVar3.c, intent2, alyoVar, i3) : alyxVar3.c.bindService(intent2, alyoVar, i3)) {
                            alyoVar.h = 1;
                        }
                        if (alyoVar.h != 1) {
                            alyxVar3.i.b();
                        }
                    }
                });
            }
            ejhh ejhhVar = a;
            ejgq ah = ejhhVar.h().ah(1800);
            Integer valueOf = Integer.valueOf(intExtra);
            erdc erdcVar = erdc.NO_USER_DATA;
            ah.K("Overriding delegate with new Lite CarServiceBinder, sessionId: %d, connectionType: %s", longExtra, new erdd(erdcVar, valueOf));
            AtomicReference atomicReference = this.b.k;
            while (true) {
                if (atomicReference.compareAndSet(d, akrrVar)) {
                    z = true;
                    break;
                }
                if (atomicReference.get() != d) {
                    z = false;
                    break;
                }
            }
            eiig.q(z, "Failed to update delegate");
            ejhhVar.h().ah(1801).B("Updating receiver callback and sessionId for connectionType: %s", new erdd(erdcVar, Integer.valueOf(intExtra)));
            this.d.b(intExtra == 2 ? this.h : this.g);
        } else if ("com.google.android.gms.car.HANDOFF_USER_AUTHORIZATION".equals(intent.getAction())) {
            akqs d2 = this.b.d();
            long longExtra2 = intent.getLongExtra("car_handoff_session_id", 0L);
            int intExtra2 = intent.getIntExtra("car_handoff_connection_type", 1);
            if (d2.d() != d2) {
                akrr akrrVar2 = (akrr) d2;
                if (fluo.c()) {
                    akru.d();
                }
                if (akrrVar2.g == longExtra2) {
                    boolean booleanExtra3 = intent.getBooleanExtra("car_handoff_user_authorized_projection", false);
                    if (!booleanExtra3 && intent.hasExtra("car_handoff_user_not_authorized_projection_bye_bye_reason")) {
                        int intExtra3 = intent.getIntExtra("car_handoff_user_not_authorized_projection_bye_bye_reason", 0);
                        ecyr b = ecyr.b(intExtra3);
                        if (b == null) {
                            a.i().ah(1799).z("Unknown ByeByeReason number %d given, should never happen", intExtra3);
                        }
                        ecyrVar = b;
                    }
                    if (fluo.c()) {
                        akru.d();
                    }
                    akrrVar2.j = booleanExtra3;
                    if (longExtra2 == akrrVar2.g) {
                        if (!booleanExtra3) {
                            if (ecyrVar != null) {
                                alyc alycVar2 = akrrVar2.b;
                                alyx.a.h().ah(2958).z("Teardown initiated for ByeByeReason %d", ecyrVar.h);
                                final alyx alyxVar2 = (alyx) alycVar2;
                                alyxVar2.d.post(new Runnable() { // from class: alye
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        ecyr ecyrVar2 = ecyrVar;
                                        alyo alyoVar = alyx.this.h;
                                        if (alyoVar != null) {
                                            try {
                                                alie alieVar = alyoVar.j;
                                                eiig.y(alieVar, "Can not send ByeByeRequest because StartupService is not connected.");
                                                alieVar.a(alyoVar.b, ecyrVar2.h);
                                            } catch (RemoteException e) {
                                                alyx.a.h().s(e).ah(2944).B("Couldn't send bye-bye request to %s, but it could be fine.", alyoVar.c);
                                            }
                                        }
                                    }
                                });
                            } else {
                                akrrVar2.b.a();
                            }
                            akrrVar2.d().q();
                            akrrVar2.d().r(CriticalError.a(elxk.PROTOCOL_BYEBYE_REQUESTED_BY_USER, elxl.BYEBYE_BY_USER));
                            akrrVar2.G();
                        } else if (akrrVar2.i) {
                            akrrVar2.I();
                        }
                    }
                    a.h().ah(1798).B("Updating receiver callback and sessionId for connectionType: %s", new erdd(erdc.NO_USER_DATA, Integer.valueOf(intExtra2)));
                    this.d.b(intExtra2 == 2 ? this.h : this.g);
                } else {
                    a.j().ah(1797).A("received user authorization on an invalid session %d", longExtra2);
                }
            } else {
                a.j().ah(1796).x("received user authorization without car handoff command");
            }
        }
        return 2;
    }
}
