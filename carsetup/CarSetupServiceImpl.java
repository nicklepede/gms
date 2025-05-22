package com.google.android.gms.carsetup;

import android.app.KeyguardManager;
import android.app.Notification;
import android.app.NotificationChannel;
import android.app.UiModeManager;
import android.bluetooth.BluetoothAdapter;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.PackageManager;
import android.hardware.usb.UsbAccessory;
import android.net.Network;
import android.net.wifi.WifiInfo;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.ParcelFileDescriptor;
import android.os.Process;
import android.os.RemoteException;
import android.util.ArrayMap;
import android.util.SparseArray;
import com.google.android.chimera.Service;
import com.google.android.gms.R;
import com.google.android.gms.car.CarInfo;
import com.google.android.gms.carsetup.CarSetupServiceImpl;
import com.google.android.gms.carsetup.setup.SetupBinder;
import com.google.android.gms.carsetup.setup.UsbConnectionHelper$TrackedParcelFileDescriptor;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.libs.punchclock.tracing.TracingBroadcastReceiver;
import com.google.autofill.detection.ml.AndroidInputTypeSignal;
import defpackage.a;
import defpackage.amte;
import defpackage.amvc;
import defpackage.amve;
import defpackage.amvp;
import defpackage.amzp;
import defpackage.amzq;
import defpackage.amzr;
import defpackage.anaa;
import defpackage.anac;
import defpackage.anax;
import defpackage.anay;
import defpackage.anbj;
import defpackage.anbk;
import defpackage.ancy;
import defpackage.ando;
import defpackage.andt;
import defpackage.andw;
import defpackage.anef;
import defpackage.anfx;
import defpackage.anfy;
import defpackage.ange;
import defpackage.angz;
import defpackage.anhf;
import defpackage.anhl;
import defpackage.anhn;
import defpackage.anjk;
import defpackage.anjl;
import defpackage.anjn;
import defpackage.anmc;
import defpackage.anor;
import defpackage.anqj;
import defpackage.anql;
import defpackage.anqo;
import defpackage.anqy;
import defpackage.anrh;
import defpackage.anri;
import defpackage.anrj;
import defpackage.anrm;
import defpackage.anrn;
import defpackage.anse;
import defpackage.ansf;
import defpackage.ansl;
import defpackage.ansn;
import defpackage.anso;
import defpackage.ansq;
import defpackage.anss;
import defpackage.ansy;
import defpackage.ante;
import defpackage.antr;
import defpackage.antt;
import defpackage.antw;
import defpackage.antx;
import defpackage.anty;
import defpackage.anua;
import defpackage.anud;
import defpackage.anxu;
import defpackage.anys;
import defpackage.anzf;
import defpackage.anzi;
import defpackage.anzj;
import defpackage.anzm;
import defpackage.aoaj;
import defpackage.aobe;
import defpackage.aobi;
import defpackage.atzs;
import defpackage.auub;
import defpackage.caqj;
import defpackage.dhbu;
import defpackage.eflm;
import defpackage.ekut;
import defpackage.ekvl;
import defpackage.ekww;
import defpackage.ekxd;
import defpackage.elgj;
import defpackage.elgo;
import defpackage.elgt;
import defpackage.elhz;
import defpackage.elja;
import defpackage.elpg;
import defpackage.elsn;
import defpackage.eluq;
import defpackage.eoka;
import defpackage.eokb;
import defpackage.eoke;
import defpackage.eoky;
import defpackage.eokz;
import defpackage.eoln;
import defpackage.fgrc;
import defpackage.fojt;
import defpackage.fojx;
import defpackage.fokd;
import defpackage.foll;
import defpackage.folo;
import defpackage.fomx;
import defpackage.food;
import defpackage.inl;
import java.io.Closeable;
import java.io.FileDescriptor;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.net.Socket;
import java.security.SecureRandom;
import java.util.EnumSet;
import java.util.InvalidPropertiesFormatException;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes3.dex */
public class CarSetupServiceImpl extends Service implements ansf {
    public volatile anrh A;
    public HandlerThread B;
    Handler C;
    public Handler D;
    public anjk F;
    private anzi I;
    private anxu J;
    private anmc K;
    private long L;
    private anzf O;
    public anys d;
    public anhl e;
    public boolean g;
    public anqj h;
    public int i;
    public ansl j;
    public CarInfoInternal k;
    public ConnectionTransfer l;
    public ange m;
    public boolean n;
    public boolean o;
    public anse p;
    public boolean t;
    public Boolean w;
    public amte x;
    public volatile anef y;
    public antx z;
    public static final eluq a = ancy.a("CAR.SETUP.SERVICE");
    private static final Random H = new SecureRandom();
    static final AtomicBoolean b = anzi.b;
    public final anrn c = new anrn(this);
    public int f = -1;
    public final int q = -1;
    public final int r = -1;
    public int s = 0;
    private int M = 0;
    public final ekww u = ekxd.a(new ekww() { // from class: anqp
        @Override // defpackage.ekww
        public final Object lK() {
            eluq eluqVar = CarSetupServiceImpl.a;
            fojt fojtVar = fojt.a;
            boolean z = false;
            if (fojtVar.lK().h() && !fojtVar.lK().e()) {
                z = true;
            }
            return Boolean.valueOf(z);
        }
    });
    public final ekww v = ekxd.a(new ekww() { // from class: anqq
        @Override // defpackage.ekww
        public final Object lK() {
            eluq eluqVar = CarSetupServiceImpl.a;
            return false;
        }
    });
    public final anrj E = new anrj(this);
    private final anzj N = new anzm();
    public final anjn G = new anjn(null);

    /* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
    public class ConnectionTransfer extends anso {
        public ansq a;
        private final CarSetupServiceImpl b;

        public ConnectionTransfer(CarSetupServiceImpl carSetupServiceImpl) {
            this.b = carSetupServiceImpl;
        }

        @Override // defpackage.ansp
        public final int a() {
            eluq eluqVar = CarSetupServiceImpl.a;
            return this.b.h.a;
        }

        @Override // defpackage.ansp
        public final int c() {
            eluq eluqVar = CarSetupServiceImpl.a;
            return this.b.f;
        }

        @Override // defpackage.ansp
        public final int d() {
            eluq eluqVar = CarSetupServiceImpl.a;
            return this.b.i;
        }

        @Override // defpackage.ansp
        public final anjl e() {
            eluq eluqVar = CarSetupServiceImpl.a;
            return this.b.F;
        }

        @Override // defpackage.ansp
        public final CarInfoInternal f() {
            eluq eluqVar = CarSetupServiceImpl.a;
            return this.b.k;
        }

        @Override // defpackage.ansp
        public final boolean g() {
            eluq eluqVar = CarSetupServiceImpl.a;
            return this.b.j.j();
        }

        @Override // defpackage.ansp
        public final boolean h() {
            eluq eluqVar = CarSetupServiceImpl.a;
            return this.b.j.i;
        }

        @Override // defpackage.ansp
        public final boolean i() {
            eluq eluqVar = CarSetupServiceImpl.a;
            return this.b.g;
        }

        @Override // defpackage.ansp
        public final void j(ansq ansqVar) {
            eluq eluqVar = CarSetupServiceImpl.a;
            if (this.b.j == null) {
                try {
                    ansqVar.a();
                    return;
                } catch (RemoteException unused) {
                    return;
                }
            }
            CarSetupServiceImpl carSetupServiceImpl = this.b;
            if (carSetupServiceImpl.j.m) {
                this.a = ansqVar;
                this.b.j.f();
                return;
            }
            try {
                Bundle bundle = new Bundle();
                carSetupServiceImpl.e.j(bundle);
                ansqVar.b(bundle);
            } catch (RemoteException unused2) {
            }
            CarSetupServiceImpl carSetupServiceImpl2 = this.b;
            carSetupServiceImpl2.l = null;
            carSetupServiceImpl2.b();
        }
    }

    public static void n(Intent intent) {
        intent.putExtra("service_handshake", new BinderParcel(new ansy()));
    }

    private static eflm p(boolean z, boolean z2) {
        return (z || !z2) ? eflm.USER_SELECTION : eflm.NOT_CURRENTLY_SUPPORTED;
    }

    private final void q() {
        Notification.Builder color = new Notification.Builder(this).setContentTitle(getString(R.string.car_app_name)).setContentText(getString(R.string.car_notification_message)).setSmallIcon(amzp.a(this)).setColor(getResources().getColor(R.color.car_light_blue_500));
        String string = getString(R.string.car_app_name);
        if (fojx.c() && auub.a()) {
            Bundle bundle = new Bundle();
            bundle.putString("android.substName", string);
            color.addExtras(bundle);
        }
        if (auub.c()) {
            amzr b2 = amzr.b(this);
            if (b2.a("car.default_notification_channel") == null) {
                b2.c(new NotificationChannel("car.default_notification_channel", getString(R.string.car_app_name), 3));
            }
            color.setChannelId("car.default_notification_channel");
        }
        startForeground(1, color.build());
        a.h().ai(2658).x("started foreground service");
    }

    private final void r(Closeable closeable, Bundle bundle, Runnable runnable) {
        Runnable runnable2;
        Throwable th;
        long a2;
        try {
            Context applicationContext = getApplicationContext();
            int i = aobi.a;
            int i2 = elgo.d;
            elgj elgjVar = new elgj();
            elgt elgtVar = new elgt();
            Iterator it = fojt.a.lK().b().b.iterator();
            while (it.hasNext()) {
                try {
                    String[] split = ((String) it.next()).split(":", 2);
                    String str = split[0];
                    ComponentName unflattenFromString = ComponentName.unflattenFromString(str);
                    if (unflattenFromString == null) {
                        throw new InvalidPropertiesFormatException("Failed to unflatten component name: ".concat(String.valueOf(str)));
                    }
                    long j = 0;
                    if (split.length > 1 && !split[1].isEmpty()) {
                        j = Long.parseLong(split[1]);
                    }
                    elgtVar.i(unflattenFromString, Long.valueOf(j));
                } catch (NumberFormatException | InvalidPropertiesFormatException e) {
                    th = e;
                    runnable2 = runnable;
                    a.i().s(th).ai(2670).x("Aborting car connection handoff due to configuration error.");
                    runnable2.run();
                    return;
                }
            }
            elsn listIterator = elgtVar.b().entrySet().listIterator();
            while (listIterator.hasNext()) {
                Map.Entry entry = (Map.Entry) listIterator.next();
                ComponentName componentName = (ComponentName) entry.getKey();
                Long l = (Long) entry.getValue();
                long longValue = l.longValue();
                try {
                    a2 = inl.a(applicationContext.getPackageManager().getPackageInfo(componentName.getPackageName(), 0));
                } catch (PackageManager.NameNotFoundException unused) {
                }
                if ("com.google.android.projection.gearhead".equals(componentName.getPackageName())) {
                    if (anor.a.compare(Long.valueOf(a2), l) < 0) {
                        entry.getKey();
                        entry.getValue();
                    }
                } else if (a2 < longValue) {
                    entry.getKey();
                    entry.getValue();
                }
                elgjVar.i((ComponentName) entry.getKey());
            }
            elgo g = elgjVar.g();
            this.L = H.nextLong();
            this.A = new anrh(this.C, this, this, this.h, this.N);
            final aobe aobeVar = new aobe(getApplicationContext(), this.L, this.A, this.C, g, this.s);
            anrh anrhVar = this.A;
            long j2 = this.L;
            int i3 = this.f;
            int i4 = this.i;
            anrhVar.k = j2;
            anrhVar.m = i4;
            anrhVar.l = i3;
            anrhVar.h = closeable;
            anrhVar.i = bundle;
            anrhVar.j = runnable;
            anrhVar.n = aobeVar;
            if (aobeVar.d) {
                aobe.a.h().ai(2989).x("Starting handoff interest checks");
                aobeVar.e.post(new Runnable() { // from class: aoan
                    @Override // java.lang.Runnable
                    public final void run() {
                        aobe aobeVar2 = aobe.this;
                        aobd aobdVar = aobeVar2.i;
                        aobdVar.a();
                        aobdVar.b.addAll(aobeVar2.f);
                        aobeVar2.f();
                    }
                });
            } else {
                aobe.a.h().ai(2990).x("Skipping handoff interest checks - feature is not enabled");
                aobeVar.e.post(new Runnable() { // from class: aoam
                    @Override // java.lang.Runnable
                    public final void run() {
                        aobe aobeVar2 = aobe.this;
                        aobeVar2.j.c(null, aobeVar2.d);
                    }
                });
            }
        } catch (NumberFormatException | InvalidPropertiesFormatException e2) {
            runnable2 = runnable;
            th = e2;
        }
    }

    protected final void a() {
        stopForeground(true);
        a.h().ai(2644).z("stopped foreground service id %d", this.M);
        if (fojt.a.lK().i()) {
            stopSelf(this.M);
        } else {
            stopSelf();
        }
    }

    public final void b() {
        if (!l()) {
            anhl anhlVar = this.e;
            if (anhlVar == null) {
                a.j().ai(2646).x("Protocol manager is unexpectedly null, ignoring");
                andw.h(this, eoke.CAR_SETUP_SERVICE_NULL_PROTOCOL_MANAGER_DURING_FINISH_TRANSFER);
            } else {
                anhlVar.e.t.c();
                this.e = null;
            }
        }
        k();
    }

    public final void c(CarInfoInternal carInfoInternal, boolean z) {
        andw.i(this, andt.STARTED, 0);
        this.k = carInfoInternal;
        antx antxVar = new antx(this, this.x, new anqo(this, z));
        this.z = antxVar;
        anty antyVar = antxVar.e;
        int a2 = antyVar.a();
        if (a2 != 0) {
            antxVar.a(a2);
        } else {
            amte amteVar = antxVar.d;
            if (Integer.toString(Build.VERSION.SDK_INT).equals(amteVar.b())) {
                antxVar.a(antyVar.c() ? 1 : 0);
            } else {
                amteVar.b();
                antw antwVar = new antw(antxVar);
                antxVar.b.set(antwVar);
                antwVar.start();
            }
        }
        if (food.d()) {
            anua anuaVar = this.f == 2 ? anua.WIFI : anua.USB;
            if (food.c()) {
                anud anudVar = new anud(this);
                String str = this.k.f;
                anudVar.c();
                if (!BluetoothAdapter.checkBluetoothAddress(str) || anuaVar == null) {
                    return;
                }
                EnumSet a3 = anudVar.a(str);
                if (a3.contains(anuaVar)) {
                    return;
                }
                a3.add(anuaVar);
                anudVar.a.edit().putStringSet(anud.b(str), elhz.F(elja.j(a3, new ekut() { // from class: anuc
                    @Override // defpackage.ekut
                    public final Object apply(Object obj) {
                        return ((anua) obj).name();
                    }
                }))).apply();
            }
        }
    }

    @Override // defpackage.ansf
    public final void d(eoky eokyVar, eokz eokzVar, String str) {
        this.J.a(eokyVar, eokzVar, str);
    }

    @Override // com.google.android.chimera.Service
    public final void dump(FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        printWriter.println("Connection type: " + this.f);
        printWriter.println("Connected state: " + this.c.a());
        anqj anqjVar = this.h;
        if (anqjVar != null) {
            printWriter.println("Analytics session id: " + anqjVar.a);
        }
        anys anysVar = this.d;
        int i = 0;
        if (anysVar != null) {
            dhbu dhbuVar = anysVar.a;
            printWriter.println(a.aa(dhbuVar != null ? dhbuVar.l() : false, "Wake lock held: "));
        } else {
            printWriter.println("Wake lock is null");
        }
        printWriter.println("startActivities: " + this.g);
        printWriter.println("connectionTag: " + this.i);
        printWriter.println("suppressRestart: " + this.n);
        printWriter.println("readerThreadStuck: " + this.o);
        printWriter.println("carServiceSessionId: " + this.L);
        ansl anslVar = this.j;
        if (anslVar != null) {
            printWriter.println("FrxState");
            printWriter.println("setupOngoing: " + anslVar.m);
            printWriter.println("carConnectionAlreadyAllowed: " + anslVar.n);
            printWriter.println("shouldShowTutorial: " + anslVar.i);
            printWriter.println("transferStarted: " + anslVar.o);
            printWriter.println("carServiceStarted: " + anslVar.p);
        }
        CarInfoInternal carInfoInternal = this.k;
        if (carInfoInternal != null) {
            printWriter.println("car info: ".concat(carInfoInternal.toString()));
        }
        if (this.y != null) {
            anef anefVar = this.y;
            printWriter.print("CarGalMonitor{messageListeners=[");
            synchronized (anefVar.a) {
                int i2 = 0;
                while (true) {
                    SparseArray sparseArray = anefVar.b;
                    if (i2 >= sparseArray.size()) {
                        break;
                    }
                    ArrayMap arrayMap = (ArrayMap) sparseArray.valueAt(i2);
                    if (arrayMap != null && !arrayMap.isEmpty()) {
                        printWriter.print(sparseArray.keyAt(i2) + ",");
                    }
                    i2++;
                }
                printWriter.print("], frameListeners=[");
                while (true) {
                    SparseArray sparseArray2 = anefVar.c;
                    if (i >= sparseArray2.size()) {
                        break;
                    }
                    ArrayMap arrayMap2 = (ArrayMap) sparseArray2.valueAt(i);
                    if (arrayMap2 != null && !arrayMap2.isEmpty()) {
                        printWriter.print(sparseArray2.keyAt(i) + ",");
                    }
                    i++;
                }
            }
            printWriter.println("]}");
        }
        amzq.a(this, printWriter);
        this.K.b(printWriter);
    }

    public final void e(ando andoVar) {
        andw.e(this, "com.google.android.gms.car.CAR_SETUP_SERVICE", andoVar);
    }

    public final void f(final Closeable closeable, final ParcelFileDescriptor parcelFileDescriptor, final boolean z) {
        if (parcelFileDescriptor == null) {
            a.i().ai(2668).x("Null connection file descriptor. Not starting car connection.");
            k();
        } else {
            Runnable runnable = new Runnable() { // from class: anqr
                @Override // java.lang.Runnable
                public final void run() {
                    CarSetupServiceImpl carSetupServiceImpl = CarSetupServiceImpl.this;
                    if (carSetupServiceImpl.m()) {
                        return;
                    }
                    boolean z2 = z;
                    ParcelFileDescriptor parcelFileDescriptor2 = parcelFileDescriptor;
                    Closeable closeable2 = closeable;
                    ekvl.r(((Boolean) carSetupServiceImpl.u.lK()).booleanValue(), "Unable to handoff car connection and not configured to fall back to GMS Core.");
                    carSetupServiceImpl.h(closeable2, parcelFileDescriptor2, parcelFileDescriptor2, z2);
                }
            };
            Bundle bundle = new Bundle();
            bundle.putParcelable("car_setup.EXTRA_CAR_CONNECTION_FILE_DESCRIPTOR", parcelFileDescriptor);
            r(closeable, bundle, runnable);
        }
    }

    public final void g() {
        a.h().ai(2669).x("Start FRX setup");
        if (fokd.f()) {
            andw.e(this, "com.google.android.gms.car.FRX", andt.STARTED);
        }
        ansl anslVar = this.j;
        ansl.a.h().ai(2750).x("Starting setup");
        if (fomx.a.lK().a()) {
            ((UiModeManager) anslVar.b.getSystemService("uimode")).disableCarMode(0);
        }
        Context context = anslVar.b;
        ((KeyguardManager) context.getSystemService("keyguard")).isKeyguardLocked();
        anslVar.m = true;
        ((anjn) anslVar.e).a.add(anslVar);
        Intent intent = new Intent();
        intent.setComponent(anaa.d);
        intent.addFlags(268435456);
        intent.addFlags(32768);
        intent.addFlags(AndroidInputTypeSignal.TYPE_TEXT_FLAG_AUTO_COMPLETE);
        intent.putExtra("frx_state", new BinderParcel(new anss(new ObjectWrapper(anslVar))));
        context.startActivity(intent);
    }

    public final void h(Closeable closeable, ParcelFileDescriptor parcelFileDescriptor, ParcelFileDescriptor parcelFileDescriptor2, boolean z) {
        int i;
        ekvl.q(this.f != -1);
        this.g = z;
        anqy anqyVar = new anqy(this);
        this.m = anqyVar;
        FileInputStream fileInputStream = new FileInputStream(parcelFileDescriptor.getFileDescriptor());
        FileOutputStream fileOutputStream = new FileOutputStream(parcelFileDescriptor2.getFileDescriptor());
        anri anriVar = new anri(closeable, b, this.f);
        eluq eluqVar = anhl.a;
        anhf anhfVar = new anhf();
        anhfVar.c = this;
        anhfVar.k = new angz(false);
        anhfVar.l = "GmsCore_OpenSSL";
        ekvl.a(true);
        anhfVar.m = R.raw.car_android_32;
        ekvl.a(true);
        anhfVar.i = R.raw.car_android_64;
        ekvl.a(true);
        anhfVar.h = R.raw.car_android_128;
        ekvl.a(true);
        anhfVar.n = R.string.car_hu_label;
        int i2 = this.f;
        if (i2 == 1) {
            anfx a2 = anfy.a();
            a2.e(folo.a.lK().f());
            a2.f(folo.f());
            a2.g(true);
            a2.c(1);
            anhfVar.o = a2.a();
        } else if (i2 == 2) {
            anfx a3 = anfy.a();
            a3.e(folo.a.lK().g());
            a3.f(folo.f());
            a3.g(true);
            if (folo.b() > 0) {
                a3.d((int) folo.b());
                a3.c(2);
            }
            if (folo.c() > 0) {
                a3.b((int) folo.c());
            }
            anhfVar.o = a3.a();
        }
        anhfVar.e = anqyVar;
        anhfVar.b = anriVar;
        anhfVar.g = fileInputStream;
        anhfVar.j = fileOutputStream;
        amte amteVar = this.x;
        anbj a4 = anbk.a();
        a4.d(!folo.e() ? false : amteVar.c.getBoolean("car_gal_snoop_log_video_ack", false));
        a4.c(!folo.e() ? false : amteVar.c.getBoolean("car_gal_snoop_log_media_ack", false));
        a4.b(!folo.e() ? false : amteVar.c.getBoolean("car_gal_snoop_log_guidance_ack", false));
        anbk a5 = a4.a();
        anax a6 = anay.a();
        a6.c(folo.e() ? amteVar.c.getBoolean("car_enable_gal_snoop", false) : false);
        if (folo.e()) {
            try {
                i = Integer.parseInt(amteVar.c.getString("car_gal_snoop_buffer_size", "100"));
            } catch (NumberFormatException unused) {
                i = 100;
            }
            r2 = i >= 100 ? i : 100;
            if (r2 > 1000) {
                r2 = 1000;
            }
        }
        a6.b(r2);
        a6.a = a5;
        anhfVar.f = a6.a();
        this.e = new anhl(anhfVar);
        if (this.y != null) {
            this.e.h(this.y);
        }
        if (this.w == null) {
            this.c.b(2);
            e(ando.SET_STATE_WAITING_FOR_PATCHER);
        } else {
            this.c.b(3);
            e(ando.SET_STATE_DISCOVERED);
            this.e.i();
        }
    }

    public final void i(boolean z, boolean z2) {
        if (!l()) {
            this.l = new ConnectionTransfer(this);
            Intent intent = new Intent("com.google.android.gms.car.TRANSFER");
            intent.setComponent((ComponentName) anaa.a.lK());
            intent.putExtra("connection", new BinderParcel(this.l));
            n(intent);
            andw.e(this, "com.google.android.gms.car.CONNECTION_TRANSFER", andt.STARTED);
            startService(intent);
            return;
        }
        this.A.q = z;
        this.A.r = z2;
        anrh anrhVar = this.A;
        a.h().ai(2637).x("Starting transfer for handoff.");
        anrhVar.p = true;
        anrhVar.n.a(anrhVar.k, anrhVar.a(!anrhVar.o));
        Context context = anrhVar.e;
        anri anriVar = new anri(new Closeable() { // from class: anrf
            @Override // java.io.Closeable, java.lang.AutoCloseable
            public final void close() {
            }
        }, b, anrhVar.l);
        if (!anrhVar.s) {
            throw new IllegalStateException("No component accepted the handoff.");
        }
        Intent putExtra = new Intent("com.google.android.gms.car.HANDOFF").setComponent((ComponentName) anaa.a.lK()).putExtra("car_handoff_session_id", anrhVar.k).putExtra("car_handoff_component", anrhVar.v.flattenToString()).putExtra("car_handoff_start_activities", true).putExtra("car_handoff_user_authorized_projection", !anrhVar.o).putExtra("car_handoff_connection_type", anrhVar.l).putExtra("connection_tag", anrhVar.m);
        anzj anzjVar = anrhVar.g;
        n(putExtra);
        if (anrhVar.i != null && Build.VERSION.SDK_INT >= 30) {
            putExtra.putExtra("car_handoff_starting_bluetooth_device", anrhVar.i.getParcelable("WIFI_STARTING_BLUETOOTH_DEVICE"));
        }
        putExtra.putExtra("car_handoff_analytics_session_id", (int) anrhVar.k);
        if (anrhVar.f()) {
            putExtra.putExtra("car_handoff_is_car_audio_service_migration_enabled", true);
        }
        putExtra.putExtra("connection_tear_down_helper", new BinderParcel(new ante(anriVar)));
        CarInfoInternal carInfoInternal = anrhVar.d.k;
        if (carInfoInternal != null) {
            atzs.l(carInfoInternal, putExtra, "car_handoff_car_info");
        }
        putExtra.putExtra("car_handoff_is_first_connection", anrhVar.q);
        context.startService(putExtra);
        if (anrhVar.o) {
            return;
        }
        anrhVar.c.postDelayed(anrhVar.b, 5000L);
    }

    @Override // defpackage.ansf
    public final void j(final Socket socket) {
        amvp.e(new Runnable() { // from class: anqm
            @Override // java.lang.Runnable
            public final void run() {
                Socket socket2 = socket;
                ParcelFileDescriptor fromSocket = ParcelFileDescriptor.fromSocket(socket2);
                CarSetupServiceImpl.this.h(new anqz(socket2, fromSocket, fromSocket), fromSocket, fromSocket, true);
            }
        });
    }

    public final void k() {
        a.h().ai(2674).x("tearDown");
        FirstActivityImpl.k = false;
        this.t = false;
        anjn anjnVar = this.G;
        synchronized (anjnVar.b) {
            if (anjnVar.e) {
                anjl anjlVar = anjnVar.f;
                if (anjlVar != null) {
                    try {
                        anjlVar.b(anjnVar);
                    } catch (RemoteException unused) {
                    }
                }
                anjnVar.e = false;
            }
        }
        this.K.d(this);
        if (this.c.a() == 0) {
            e(ando.STATE_ALREADY_NOT_CONNECTED_IN_TEARDOWN);
            return;
        }
        if (this.A != null) {
            anrh anrhVar = this.A;
            a.h().ai(2639).x("Tearing down car connection");
            if (!anrhVar.p) {
                aoaj aoajVar = anrhVar.n;
                aobe.a.h().ai(2991).x("Tearing down car connection");
                final aobe aobeVar = (aobe) aoajVar;
                aobeVar.d().execute(new Runnable() { // from class: aoat
                    @Override // java.lang.Runnable
                    public final void run() {
                        aobe aobeVar2 = aobe.this;
                        aobd aobdVar = aobeVar2.i;
                        if (aobdVar.a) {
                            anjp anjpVar = aobdVar.g;
                            if (anjpVar != null) {
                                try {
                                    anjpVar.b(aobeVar2.c);
                                } catch (RemoteException e) {
                                    aobe.a.h().s(e).ai(2981).B("Couldn't stop %s, but it could be fine.", aobeVar2.i.e);
                                }
                            }
                            aobeVar2.b.unbindService(aobeVar2.h);
                            aobeVar2.i.a = false;
                        }
                    }
                });
            }
        }
        anhl anhlVar = this.e;
        if (anhlVar != null) {
            anhlVar.f();
            this.e.e();
        }
        anys anysVar = this.d;
        if (anysVar != null) {
            anysVar.a();
        }
        anzi anziVar = this.I;
        synchronized (anziVar.d) {
            TracingBroadcastReceiver tracingBroadcastReceiver = anziVar.e;
            if (tracingBroadcastReceiver != null) {
                try {
                    unregisterReceiver(tracingBroadcastReceiver);
                } catch (IllegalArgumentException e) {
                    anzi.a.j().s(e).ai(2933).x("Unable to unregister USB disconnect receiver.");
                }
                anziVar.e = null;
            }
        }
        ansl anslVar = this.j;
        if (anslVar != null) {
            antr antrVar = anslVar.h;
            if (antrVar != null) {
                antrVar.a();
            }
            anslVar.c(null, true);
            this.j = null;
        }
        antx antxVar = this.z;
        if (antxVar != null) {
            antw antwVar = (antw) antxVar.b.getAndSet(null);
            if (antwVar != null && antwVar.isAlive()) {
                antwVar.interrupt();
                try {
                    antwVar.join(1000L);
                } catch (InterruptedException unused2) {
                }
            }
            this.z = null;
        }
        this.C.removeCallbacksAndMessages(null);
        final anse anseVar = this.p;
        if (anseVar.h) {
            anseVar.h = false;
            anseVar.b.unregisterReceiver(anseVar.l);
            anseVar.d();
            anseVar.f.execute(new Runnable() { // from class: anrw
                @Override // java.lang.Runnable
                public final void run() {
                    anse anseVar2 = anse.this;
                    ScheduledFuture scheduledFuture = anseVar2.g;
                    if (scheduledFuture != null) {
                        scheduledFuture.cancel(true);
                    }
                    anseVar2.e.removeCallbacksAndMessages(null);
                    anseVar2.f.shutdownNow();
                }
            });
        }
        anqj anqjVar = this.h;
        if (anqjVar != null) {
            anqjVar.a();
        }
        a();
        this.c.b(0);
        e(ando.SET_STATE_NOT_CONNECTED);
        if (this.f == 1 && this.o) {
            a.h().ai(2675).x("Reader thread stuck after cable removal. Will kill process.");
            Process.killProcess(Process.myPid());
        }
    }

    public final boolean l() {
        return this.A != null && this.A.s;
    }

    public final boolean m() {
        if (Build.VERSION.SDK_INT < 30 || ((Boolean) this.u.lK()).booleanValue()) {
            return false;
        }
        a.i().ai(2667).x("Unable to handoff car connection (no components interested), tearing down");
        k();
        return true;
    }

    public final void o(boolean z, int i) {
        ansq ansqVar;
        andw.i(this, andt.FAILED, i);
        if (l()) {
            CarInfo carInfo = this.k.a;
            int i2 = carInfo.e;
            boolean z2 = true;
            if (i2 <= 1 && (i2 != 1 || carInfo.f <= 3)) {
                z2 = false;
            }
            this.A.d(p(z, z2));
        } else {
            ConnectionTransfer connectionTransfer = this.l;
            if (connectionTransfer != null && (ansqVar = connectionTransfer.a) != null) {
                try {
                    ansqVar.a();
                } catch (RemoteException unused) {
                }
            }
            anhl anhlVar = this.e;
            if (anhlVar != null) {
                this.e.g(p(z, anhlVar.k()));
            }
        }
        this.l = null;
        this.j = null;
        k();
    }

    @Override // com.google.android.chimera.Service
    public final IBinder onBind(Intent intent) {
        if ("com.google.android.gms.carsetup.ACTION_BIND_CAR_SETUP_SERVICE".equals(intent.getAction())) {
            return new ansn(this);
        }
        return null;
    }

    @Override // com.google.android.chimera.Service
    public final void onCreate() {
        anzf anzfVar;
        a.h().ai(2659).x("onCreate");
        super.onCreate();
        e(ando.CREATE);
        if (Build.VERSION.SDK_INT >= 30 && fojt.a.lK().d()) {
            q();
        }
        if (Build.VERSION.SDK_INT >= 30) {
            if (UsbConnectionHelper$TrackedParcelFileDescriptor.h == null) {
                UsbConnectionHelper$TrackedParcelFileDescriptor.h = getApplicationContext();
            }
            synchronized (UsbConnectionHelper$TrackedParcelFileDescriptor.d) {
                if (UsbConnectionHelper$TrackedParcelFileDescriptor.f == null) {
                    UsbConnectionHelper$TrackedParcelFileDescriptor.f = new HandlerThread("DisconnectMonitor");
                    UsbConnectionHelper$TrackedParcelFileDescriptor.f.start();
                    UsbConnectionHelper$TrackedParcelFileDescriptor.g = new caqj(UsbConnectionHelper$TrackedParcelFileDescriptor.f.getLooper());
                }
                final Context applicationContext = getApplicationContext();
                if (UsbConnectionHelper$TrackedParcelFileDescriptor.b.getAndIncrement() == 0) {
                    UsbConnectionHelper$TrackedParcelFileDescriptor.e = new UsbConnectionHelper$TrackedParcelFileDescriptor.DisconnectWatcher(this);
                    final UsbConnectionHelper$TrackedParcelFileDescriptor.DisconnectWatcher disconnectWatcher = UsbConnectionHelper$TrackedParcelFileDescriptor.e;
                    ekvl.z(disconnectWatcher, "Disconnect watcher should not be null");
                    ekvl.z(UsbConnectionHelper$TrackedParcelFileDescriptor.g, "Background handler should not be null");
                    UsbConnectionHelper$TrackedParcelFileDescriptor.g.post(new Runnable() { // from class: anze
                        @Override // java.lang.Runnable
                        public final void run() {
                            List list = UsbConnectionHelper$TrackedParcelFileDescriptor.a;
                            ind.c(applicationContext, disconnectWatcher, new IntentFilter("android.hardware.usb.action.USB_STATE"), null, UsbConnectionHelper$TrackedParcelFileDescriptor.g, 2);
                        }
                    });
                }
                anzfVar = new anzf(new AtomicBoolean(false), applicationContext);
            }
            this.O = anzfVar;
        }
        HandlerThread handlerThread = new HandlerThread("CarSetupServiceImpl", 9);
        this.B = handlerThread;
        handlerThread.start();
        this.D = new caqj(Looper.getMainLooper());
        this.C = new caqj(this.B.getLooper());
        this.x = amte.a(this);
        Boolean b2 = anhn.a().b();
        if (b2 == null) {
            ExecutorService b3 = anac.b(1);
            b3.execute(new anrm(this));
            b3.shutdown();
        } else {
            this.w = b2;
        }
        anqj anqjVar = new anqj(this);
        this.h = anqjVar;
        ekvl.y(anqjVar);
        this.p = new anse(getApplicationContext(), new antt(this.h));
        this.K = anmc.a(this);
        this.J = new anxu(this);
        this.I = new anzi(this.J);
        this.K.c(this, 100);
    }

    @Override // com.google.android.chimera.Service
    public final void onDestroy() {
        a.h().ai(2660).x("onDestroy");
        super.onDestroy();
        k();
        e(ando.DESTROY);
        fojt fojtVar = fojt.a;
        if (fojtVar.lK().f()) {
            this.C.postDelayed(new Runnable() { // from class: anqn
                @Override // java.lang.Runnable
                public final void run() {
                    CarSetupServiceImpl.a.h().ai(2657).x("quit handler thread");
                    CarSetupServiceImpl carSetupServiceImpl = CarSetupServiceImpl.this;
                    carSetupServiceImpl.B.quitSafely();
                    carSetupServiceImpl.B = null;
                }
            }, fojtVar.lK().a());
        } else {
            this.B.quitSafely();
            this.B = null;
        }
        anzf anzfVar = this.O;
        if (anzfVar != null) {
            final Context context = anzfVar.b;
            AtomicBoolean atomicBoolean = anzfVar.a;
            synchronized (UsbConnectionHelper$TrackedParcelFileDescriptor.d) {
                if (atomicBoolean.compareAndSet(false, true) && UsbConnectionHelper$TrackedParcelFileDescriptor.b.decrementAndGet() == 0) {
                    final UsbConnectionHelper$TrackedParcelFileDescriptor.DisconnectWatcher disconnectWatcher = UsbConnectionHelper$TrackedParcelFileDescriptor.e;
                    ekvl.z(disconnectWatcher, "Disconnect watcher should not be null");
                    UsbConnectionHelper$TrackedParcelFileDescriptor.e = null;
                    UsbConnectionHelper$TrackedParcelFileDescriptor.c.incrementAndGet();
                    ekvl.z(UsbConnectionHelper$TrackedParcelFileDescriptor.g, "Background handler should not be null");
                    UsbConnectionHelper$TrackedParcelFileDescriptor.g.postDelayed(new Runnable() { // from class: anzg
                        @Override // java.lang.Runnable
                        public final void run() {
                            Context context2 = context;
                            UsbConnectionHelper$TrackedParcelFileDescriptor.DisconnectWatcher disconnectWatcher2 = disconnectWatcher;
                            synchronized (UsbConnectionHelper$TrackedParcelFileDescriptor.d) {
                                context2.unregisterReceiver(disconnectWatcher2);
                                if (UsbConnectionHelper$TrackedParcelFileDescriptor.e == null && UsbConnectionHelper$TrackedParcelFileDescriptor.c.decrementAndGet() == 0) {
                                    HandlerThread handlerThread = UsbConnectionHelper$TrackedParcelFileDescriptor.f;
                                    if (handlerThread != null) {
                                        handlerThread.quitSafely();
                                    }
                                    UsbConnectionHelper$TrackedParcelFileDescriptor.f = null;
                                    UsbConnectionHelper$TrackedParcelFileDescriptor.g = null;
                                }
                            }
                        }
                    }, 10000L);
                }
            }
        }
    }

    @Override // com.google.android.chimera.Service
    public final int onStartCommand(Intent intent, int i, int i2) {
        CarSetupServiceImpl carSetupServiceImpl;
        amve amvcVar;
        anys c;
        this.M = i2;
        boolean z = intent != null && intent.getBooleanExtra("start_foreground_immediately", false);
        if (z) {
            q();
        }
        eluq eluqVar = a;
        eluqVar.h().ai(2661).G("onStartCommand (id=%d): %s", i2, intent);
        if (intent == null) {
            eluqVar.h().ai(2666).x("Restarting with null intent");
            a();
            return 2;
        }
        SetupBinder setupBinder = (SetupBinder) intent.getParcelableExtra("EXTRA_LOCAL_BINDER");
        this.t = intent.getBooleanExtra("PreSetup.PRE_SETUP_WELCOME_SCREEN_SHOWN", false);
        if (!Boolean.FALSE.equals(this.w)) {
            anrn anrnVar = this.c;
            ParcelFileDescriptor parcelFileDescriptor = null;
            if (anrnVar.c()) {
                eluqVar.h().ai(2664).x("Already connected; ignoring connection request");
                e(ando.ALREADY_STARTED);
                if (setupBinder == null) {
                    setupBinder = null;
                } else if (setupBinder.b() && (c = setupBinder.c()) != null) {
                    c.a();
                }
            } else {
                if (setupBinder == null) {
                    setupBinder = null;
                } else {
                    if (!setupBinder.b()) {
                        eluqVar.h().ai(2663).x("Restarted with invalid binder");
                        a();
                        return 2;
                    }
                    this.d = setupBinder.c();
                    intent = setupBinder.a;
                    ekvl.y(intent);
                }
                anrnVar.b(1);
                e(ando.SET_STATE_CONNECTING);
                this.i = 0;
                intent.setExtrasClassLoader(getClassLoader());
                this.n = intent.getBooleanExtra("suppress_restart", false);
                eokb eokbVar = eokb.a;
                eoka eokaVar = (eoka) eokbVar.v();
                if (!eokaVar.b.L()) {
                    eokaVar.U();
                }
                eokb eokbVar2 = (eokb) eokaVar.b;
                eokbVar2.c |= 33554432;
                eokbVar2.C = 1;
                this.h.e((eokb) eokaVar.Q(), 63);
                if ("android.hardware.usb.action.USB_ACCESSORY_ATTACHED".equals(intent.getAction()) || "com.google.android.gms.car.usb.USB_ACCESSORY_FORCE_START".equals(intent.getAction())) {
                    UsbAccessory usbAccessory = (UsbAccessory) intent.getParcelableExtra("accessory");
                    if (usbAccessory != null) {
                        this.f = 1;
                        carSetupServiceImpl = this;
                        this.I.a(carSetupServiceImpl, usbAccessory, true, intent.getBooleanExtra("show_permission_errors", true), new anql(this));
                        if (!z && carSetupServiceImpl.c.a() != 0) {
                            q();
                        }
                    }
                } else if ("com.google.android.gms.car.WIFI_ACTION_BRIDGE".equals(intent.getAction())) {
                    if (intent.getStringExtra("PARAM_HOST_ADDRESS") == null || intent.getIntExtra("PARAM_SERVICE_PORT", -1) == -1) {
                        eluqVar.i().ai(2655).x("Failure to start wifi with invalid IP / Port");
                        k();
                    } else {
                        anqj anqjVar = this.h;
                        eoka eokaVar2 = (eoka) eokbVar.v();
                        fgrc v = eoln.a.v();
                        if (!v.b.L()) {
                            v.U();
                        }
                        eoln eolnVar = (eoln) v.b;
                        eolnVar.b |= 1;
                        eolnVar.c = 2;
                        if (!eokaVar2.b.L()) {
                            eokaVar2.U();
                        }
                        eokb eokbVar3 = (eokb) eokaVar2.b;
                        eoln eolnVar2 = (eoln) v.Q();
                        eolnVar2.getClass();
                        eokbVar3.u = eolnVar2;
                        eokbVar3.c |= 16;
                        int i3 = elgo.d;
                        anqjVar.f(eokaVar2, 46, elpg.a);
                        WifiInfo wifiInfo = (WifiInfo) intent.getParcelableExtra("wifi_info");
                        this.f = 2;
                        this.s = wifiInfo != null ? Math.max(wifiInfo.getFrequency(), 0) : 0;
                        final Bundle extras = intent.getExtras();
                        eluqVar.h().ai(2671).B("Start handoff wifi setup %s", extras);
                        r(new Closeable() { // from class: anqt
                            @Override // java.io.Closeable, java.lang.AutoCloseable
                            public final void close() {
                                eluq eluqVar2 = CarSetupServiceImpl.a;
                            }
                        }, extras, new Runnable() { // from class: anqs
                            @Override // java.lang.Runnable
                            public final void run() {
                                final CarSetupServiceImpl carSetupServiceImpl2 = CarSetupServiceImpl.this;
                                if (carSetupServiceImpl2.m()) {
                                    return;
                                }
                                final Bundle bundle = extras;
                                ekvl.r(((Boolean) carSetupServiceImpl2.u.lK()).booleanValue(), "Unable to handoff car connection and not configured to fall back to GMS Core.");
                                carSetupServiceImpl2.D.post(new Runnable() { // from class: anqk
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        Bundle bundle2 = bundle;
                                        String string = bundle2.getString("PARAM_HOST_ADDRESS");
                                        int i4 = bundle2.getInt("PARAM_SERVICE_PORT", -1);
                                        WifiInfo wifiInfo2 = (WifiInfo) bundle2.getParcelable("wifi_info");
                                        Network network = (Network) bundle2.getParcelable("PARAM_SERVICE_WIFI_NETWORK");
                                        boolean z2 = bundle2.getBoolean("WIFI_Q_ENABLED");
                                        CarSetupServiceImpl.a.h().ai(2673).U("Start wifi setup %s:%s isUsingQNetworkStack=%b wifiInfo=(%s)", string, Integer.valueOf(i4), Boolean.valueOf(z2), wifiInfo2);
                                        CarSetupServiceImpl carSetupServiceImpl3 = CarSetupServiceImpl.this;
                                        anse anseVar = carSetupServiceImpl3.p;
                                        if (anseVar.h) {
                                            anse.a.i().ai(2708).x("Already initialized");
                                        } else {
                                            anseVar.d = carSetupServiceImpl3;
                                            anseVar.f = new aupv(1, anac.a(1));
                                            IntentFilter intentFilter = new IntentFilter();
                                            intentFilter.addAction("android.net.wifi.STATE_CHANGE");
                                            ind.b(anseVar.b, anseVar.l, intentFilter, 2);
                                            anseVar.j = 0;
                                            anseVar.h = true;
                                        }
                                        carSetupServiceImpl3.p.b(string, i4, wifiInfo2, network, z2);
                                    }
                                });
                            }
                        });
                    }
                } else if ("com.google.android.gms.carsetup.START_DUPLEX".equals(intent.getAction())) {
                    this.f = intent.getIntExtra("connection_type", 0);
                    BinderParcel binderParcel = (BinderParcel) intent.getParcelableExtra("connection_fd");
                    if (binderParcel != null) {
                        IBinder iBinder = binderParcel.a;
                        if (iBinder == null) {
                            amvcVar = null;
                        } else {
                            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.car.IFdBinder");
                            amvcVar = queryLocalInterface instanceof amve ? (amve) queryLocalInterface : new amvc(iBinder);
                        }
                        try {
                            parcelFileDescriptor = amvcVar.a();
                        } catch (RemoteException unused) {
                        }
                    }
                    if (parcelFileDescriptor == null) {
                        a.i().ai(2654).x("Failure starting");
                    } else {
                        this.i = intent.getIntExtra("connection_tag", -1);
                        f(parcelFileDescriptor, parcelFileDescriptor, intent.getBooleanExtra("start_activities", true));
                    }
                } else {
                    eluqVar.i().ai(2653).B("Unknown intent %s", intent);
                    k();
                }
                carSetupServiceImpl = this;
                if (!z) {
                    q();
                }
            }
            if (setupBinder != null && (!foll.a.lK().c() || setupBinder.b())) {
                setupBinder.a();
            }
            return 1;
        }
        eluqVar.h().ai(2665).x("Failed security update, aborting");
        a();
        if (setupBinder != null) {
            setupBinder.a();
        }
        return 1;
    }
}
