package com.google.android.gms.carsetup;

import android.app.NotificationChannel;
import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.hardware.usb.UsbManager;
import android.net.Uri;
import android.os.Build;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.os.SystemClock;
import com.google.android.chimera.Service;
import com.google.android.gms.R;
import com.google.android.gms.car.compat.TracingBroadcastReceiver;
import defpackage.akye;
import defpackage.akyg;
import defpackage.albn;
import defpackage.albz;
import defpackage.alce;
import defpackage.alcf;
import defpackage.alcg;
import defpackage.alcj;
import defpackage.alcl;
import defpackage.alkr;
import defpackage.alqd;
import defpackage.alqg;
import defpackage.alqh;
import defpackage.alqi;
import defpackage.alqj;
import defpackage.alxn;
import defpackage.asqh;
import defpackage.byhr;
import defpackage.eigb;
import defpackage.eiid;
import defpackage.ejhh;
import defpackage.flsr;
import defpackage.flwn;
import defpackage.flwu;
import defpackage.ijy;
import defpackage.ikb;
import defpackage.ikd;
import defpackage.iln;
import defpackage.juc;
import j$.time.Duration;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes3.dex */
public class CarStartupServiceImpl extends Service {
    private static final ejhh e;
    private static final int f;
    protected alqj a;
    public alkr b;
    private boolean j;
    private final BroadcastReceiver g = new CarStartupBroadcastReceiver();
    private final Handler h = new byhr(Looper.getMainLooper());
    private boolean i = false;
    private long k = 60000;
    private boolean l = false;
    protected final alxn c = new alxn();
    final Runnable d = new alqd(this);

    /* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
    class CarStartupBroadcastReceiver extends TracingBroadcastReceiver {
        public CarStartupBroadcastReceiver() {
            super("car");
        }

        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        @Override // com.google.android.gms.libs.punchclock.tracing.TracingBroadcastReceiver
        public final void jz(Context context, Intent intent) {
            eiid eiidVar;
            char c;
            if ("com.google.android.gms.car_setup.CAR_STARTUP_STOP_FOREGROUND".equals(intent.getAction())) {
                CarStartupServiceImpl.this.b();
                return;
            }
            if ("com.google.android.gms.car_setup.RESET_CONNECTION".equals(intent.getAction()) && CarStartupServiceImpl.this.b != null) {
                CarStartupServiceImpl.this.b.e();
                return;
            }
            CarStartupServiceImpl carStartupServiceImpl = CarStartupServiceImpl.this;
            alqj alqjVar = carStartupServiceImpl.a;
            if (alqjVar != null) {
                String action = intent.getAction();
                if (action == null) {
                    alqj.a.j().ah(2696).x("null action type");
                    eiidVar = eigb.a;
                } else {
                    try {
                        switch (action.hashCode()) {
                            case -1538406691:
                                if (action.equals("android.intent.action.BATTERY_CHANGED")) {
                                    c = 0;
                                    break;
                                }
                                c = 65535;
                                break;
                            case -1530327060:
                                if (action.equals("android.bluetooth.adapter.action.STATE_CHANGED")) {
                                    c = 4;
                                    break;
                                }
                                c = 65535;
                                break;
                            case -625334656:
                                if (action.equals("com.google.android.gms.car.FIRST_ACTIVITY")) {
                                    c = 2;
                                    break;
                                }
                                c = 65535;
                                break;
                            case -205422689:
                                if (action.equals("com.google.android.gms.car.USB_ISSUE_FOUND")) {
                                    c = 1;
                                    break;
                                }
                                c = 65535;
                                break;
                            case 876382364:
                                if (action.equals("com.google.android.gms.car_setup.CAR_STARTUP_NOTIFICATION")) {
                                    c = 5;
                                    break;
                                }
                                c = 65535;
                                break;
                            case 1605365505:
                                if (action.equals("android.hardware.usb.action.USB_ACCESSORY_DETACHED")) {
                                    c = 3;
                                    break;
                                }
                                c = 65535;
                                break;
                            default:
                                c = 65535;
                                break;
                        }
                    } catch (alcg e) {
                        intent.getAction();
                        e.getMessage();
                    }
                    if (c == 0) {
                        boolean e2 = alqj.e(intent);
                        if (alqjVar.f != e2) {
                            alqjVar.f = e2;
                            alqjVar.e = false;
                            eiidVar = alqjVar.c();
                        } else {
                            eiidVar = eigb.a;
                        }
                    } else if (c == 1) {
                        alcj alcjVar = (alcj) alcl.d(intent, alcj.values());
                        if (alcjVar == alcj.CHARGE_ONLY_DETECTED) {
                            alqjVar.e = true;
                            eiidVar = alqjVar.c();
                        } else {
                            if (alcjVar == alcj.CHARGE_ONLY_OVER) {
                                alqjVar.e = false;
                                eiidVar = alqjVar.c();
                            }
                            eiidVar = eigb.a;
                        }
                    } else if (c == 2) {
                        alcf alcfVar = (alcf) alcl.d(intent, alcf.values());
                        if (alcfVar == alcf.ACCESSORY_ATTACHED || alcfVar == alcf.FORCE_STARTED) {
                            alqjVar.e = false;
                            alqjVar.g = true;
                            eiidVar = alqjVar.c();
                        }
                        eiidVar = eigb.a;
                    } else if (c == 3) {
                        alqjVar.g = false;
                        eiidVar = alqjVar.c();
                    } else if (c != 4) {
                        if (c != 5) {
                            alqj.a.j().ah(2690).B("Unknown action type %s", action);
                        } else {
                            int intExtra = intent.getIntExtra("NOTIFICATION_TYPE_EXTRA", -1);
                            BinderParcel binderParcel = (BinderParcel) intent.getParcelableExtra("PARCEL_EXTRA");
                            if (binderParcel != null && binderParcel.a == alqjVar.b) {
                                if (intExtra >= 0) {
                                    alqi.a();
                                    if (intExtra <= 0) {
                                        int i = alqi.a()[0];
                                        int i2 = i - 1;
                                        if (i == 0) {
                                            throw null;
                                        }
                                        if (i2 == 0) {
                                            alqjVar.d(alce.CHARGE_ONLY_MORE_INFO_SELECTED);
                                            Intent intent2 = new Intent("android.intent.action.VIEW");
                                            intent2.setFlags(268566528);
                                            intent2.setData(Uri.parse(flwn.a.a().u()));
                                            Context context2 = alqjVar.c;
                                            context2.startActivity(intent2);
                                            try {
                                                context2.sendBroadcast(new Intent("android.intent.action.CLOSE_SYSTEM_DIALOGS"));
                                            } catch (SecurityException e3) {
                                                alqj.a.j().s(e3).ah(2695).x("SecurityException while trying to close system dialogs.");
                                            }
                                        }
                                    }
                                }
                                alqj.a.j().ah(2694).z("Invalid notificationType: %d", intExtra);
                                eiidVar = eigb.a;
                            }
                            alqj.a.j().ah(2693).x("Notification action from unknown source");
                            eiidVar = eigb.a;
                        }
                        eiidVar = eigb.a;
                    } else {
                        if (intent.getIntExtra("android.bluetooth.adapter.extra.STATE", -1) == 10) {
                            eiidVar = alqjVar.b();
                        }
                        eiidVar = eigb.a;
                    }
                }
                carStartupServiceImpl.c(eiidVar);
            }
        }
    }

    static {
        Duration.ofSeconds(1L);
        e = albn.a("CAR.WIFI.INFO");
        f = R.id.car_startup_service_notification_id;
    }

    public final void a(alqg alqgVar) {
        if (Build.VERSION.SDK_INT >= 30 || this.i || this.c.a.get() + 5000000000L > SystemClock.elapsedRealtimeNanos()) {
            if (this.i) {
                this.b.c(this, 100);
            }
            int a = akye.a(this);
            ikd ikdVar = new ikd(this);
            ikdVar.m(getString(R.string.car_app_name));
            ikb ikbVar = new ikb();
            eiid eiidVar = alqgVar.d;
            ikbVar.d((CharSequence) eiidVar.f());
            ikdVar.v(ikbVar);
            ikdVar.m((CharSequence) alqgVar.c.f());
            ikdVar.l((CharSequence) eiidVar.f());
            ikdVar.A = getResources().getColor(R.color.car_light_blue_500);
            ikdVar.g(a);
            ikdVar.l = -1;
            albz.a(ikdVar, getString(R.string.car_app_name));
            eiid eiidVar2 = alqgVar.f;
            if (eiidVar2.h()) {
                ikdVar.i((ijy) eiidVar2.c());
            }
            eiid eiidVar3 = alqgVar.g;
            if (eiidVar3.h()) {
                ikdVar.g = (PendingIntent) eiidVar3.c();
            }
            ikdVar.i(new ijy(0, getString(R.string.common_dismiss), PendingIntent.getBroadcast(this, 0, new Intent("com.google.android.gms.car_setup.CAR_STARTUP_STOP_FOREGROUND").setPackage(getPackageName()), 0)));
            if (flwn.e()) {
                ikdVar.i(new ijy(0, getString(R.string.common_retry), PendingIntent.getBroadcast(this, 0, new Intent("com.google.android.gms.car_setup.RESET_CONNECTION").setPackage(getPackageName()), 0)));
            }
            if (asqh.c()) {
                akyg b = akyg.b(this);
                if (b.a("car.default_notification_channel") == null) {
                    b.c(new NotificationChannel("car.default_notification_channel", getString(R.string.car_app_name), 3));
                }
                if (b.a("car.low_priority_notification_channel") == null && this.l) {
                    b.c(new NotificationChannel("car.low_priority_notification_channel", getString(R.string.car_status_notification_channel_name), 2));
                }
                eiid eiidVar4 = alqgVar.e;
                if (eiidVar4.h() && eiidVar4.c() == alqh.STATUS && this.l) {
                    ikdVar.G = "car.low_priority_notification_channel";
                } else {
                    ikdVar.G = "car.default_notification_channel";
                }
            }
            startForeground(f, ikdVar.b());
            e.h().ah(2681).x("started foreground service");
            Handler handler = this.h;
            Runnable runnable = this.d;
            handler.removeCallbacks(runnable);
            handler.postDelayed(runnable, this.k);
        }
    }

    public final void b() {
        if (this.i) {
            this.h.removeCallbacks(this.d);
            this.b.d(this);
            stopForeground(true);
            e.h().ah(2683).x("stopped foreground service");
        }
    }

    protected final boolean c(eiid eiidVar) {
        if (!eiidVar.h()) {
            e.j().ah(2674).x("Notification option is not present. Not starting foreground service.");
            return false;
        }
        alqg alqgVar = (alqg) eiidVar.c();
        if (Build.VERSION.SDK_INT >= 30) {
            a(alqgVar);
            if (alqgVar.b) {
                b();
            }
            return true;
        }
        if (alqgVar.b) {
            b();
            return false;
        }
        if (!alqgVar.a) {
            return false;
        }
        a(alqgVar);
        return true;
    }

    @Override // com.google.android.chimera.Service
    public final IBinder onBind(Intent intent) {
        return null;
    }

    @Override // com.google.android.chimera.Service
    public final void onCreate() {
        super.onCreate();
        boolean z = false;
        if (flwu.d() && flsr.d()) {
            z = true;
        }
        this.i = z;
        e.h().ah(2675).B("onCreate usbMonitoringEnabled %b", Boolean.valueOf(this.i));
        flwn flwnVar = flwn.a;
        this.k = flwnVar.a().c();
        this.l = flwn.a.a().K();
        if (this.i) {
            this.b = alkr.a(this);
            this.a = new alqj(this, (UsbManager) getSystemService("usb"));
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.intent.action.BATTERY_CHANGED");
            intentFilter.addAction("com.google.android.gms.car.FIRST_ACTIVITY");
            intentFilter.addAction("android.hardware.usb.action.USB_ACCESSORY_DETACHED");
            intentFilter.addAction("android.bluetooth.adapter.action.STATE_CHANGED");
            intentFilter.addAction("com.google.android.gms.car_setup.CAR_STARTUP_NOTIFICATION");
            intentFilter.addAction("com.google.android.gms.car_setup.CAR_STARTUP_STOP_FOREGROUND");
            intentFilter.addAction("com.google.android.gms.car_setup.RESET_CONNECTION");
            if (flwnVar.a().w()) {
                intentFilter.addAction("com.google.android.gms.car.USB_ISSUE_FOUND");
            }
            BroadcastReceiver broadcastReceiver = this.g;
            iln.b(this, broadcastReceiver, intentFilter, 2);
            juc.a(this).c(broadcastReceiver, intentFilter);
            this.j = true;
        }
    }

    @Override // com.google.android.chimera.Service
    public final void onDestroy() {
        super.onDestroy();
        if (this.j) {
            this.j = false;
            BroadcastReceiver broadcastReceiver = this.g;
            unregisterReceiver(broadcastReceiver);
            juc.a(this).d(broadcastReceiver);
        }
        this.h.removeCallbacks(this.d);
    }

    /* JADX WARN: Removed duplicated region for block: B:64:0x0281 A[ADDED_TO_REGION] */
    @Override // com.google.android.chimera.Service
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int onStartCommand(android.content.Intent r17, int r18, int r19) {
        /*
            Method dump skipped, instructions count: 678
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.carsetup.CarStartupServiceImpl.onStartCommand(android.content.Intent, int, int):int");
    }
}
