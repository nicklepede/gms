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
import defpackage.amzp;
import defpackage.amzr;
import defpackage.ancy;
import defpackage.andk;
import defpackage.andp;
import defpackage.andq;
import defpackage.andr;
import defpackage.andu;
import defpackage.andw;
import defpackage.anmc;
import defpackage.anro;
import defpackage.anrr;
import defpackage.anrs;
import defpackage.anrt;
import defpackage.anru;
import defpackage.anyy;
import defpackage.auub;
import defpackage.caqj;
import defpackage.ektg;
import defpackage.ekvi;
import defpackage.eluq;
import defpackage.fokd;
import defpackage.fonw;
import defpackage.food;
import defpackage.ilo;
import defpackage.ilr;
import defpackage.ilt;
import defpackage.ind;
import defpackage.kar;
import j$.time.Duration;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes3.dex */
public class CarStartupServiceImpl extends Service {
    private static final eluq e;
    private static final int f;
    protected anru a;
    public anmc b;
    private boolean j;
    private final BroadcastReceiver g = new CarStartupBroadcastReceiver();
    private final Handler h = new caqj(Looper.getMainLooper());
    private boolean i = false;
    private long k = 60000;
    private boolean l = false;
    protected final anyy c = new anyy();
    final Runnable d = new anro(this);

    /* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
    class CarStartupBroadcastReceiver extends TracingBroadcastReceiver {
        public CarStartupBroadcastReceiver() {
            super("car");
        }

        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        @Override // com.google.android.gms.libs.punchclock.tracing.TracingBroadcastReceiver
        public final void jP(Context context, Intent intent) {
            ekvi ekviVar;
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
            anru anruVar = carStartupServiceImpl.a;
            if (anruVar != null) {
                String action = intent.getAction();
                if (action == null) {
                    anru.a.j().ai(2700).x("null action type");
                    ekviVar = ektg.a;
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
                    } catch (andr e) {
                        intent.getAction();
                        e.getMessage();
                    }
                    if (c == 0) {
                        boolean e2 = anru.e(intent);
                        if (anruVar.f != e2) {
                            anruVar.f = e2;
                            anruVar.e = false;
                            ekviVar = anruVar.c();
                        } else {
                            ekviVar = ektg.a;
                        }
                    } else if (c == 1) {
                        andu anduVar = (andu) andw.d(intent, andu.values());
                        if (anduVar == andu.CHARGE_ONLY_DETECTED) {
                            anruVar.e = true;
                            ekviVar = anruVar.c();
                        } else {
                            if (anduVar == andu.CHARGE_ONLY_OVER) {
                                anruVar.e = false;
                                ekviVar = anruVar.c();
                            }
                            ekviVar = ektg.a;
                        }
                    } else if (c == 2) {
                        andq andqVar = (andq) andw.d(intent, andq.values());
                        if (andqVar == andq.ACCESSORY_ATTACHED || andqVar == andq.FORCE_STARTED) {
                            anruVar.e = false;
                            anruVar.g = true;
                            ekviVar = anruVar.c();
                        }
                        ekviVar = ektg.a;
                    } else if (c == 3) {
                        anruVar.g = false;
                        ekviVar = anruVar.c();
                    } else if (c != 4) {
                        if (c != 5) {
                            anru.a.j().ai(2694).B("Unknown action type %s", action);
                        } else {
                            int intExtra = intent.getIntExtra("NOTIFICATION_TYPE_EXTRA", -1);
                            BinderParcel binderParcel = (BinderParcel) intent.getParcelableExtra("PARCEL_EXTRA");
                            if (binderParcel != null && binderParcel.a == anruVar.b) {
                                if (intExtra >= 0) {
                                    anrt.a();
                                    if (intExtra <= 0) {
                                        int i = anrt.a()[0];
                                        int i2 = i - 1;
                                        if (i == 0) {
                                            throw null;
                                        }
                                        if (i2 == 0) {
                                            anruVar.d(andp.CHARGE_ONLY_MORE_INFO_SELECTED);
                                            Intent intent2 = new Intent("android.intent.action.VIEW");
                                            intent2.setFlags(268566528);
                                            intent2.setData(Uri.parse(fonw.a.lK().u()));
                                            Context context2 = anruVar.c;
                                            context2.startActivity(intent2);
                                            try {
                                                context2.sendBroadcast(new Intent("android.intent.action.CLOSE_SYSTEM_DIALOGS"));
                                            } catch (SecurityException e3) {
                                                anru.a.j().s(e3).ai(2699).x("SecurityException while trying to close system dialogs.");
                                            }
                                        }
                                    }
                                }
                                anru.a.j().ai(2698).z("Invalid notificationType: %d", intExtra);
                                ekviVar = ektg.a;
                            }
                            anru.a.j().ai(2697).x("Notification action from unknown source");
                            ekviVar = ektg.a;
                        }
                        ekviVar = ektg.a;
                    } else {
                        if (intent.getIntExtra("android.bluetooth.adapter.extra.STATE", -1) == 10) {
                            ekviVar = anruVar.b();
                        }
                        ekviVar = ektg.a;
                    }
                }
                carStartupServiceImpl.c(ekviVar);
            }
        }
    }

    static {
        Duration.ofSeconds(1L);
        e = ancy.a("CAR.WIFI.INFO");
        f = R.id.car_startup_service_notification_id;
    }

    public final void a(anrr anrrVar) {
        if (Build.VERSION.SDK_INT >= 30 || this.i || this.c.a.get() + 5000000000L > SystemClock.elapsedRealtimeNanos()) {
            if (this.i) {
                this.b.c(this, 100);
            }
            int a = amzp.a(this);
            ilt iltVar = new ilt(this);
            iltVar.r(getString(R.string.car_app_name));
            ilr ilrVar = new ilr();
            ekvi ekviVar = anrrVar.d;
            ilrVar.d((CharSequence) ekviVar.f());
            iltVar.o(ilrVar);
            iltVar.r((CharSequence) anrrVar.c.f());
            iltVar.j((CharSequence) ekviVar.f());
            iltVar.A = getResources().getColor(R.color.car_light_blue_500);
            iltVar.n(a);
            iltVar.l = -1;
            andk.a(iltVar, getString(R.string.car_app_name));
            ekvi ekviVar2 = anrrVar.f;
            if (ekviVar2.h()) {
                iltVar.f((ilo) ekviVar2.c());
            }
            ekvi ekviVar3 = anrrVar.g;
            if (ekviVar3.h()) {
                iltVar.g = (PendingIntent) ekviVar3.c();
            }
            iltVar.f(new ilo(0, getString(R.string.common_dismiss), PendingIntent.getBroadcast(this, 0, new Intent("com.google.android.gms.car_setup.CAR_STARTUP_STOP_FOREGROUND").setPackage(getPackageName()), 0)));
            if (fonw.e()) {
                iltVar.f(new ilo(0, getString(R.string.common_retry), PendingIntent.getBroadcast(this, 0, new Intent("com.google.android.gms.car_setup.RESET_CONNECTION").setPackage(getPackageName()), 0)));
            }
            if (auub.c()) {
                amzr b = amzr.b(this);
                if (b.a("car.default_notification_channel") == null) {
                    b.c(new NotificationChannel("car.default_notification_channel", getString(R.string.car_app_name), 3));
                }
                if (b.a("car.low_priority_notification_channel") == null && this.l) {
                    b.c(new NotificationChannel("car.low_priority_notification_channel", getString(R.string.car_status_notification_channel_name), 2));
                }
                ekvi ekviVar4 = anrrVar.e;
                if (ekviVar4.h() && ekviVar4.c() == anrs.STATUS && this.l) {
                    iltVar.G = "car.low_priority_notification_channel";
                } else {
                    iltVar.G = "car.default_notification_channel";
                }
            }
            startForeground(f, iltVar.b());
            e.h().ai(2685).x("started foreground service");
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
            e.h().ai(2687).x("stopped foreground service");
        }
    }

    protected final boolean c(ekvi ekviVar) {
        if (!ekviVar.h()) {
            e.j().ai(2678).x("Notification option is not present. Not starting foreground service.");
            return false;
        }
        anrr anrrVar = (anrr) ekviVar.c();
        if (Build.VERSION.SDK_INT >= 30) {
            a(anrrVar);
            if (anrrVar.b) {
                b();
            }
            return true;
        }
        if (anrrVar.b) {
            b();
            return false;
        }
        if (!anrrVar.a) {
            return false;
        }
        a(anrrVar);
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
        if (food.d() && fokd.d()) {
            z = true;
        }
        this.i = z;
        e.h().ai(2679).B("onCreate usbMonitoringEnabled %b", Boolean.valueOf(this.i));
        fonw fonwVar = fonw.a;
        this.k = fonwVar.lK().c();
        this.l = fonwVar.lK().K();
        if (this.i) {
            this.b = anmc.a(this);
            this.a = new anru(this, (UsbManager) getSystemService("usb"));
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.intent.action.BATTERY_CHANGED");
            intentFilter.addAction("com.google.android.gms.car.FIRST_ACTIVITY");
            intentFilter.addAction("android.hardware.usb.action.USB_ACCESSORY_DETACHED");
            intentFilter.addAction("android.bluetooth.adapter.action.STATE_CHANGED");
            intentFilter.addAction("com.google.android.gms.car_setup.CAR_STARTUP_NOTIFICATION");
            intentFilter.addAction("com.google.android.gms.car_setup.CAR_STARTUP_STOP_FOREGROUND");
            intentFilter.addAction("com.google.android.gms.car_setup.RESET_CONNECTION");
            if (fonwVar.lK().w()) {
                intentFilter.addAction("com.google.android.gms.car.USB_ISSUE_FOUND");
            }
            BroadcastReceiver broadcastReceiver = this.g;
            ind.b(this, broadcastReceiver, intentFilter, 2);
            kar.a(this).c(broadcastReceiver, intentFilter);
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
            kar.a(this).d(broadcastReceiver);
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
