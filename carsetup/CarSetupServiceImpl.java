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
import defpackage.akrt;
import defpackage.aktr;
import defpackage.aktt;
import defpackage.akue;
import defpackage.akye;
import defpackage.akyf;
import defpackage.akyg;
import defpackage.akyp;
import defpackage.akyr;
import defpackage.akzm;
import defpackage.akzn;
import defpackage.akzy;
import defpackage.akzz;
import defpackage.albn;
import defpackage.alcd;
import defpackage.alci;
import defpackage.alcl;
import defpackage.alcu;
import defpackage.alem;
import defpackage.alen;
import defpackage.alet;
import defpackage.alfo;
import defpackage.alfu;
import defpackage.alga;
import defpackage.algc;
import defpackage.alhz;
import defpackage.alia;
import defpackage.alic;
import defpackage.alkr;
import defpackage.alng;
import defpackage.aloy;
import defpackage.alpa;
import defpackage.alpd;
import defpackage.alpn;
import defpackage.alpw;
import defpackage.alpx;
import defpackage.alpy;
import defpackage.alqb;
import defpackage.alqc;
import defpackage.alqt;
import defpackage.alqu;
import defpackage.alra;
import defpackage.alrc;
import defpackage.alrd;
import defpackage.alrf;
import defpackage.alrh;
import defpackage.alrn;
import defpackage.alrt;
import defpackage.alsg;
import defpackage.alsi;
import defpackage.alsl;
import defpackage.alsm;
import defpackage.alsn;
import defpackage.alsp;
import defpackage.alss;
import defpackage.alwj;
import defpackage.alxh;
import defpackage.alxu;
import defpackage.alxx;
import defpackage.alxy;
import defpackage.alyb;
import defpackage.alyy;
import defpackage.alzt;
import defpackage.alzx;
import defpackage.arxd;
import defpackage.asqh;
import defpackage.byhr;
import defpackage.deqr;
import defpackage.ecyr;
import defpackage.eiho;
import defpackage.eiig;
import defpackage.eijr;
import defpackage.eijy;
import defpackage.eite;
import defpackage.eitj;
import defpackage.eito;
import defpackage.eiuu;
import defpackage.eivv;
import defpackage.ejcb;
import defpackage.ejfg;
import defpackage.ejhh;
import defpackage.elwm;
import defpackage.elwn;
import defpackage.elwq;
import defpackage.elxk;
import defpackage.elxl;
import defpackage.elxz;
import defpackage.fecj;
import defpackage.flsh;
import defpackage.flsl;
import defpackage.flsr;
import defpackage.fluc;
import defpackage.fluf;
import defpackage.flvo;
import defpackage.flwu;
import defpackage.ilv;
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

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes3.dex */
public class CarSetupServiceImpl extends Service implements alqu {
    public volatile alpw A;
    public HandlerThread B;
    Handler C;
    public Handler D;
    public alhz F;
    private alxx I;
    private alwj J;
    private alkr K;
    private long L;
    private alxu O;
    public alxh d;
    public alga e;
    public boolean g;
    public aloy h;
    public int i;
    public alra j;
    public CarInfoInternal k;
    public ConnectionTransfer l;
    public alet m;
    public boolean n;
    public boolean o;
    public alqt p;
    public boolean t;
    public Boolean w;
    public akrt x;
    public volatile alcu y;
    public alsm z;
    public static final ejhh a = albn.a("CAR.SETUP.SERVICE");
    private static final Random H = new SecureRandom();
    static final AtomicBoolean b = alxx.b;
    public final alqc c = new alqc(this);
    public int f = -1;
    public final int q = -1;
    public final int r = -1;
    public int s = 0;
    private int M = 0;
    public final eijr u = eijy.a(new eijr() { // from class: alpe
        @Override // defpackage.eijr
        public final Object a() {
            ejhh ejhhVar = CarSetupServiceImpl.a;
            boolean z = false;
            if (flsh.a.a().h() && !flsh.a.a().e()) {
                z = true;
            }
            return Boolean.valueOf(z);
        }
    });
    public final eijr v = eijy.a(new eijr() { // from class: alpf
        @Override // defpackage.eijr
        public final Object a() {
            ejhh ejhhVar = CarSetupServiceImpl.a;
            return false;
        }
    });
    public final alpy E = new alpy(this);
    private final alxy N = new alyb();
    public final alic G = new alic(null);

    /* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
    public class ConnectionTransfer extends alrd {
        public alrf a;
        private final CarSetupServiceImpl b;

        public ConnectionTransfer(CarSetupServiceImpl carSetupServiceImpl) {
            this.b = carSetupServiceImpl;
        }

        @Override // defpackage.alre
        public final int a() {
            ejhh ejhhVar = CarSetupServiceImpl.a;
            return this.b.h.a;
        }

        @Override // defpackage.alre
        public final int c() {
            ejhh ejhhVar = CarSetupServiceImpl.a;
            return this.b.f;
        }

        @Override // defpackage.alre
        public final int d() {
            ejhh ejhhVar = CarSetupServiceImpl.a;
            return this.b.i;
        }

        @Override // defpackage.alre
        public final alia e() {
            ejhh ejhhVar = CarSetupServiceImpl.a;
            return this.b.F;
        }

        @Override // defpackage.alre
        public final CarInfoInternal f() {
            ejhh ejhhVar = CarSetupServiceImpl.a;
            return this.b.k;
        }

        @Override // defpackage.alre
        public final boolean g() {
            ejhh ejhhVar = CarSetupServiceImpl.a;
            return this.b.j.j();
        }

        @Override // defpackage.alre
        public final boolean h() {
            ejhh ejhhVar = CarSetupServiceImpl.a;
            return this.b.j.i;
        }

        @Override // defpackage.alre
        public final boolean i() {
            ejhh ejhhVar = CarSetupServiceImpl.a;
            return this.b.g;
        }

        @Override // defpackage.alre
        public final void j(alrf alrfVar) {
            ejhh ejhhVar = CarSetupServiceImpl.a;
            if (this.b.j == null) {
                try {
                    alrfVar.a();
                    return;
                } catch (RemoteException unused) {
                    return;
                }
            }
            CarSetupServiceImpl carSetupServiceImpl = this.b;
            if (carSetupServiceImpl.j.m) {
                this.a = alrfVar;
                this.b.j.f();
                return;
            }
            try {
                Bundle bundle = new Bundle();
                carSetupServiceImpl.e.j(bundle);
                alrfVar.b(bundle);
            } catch (RemoteException unused2) {
            }
            CarSetupServiceImpl carSetupServiceImpl2 = this.b;
            carSetupServiceImpl2.l = null;
            carSetupServiceImpl2.b();
        }
    }

    public static void n(Intent intent) {
        intent.putExtra("service_handshake", new BinderParcel(new alrn()));
    }

    private static ecyr p(boolean z, boolean z2) {
        return (z || !z2) ? ecyr.USER_SELECTION : ecyr.NOT_CURRENTLY_SUPPORTED;
    }

    private final void q() {
        Notification.Builder color = new Notification.Builder(this).setContentTitle(getString(R.string.car_app_name)).setContentText(getString(R.string.car_notification_message)).setSmallIcon(akye.a(this)).setColor(getResources().getColor(R.color.car_light_blue_500));
        String string = getString(R.string.car_app_name);
        if (flsl.c() && asqh.a()) {
            Bundle bundle = new Bundle();
            bundle.putString("android.substName", string);
            color.addExtras(bundle);
        }
        if (asqh.c()) {
            akyg b2 = akyg.b(this);
            if (b2.a("car.default_notification_channel") == null) {
                b2.c(new NotificationChannel("car.default_notification_channel", getString(R.string.car_app_name), 3));
            }
            color.setChannelId("car.default_notification_channel");
        }
        startForeground(1, color.build());
        a.h().ah(2654).x("started foreground service");
    }

    private final void r(Closeable closeable, Bundle bundle, Runnable runnable) {
        Runnable runnable2;
        Throwable th;
        long a2;
        try {
            Context applicationContext = getApplicationContext();
            int i = alzx.a;
            int i2 = eitj.d;
            eite eiteVar = new eite();
            eito eitoVar = new eito();
            Iterator it = flsh.a.a().b().b.iterator();
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
                    eitoVar.i(unflattenFromString, Long.valueOf(j));
                } catch (NumberFormatException | InvalidPropertiesFormatException e) {
                    th = e;
                    runnable2 = runnable;
                    a.i().s(th).ah(2666).x("Aborting car connection handoff due to configuration error.");
                    runnable2.run();
                    return;
                }
            }
            ejfg listIterator = eitoVar.b().entrySet().listIterator();
            while (listIterator.hasNext()) {
                Map.Entry entry = (Map.Entry) listIterator.next();
                ComponentName componentName = (ComponentName) entry.getKey();
                Long l = (Long) entry.getValue();
                long longValue = l.longValue();
                try {
                    a2 = ilv.a(applicationContext.getPackageManager().getPackageInfo(componentName.getPackageName(), 0));
                } catch (PackageManager.NameNotFoundException unused) {
                }
                if ("com.google.android.projection.gearhead".equals(componentName.getPackageName())) {
                    if (alng.a.compare(Long.valueOf(a2), l) < 0) {
                        entry.getKey();
                        entry.getValue();
                    }
                } else if (a2 < longValue) {
                    entry.getKey();
                    entry.getValue();
                }
                eiteVar.i((ComponentName) entry.getKey());
            }
            eitj g = eiteVar.g();
            this.L = H.nextLong();
            this.A = new alpw(this.C, this, this, this.h, this.N);
            final alzt alztVar = new alzt(getApplicationContext(), this.L, this.A, this.C, g, this.s);
            alpw alpwVar = this.A;
            long j2 = this.L;
            int i3 = this.f;
            int i4 = this.i;
            alpwVar.k = j2;
            alpwVar.m = i4;
            alpwVar.l = i3;
            alpwVar.h = closeable;
            alpwVar.i = bundle;
            alpwVar.j = runnable;
            alpwVar.n = alztVar;
            if (alztVar.d) {
                alzt.a.h().ah(2985).x("Starting handoff interest checks");
                alztVar.e.post(new Runnable() { // from class: alzc
                    @Override // java.lang.Runnable
                    public final void run() {
                        alzt alztVar2 = alzt.this;
                        alzs alzsVar = alztVar2.i;
                        alzsVar.a();
                        alzsVar.b.addAll(alztVar2.f);
                        alztVar2.f();
                    }
                });
            } else {
                alzt.a.h().ah(2986).x("Skipping handoff interest checks - feature is not enabled");
                alztVar.e.post(new Runnable() { // from class: alzb
                    @Override // java.lang.Runnable
                    public final void run() {
                        alzt alztVar2 = alzt.this;
                        alztVar2.j.c(null, alztVar2.d);
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
        a.h().ah(2640).z("stopped foreground service id %d", this.M);
        if (flsh.a.a().i()) {
            stopSelf(this.M);
        } else {
            stopSelf();
        }
    }

    public final void b() {
        if (!l()) {
            alga algaVar = this.e;
            if (algaVar == null) {
                a.j().ah(2642).x("Protocol manager is unexpectedly null, ignoring");
                alcl.h(this, elwq.CAR_SETUP_SERVICE_NULL_PROTOCOL_MANAGER_DURING_FINISH_TRANSFER);
            } else {
                algaVar.e.t.c();
                this.e = null;
            }
        }
        k();
    }

    public final void c(CarInfoInternal carInfoInternal, boolean z) {
        alcl.i(this, alci.STARTED, 0);
        this.k = carInfoInternal;
        alsm alsmVar = new alsm(this, this.x, new alpd(this, z));
        this.z = alsmVar;
        alsn alsnVar = alsmVar.e;
        int a2 = alsnVar.a();
        if (a2 != 0) {
            alsmVar.a(a2);
        } else {
            akrt akrtVar = alsmVar.d;
            if (Integer.toString(Build.VERSION.SDK_INT).equals(akrtVar.b())) {
                alsmVar.a(alsnVar.c() ? 1 : 0);
            } else {
                akrtVar.b();
                alsl alslVar = new alsl(alsmVar);
                alsmVar.b.set(alslVar);
                alslVar.start();
            }
        }
        if (flwu.d()) {
            alsp alspVar = this.f == 2 ? alsp.WIFI : alsp.USB;
            if (flwu.c()) {
                alss alssVar = new alss(this);
                String str = this.k.f;
                alssVar.c();
                if (!BluetoothAdapter.checkBluetoothAddress(str) || alspVar == null) {
                    return;
                }
                EnumSet a3 = alssVar.a(str);
                if (a3.contains(alspVar)) {
                    return;
                }
                a3.add(alspVar);
                alssVar.a.edit().putStringSet(alss.b(str), eiuu.F(eivv.j(a3, new eiho() { // from class: alsr
                    @Override // defpackage.eiho
                    public final Object apply(Object obj) {
                        return ((alsp) obj).name();
                    }
                }))).apply();
            }
        }
    }

    @Override // defpackage.alqu
    public final void d(elxk elxkVar, elxl elxlVar, String str) {
        this.J.a(elxkVar, elxlVar, str);
    }

    @Override // com.google.android.chimera.Service
    public final void dump(FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        printWriter.println("Connection type: " + this.f);
        printWriter.println("Connected state: " + this.c.a());
        aloy aloyVar = this.h;
        if (aloyVar != null) {
            printWriter.println("Analytics session id: " + aloyVar.a);
        }
        alxh alxhVar = this.d;
        int i = 0;
        if (alxhVar != null) {
            deqr deqrVar = alxhVar.a;
            printWriter.println(a.Z(deqrVar != null ? deqrVar.l() : false, "Wake lock held: "));
        } else {
            printWriter.println("Wake lock is null");
        }
        printWriter.println("startActivities: " + this.g);
        printWriter.println("connectionTag: " + this.i);
        printWriter.println("suppressRestart: " + this.n);
        printWriter.println("readerThreadStuck: " + this.o);
        printWriter.println("carServiceSessionId: " + this.L);
        alra alraVar = this.j;
        if (alraVar != null) {
            printWriter.println("FrxState");
            printWriter.println("setupOngoing: " + alraVar.m);
            printWriter.println("carConnectionAlreadyAllowed: " + alraVar.n);
            printWriter.println("shouldShowTutorial: " + alraVar.i);
            printWriter.println("transferStarted: " + alraVar.o);
            printWriter.println("carServiceStarted: " + alraVar.p);
        }
        CarInfoInternal carInfoInternal = this.k;
        if (carInfoInternal != null) {
            printWriter.println("car info: ".concat(carInfoInternal.toString()));
        }
        if (this.y != null) {
            alcu alcuVar = this.y;
            printWriter.print("CarGalMonitor{messageListeners=[");
            synchronized (alcuVar.a) {
                int i2 = 0;
                while (true) {
                    SparseArray sparseArray = alcuVar.b;
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
                    SparseArray sparseArray2 = alcuVar.c;
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
        akyf.a(this, printWriter);
        this.K.b(printWriter);
    }

    public final void e(alcd alcdVar) {
        alcl.e(this, "com.google.android.gms.car.CAR_SETUP_SERVICE", alcdVar);
    }

    public final void f(final Closeable closeable, final ParcelFileDescriptor parcelFileDescriptor, final boolean z) {
        if (parcelFileDescriptor == null) {
            a.i().ah(2664).x("Null connection file descriptor. Not starting car connection.");
            k();
        } else {
            Runnable runnable = new Runnable() { // from class: alpg
                @Override // java.lang.Runnable
                public final void run() {
                    CarSetupServiceImpl carSetupServiceImpl = CarSetupServiceImpl.this;
                    if (carSetupServiceImpl.m()) {
                        return;
                    }
                    boolean z2 = z;
                    ParcelFileDescriptor parcelFileDescriptor2 = parcelFileDescriptor;
                    Closeable closeable2 = closeable;
                    eiig.q(((Boolean) carSetupServiceImpl.u.a()).booleanValue(), "Unable to handoff car connection and not configured to fall back to GMS Core.");
                    carSetupServiceImpl.h(closeable2, parcelFileDescriptor2, parcelFileDescriptor2, z2);
                }
            };
            Bundle bundle = new Bundle();
            bundle.putParcelable("car_setup.EXTRA_CAR_CONNECTION_FILE_DESCRIPTOR", parcelFileDescriptor);
            r(closeable, bundle, runnable);
        }
    }

    public final void g() {
        a.h().ah(2665).x("Start FRX setup");
        if (flsr.f()) {
            alcl.e(this, "com.google.android.gms.car.FRX", alci.STARTED);
        }
        alra alraVar = this.j;
        alra.a.h().ah(2746).x("Starting setup");
        if (flvo.a.a().a()) {
            ((UiModeManager) alraVar.b.getSystemService("uimode")).disableCarMode(0);
        }
        Context context = alraVar.b;
        ((KeyguardManager) context.getSystemService("keyguard")).isKeyguardLocked();
        alraVar.m = true;
        ((alic) alraVar.e).a.add(alraVar);
        Intent intent = new Intent();
        intent.setComponent(akyp.d);
        intent.addFlags(268435456);
        intent.addFlags(32768);
        intent.addFlags(AndroidInputTypeSignal.TYPE_TEXT_FLAG_AUTO_COMPLETE);
        intent.putExtra("frx_state", new BinderParcel(new alrh(new ObjectWrapper(alraVar))));
        context.startActivity(intent);
    }

    public final void h(Closeable closeable, ParcelFileDescriptor parcelFileDescriptor, ParcelFileDescriptor parcelFileDescriptor2, boolean z) {
        int i;
        eiig.p(this.f != -1);
        this.g = z;
        alpn alpnVar = new alpn(this);
        this.m = alpnVar;
        FileInputStream fileInputStream = new FileInputStream(parcelFileDescriptor.getFileDescriptor());
        FileOutputStream fileOutputStream = new FileOutputStream(parcelFileDescriptor2.getFileDescriptor());
        alpx alpxVar = new alpx(closeable, b, this.f);
        ejhh ejhhVar = alga.a;
        alfu alfuVar = new alfu();
        alfuVar.c = this;
        alfuVar.k = new alfo(false);
        alfuVar.l = "GmsCore_OpenSSL";
        eiig.a(true);
        alfuVar.m = R.raw.car_android_32;
        eiig.a(true);
        alfuVar.i = R.raw.car_android_64;
        eiig.a(true);
        alfuVar.h = R.raw.car_android_128;
        eiig.a(true);
        alfuVar.n = R.string.car_hu_label;
        int i2 = this.f;
        if (i2 == 1) {
            alem a2 = alen.a();
            a2.e(fluf.a.a().f());
            a2.f(fluf.f());
            a2.g(true);
            a2.c(1);
            alfuVar.o = a2.a();
        } else if (i2 == 2) {
            alem a3 = alen.a();
            a3.e(fluf.a.a().g());
            a3.f(fluf.f());
            a3.g(true);
            if (fluf.b() > 0) {
                a3.d((int) fluf.b());
                a3.c(2);
            }
            if (fluf.c() > 0) {
                a3.b((int) fluf.c());
            }
            alfuVar.o = a3.a();
        }
        alfuVar.e = alpnVar;
        alfuVar.b = alpxVar;
        alfuVar.g = fileInputStream;
        alfuVar.j = fileOutputStream;
        akrt akrtVar = this.x;
        akzy a4 = akzz.a();
        a4.d(!fluf.e() ? false : akrtVar.c.getBoolean("car_gal_snoop_log_video_ack", false));
        a4.c(!fluf.e() ? false : akrtVar.c.getBoolean("car_gal_snoop_log_media_ack", false));
        a4.b(!fluf.e() ? false : akrtVar.c.getBoolean("car_gal_snoop_log_guidance_ack", false));
        akzz a5 = a4.a();
        akzm a6 = akzn.a();
        a6.c(fluf.e() ? akrtVar.c.getBoolean("car_enable_gal_snoop", false) : false);
        if (fluf.e()) {
            try {
                i = Integer.parseInt(akrtVar.c.getString("car_gal_snoop_buffer_size", "100"));
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
        alfuVar.f = a6.a();
        this.e = new alga(alfuVar);
        if (this.y != null) {
            this.e.h(this.y);
        }
        if (this.w == null) {
            this.c.b(2);
            e(alcd.SET_STATE_WAITING_FOR_PATCHER);
        } else {
            this.c.b(3);
            e(alcd.SET_STATE_DISCOVERED);
            this.e.i();
        }
    }

    public final void i(boolean z, boolean z2) {
        if (!l()) {
            this.l = new ConnectionTransfer(this);
            Intent intent = new Intent("com.google.android.gms.car.TRANSFER");
            intent.setComponent((ComponentName) akyp.a.a());
            intent.putExtra("connection", new BinderParcel(this.l));
            n(intent);
            alcl.e(this, "com.google.android.gms.car.CONNECTION_TRANSFER", alci.STARTED);
            startService(intent);
            return;
        }
        this.A.q = z;
        this.A.r = z2;
        alpw alpwVar = this.A;
        a.h().ah(2633).x("Starting transfer for handoff.");
        alpwVar.p = true;
        alpwVar.n.a(alpwVar.k, alpwVar.a(!alpwVar.o));
        Context context = alpwVar.e;
        alpx alpxVar = new alpx(new Closeable() { // from class: alpu
            @Override // java.io.Closeable, java.lang.AutoCloseable
            public final void close() {
            }
        }, b, alpwVar.l);
        if (!alpwVar.s) {
            throw new IllegalStateException("No component accepted the handoff.");
        }
        Intent putExtra = new Intent("com.google.android.gms.car.HANDOFF").setComponent((ComponentName) akyp.a.a()).putExtra("car_handoff_session_id", alpwVar.k).putExtra("car_handoff_component", alpwVar.v.flattenToString()).putExtra("car_handoff_start_activities", true).putExtra("car_handoff_user_authorized_projection", !alpwVar.o).putExtra("car_handoff_connection_type", alpwVar.l).putExtra("connection_tag", alpwVar.m);
        alxy alxyVar = alpwVar.g;
        n(putExtra);
        if (alpwVar.i != null && Build.VERSION.SDK_INT >= 30) {
            putExtra.putExtra("car_handoff_starting_bluetooth_device", alpwVar.i.getParcelable("WIFI_STARTING_BLUETOOTH_DEVICE"));
        }
        putExtra.putExtra("car_handoff_analytics_session_id", (int) alpwVar.k);
        if (alpwVar.f()) {
            putExtra.putExtra("car_handoff_is_car_audio_service_migration_enabled", true);
        }
        putExtra.putExtra("connection_tear_down_helper", new BinderParcel(new alrt(alpxVar)));
        CarInfoInternal carInfoInternal = alpwVar.d.k;
        if (carInfoInternal != null) {
            arxd.l(carInfoInternal, putExtra, "car_handoff_car_info");
        }
        putExtra.putExtra("car_handoff_is_first_connection", alpwVar.q);
        context.startService(putExtra);
        if (alpwVar.o) {
            return;
        }
        alpwVar.c.postDelayed(alpwVar.b, 5000L);
    }

    @Override // defpackage.alqu
    public final void j(final Socket socket) {
        akue.e(new Runnable() { // from class: alpb
            @Override // java.lang.Runnable
            public final void run() {
                Socket socket2 = socket;
                ParcelFileDescriptor fromSocket = ParcelFileDescriptor.fromSocket(socket2);
                CarSetupServiceImpl.this.h(new alpo(socket2, fromSocket, fromSocket), fromSocket, fromSocket, true);
            }
        });
    }

    public final void k() {
        a.h().ah(2670).x("tearDown");
        FirstActivityImpl.k = false;
        this.t = false;
        alic alicVar = this.G;
        synchronized (alicVar.b) {
            if (alicVar.e) {
                alia aliaVar = alicVar.f;
                if (aliaVar != null) {
                    try {
                        aliaVar.b(alicVar);
                    } catch (RemoteException unused) {
                    }
                }
                alicVar.e = false;
            }
        }
        this.K.d(this);
        if (this.c.a() == 0) {
            e(alcd.STATE_ALREADY_NOT_CONNECTED_IN_TEARDOWN);
            return;
        }
        if (this.A != null) {
            alpw alpwVar = this.A;
            a.h().ah(2635).x("Tearing down car connection");
            if (!alpwVar.p) {
                alyy alyyVar = alpwVar.n;
                alzt.a.h().ah(2987).x("Tearing down car connection");
                final alzt alztVar = (alzt) alyyVar;
                alztVar.d().execute(new Runnable() { // from class: alzi
                    @Override // java.lang.Runnable
                    public final void run() {
                        alzt alztVar2 = alzt.this;
                        alzs alzsVar = alztVar2.i;
                        if (alzsVar.a) {
                            alie alieVar = alzsVar.g;
                            if (alieVar != null) {
                                try {
                                    alieVar.b(alztVar2.c);
                                } catch (RemoteException e) {
                                    alzt.a.h().s(e).ah(2977).B("Couldn't stop %s, but it could be fine.", alztVar2.i.e);
                                }
                            }
                            alztVar2.b.unbindService(alztVar2.h);
                            alztVar2.i.a = false;
                        }
                    }
                });
            }
        }
        alga algaVar = this.e;
        if (algaVar != null) {
            algaVar.f();
            this.e.e();
        }
        alxh alxhVar = this.d;
        if (alxhVar != null) {
            alxhVar.a();
        }
        alxx alxxVar = this.I;
        synchronized (alxxVar.d) {
            TracingBroadcastReceiver tracingBroadcastReceiver = alxxVar.e;
            if (tracingBroadcastReceiver != null) {
                try {
                    unregisterReceiver(tracingBroadcastReceiver);
                } catch (IllegalArgumentException e) {
                    alxx.a.j().s(e).ah(2929).x("Unable to unregister USB disconnect receiver.");
                }
                alxxVar.e = null;
            }
        }
        alra alraVar = this.j;
        if (alraVar != null) {
            alsg alsgVar = alraVar.h;
            if (alsgVar != null) {
                alsgVar.a();
            }
            alraVar.c(null, true);
            this.j = null;
        }
        alsm alsmVar = this.z;
        if (alsmVar != null) {
            alsl alslVar = (alsl) alsmVar.b.getAndSet(null);
            if (alslVar != null && alslVar.isAlive()) {
                alslVar.interrupt();
                try {
                    alslVar.join(1000L);
                } catch (InterruptedException unused2) {
                }
            }
            this.z = null;
        }
        this.C.removeCallbacksAndMessages(null);
        final alqt alqtVar = this.p;
        if (alqtVar.h) {
            alqtVar.h = false;
            alqtVar.b.unregisterReceiver(alqtVar.l);
            alqtVar.d();
            alqtVar.f.execute(new Runnable() { // from class: alql
                @Override // java.lang.Runnable
                public final void run() {
                    alqt alqtVar2 = alqt.this;
                    ScheduledFuture scheduledFuture = alqtVar2.g;
                    if (scheduledFuture != null) {
                        scheduledFuture.cancel(true);
                    }
                    alqtVar2.e.removeCallbacksAndMessages(null);
                    alqtVar2.f.shutdownNow();
                }
            });
        }
        aloy aloyVar = this.h;
        if (aloyVar != null) {
            aloyVar.a();
        }
        a();
        this.c.b(0);
        e(alcd.SET_STATE_NOT_CONNECTED);
        if (this.f == 1 && this.o) {
            a.h().ah(2671).x("Reader thread stuck after cable removal. Will kill process.");
            Process.killProcess(Process.myPid());
        }
    }

    public final boolean l() {
        return this.A != null && this.A.s;
    }

    public final boolean m() {
        if (Build.VERSION.SDK_INT < 30 || ((Boolean) this.u.a()).booleanValue()) {
            return false;
        }
        a.i().ah(2663).x("Unable to handoff car connection (no components interested), tearing down");
        k();
        return true;
    }

    public final void o(boolean z, int i) {
        alrf alrfVar;
        alcl.i(this, alci.FAILED, i);
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
            if (connectionTransfer != null && (alrfVar = connectionTransfer.a) != null) {
                try {
                    alrfVar.a();
                } catch (RemoteException unused) {
                }
            }
            alga algaVar = this.e;
            if (algaVar != null) {
                this.e.g(p(z, algaVar.k()));
            }
        }
        this.l = null;
        this.j = null;
        k();
    }

    @Override // com.google.android.chimera.Service
    public final IBinder onBind(Intent intent) {
        if ("com.google.android.gms.carsetup.ACTION_BIND_CAR_SETUP_SERVICE".equals(intent.getAction())) {
            return new alrc(this);
        }
        return null;
    }

    @Override // com.google.android.chimera.Service
    public final void onCreate() {
        alxu alxuVar;
        a.h().ah(2655).x("onCreate");
        super.onCreate();
        e(alcd.CREATE);
        if (Build.VERSION.SDK_INT >= 30 && flsh.a.a().d()) {
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
                    UsbConnectionHelper$TrackedParcelFileDescriptor.g = new byhr(UsbConnectionHelper$TrackedParcelFileDescriptor.f.getLooper());
                }
                final Context applicationContext = getApplicationContext();
                if (UsbConnectionHelper$TrackedParcelFileDescriptor.b.getAndIncrement() == 0) {
                    UsbConnectionHelper$TrackedParcelFileDescriptor.e = new UsbConnectionHelper$TrackedParcelFileDescriptor.DisconnectWatcher(this);
                    final UsbConnectionHelper$TrackedParcelFileDescriptor.DisconnectWatcher disconnectWatcher = UsbConnectionHelper$TrackedParcelFileDescriptor.e;
                    eiig.y(disconnectWatcher, "Disconnect watcher should not be null");
                    eiig.y(UsbConnectionHelper$TrackedParcelFileDescriptor.g, "Background handler should not be null");
                    UsbConnectionHelper$TrackedParcelFileDescriptor.g.post(new Runnable() { // from class: alxt
                        @Override // java.lang.Runnable
                        public final void run() {
                            List list = UsbConnectionHelper$TrackedParcelFileDescriptor.a;
                            iln.c(applicationContext, disconnectWatcher, new IntentFilter("android.hardware.usb.action.USB_STATE"), null, UsbConnectionHelper$TrackedParcelFileDescriptor.g, 2);
                        }
                    });
                }
                alxuVar = new alxu(new AtomicBoolean(false), applicationContext);
            }
            this.O = alxuVar;
        }
        HandlerThread handlerThread = new HandlerThread("CarSetupServiceImpl", 9);
        this.B = handlerThread;
        handlerThread.start();
        this.D = new byhr(Looper.getMainLooper());
        this.C = new byhr(this.B.getLooper());
        this.x = akrt.a(this);
        Boolean b2 = algc.a().b();
        if (b2 == null) {
            ExecutorService b3 = akyr.b(1);
            b3.execute(new alqb(this));
            b3.shutdown();
        } else {
            this.w = b2;
        }
        aloy aloyVar = new aloy(this);
        this.h = aloyVar;
        eiig.x(aloyVar);
        this.p = new alqt(getApplicationContext(), new alsi(this.h));
        this.K = alkr.a(this);
        this.J = new alwj(this);
        this.I = new alxx(this.J);
        this.K.c(this, 100);
    }

    @Override // com.google.android.chimera.Service
    public final void onDestroy() {
        a.h().ah(2656).x("onDestroy");
        super.onDestroy();
        k();
        e(alcd.DESTROY);
        if (flsh.a.a().f()) {
            this.C.postDelayed(new Runnable() { // from class: alpc
                @Override // java.lang.Runnable
                public final void run() {
                    CarSetupServiceImpl.a.h().ah(2653).x("quit handler thread");
                    CarSetupServiceImpl carSetupServiceImpl = CarSetupServiceImpl.this;
                    carSetupServiceImpl.B.quitSafely();
                    carSetupServiceImpl.B = null;
                }
            }, flsh.a.a().a());
        } else {
            this.B.quitSafely();
            this.B = null;
        }
        alxu alxuVar = this.O;
        if (alxuVar != null) {
            final Context context = alxuVar.b;
            AtomicBoolean atomicBoolean = alxuVar.a;
            synchronized (UsbConnectionHelper$TrackedParcelFileDescriptor.d) {
                if (atomicBoolean.compareAndSet(false, true) && UsbConnectionHelper$TrackedParcelFileDescriptor.b.decrementAndGet() == 0) {
                    final UsbConnectionHelper$TrackedParcelFileDescriptor.DisconnectWatcher disconnectWatcher = UsbConnectionHelper$TrackedParcelFileDescriptor.e;
                    eiig.y(disconnectWatcher, "Disconnect watcher should not be null");
                    UsbConnectionHelper$TrackedParcelFileDescriptor.e = null;
                    UsbConnectionHelper$TrackedParcelFileDescriptor.c.incrementAndGet();
                    eiig.y(UsbConnectionHelper$TrackedParcelFileDescriptor.g, "Background handler should not be null");
                    UsbConnectionHelper$TrackedParcelFileDescriptor.g.postDelayed(new Runnable() { // from class: alxv
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
        aktt aktrVar;
        alxh c;
        this.M = i2;
        boolean z = intent != null && intent.getBooleanExtra("start_foreground_immediately", false);
        if (z) {
            q();
        }
        ejhh ejhhVar = a;
        ejhhVar.h().ah(2657).G("onStartCommand (id=%d): %s", i2, intent);
        if (intent == null) {
            ejhhVar.h().ah(2662).x("Restarting with null intent");
            a();
            return 2;
        }
        SetupBinder setupBinder = (SetupBinder) intent.getParcelableExtra("EXTRA_LOCAL_BINDER");
        this.t = intent.getBooleanExtra("PreSetup.PRE_SETUP_WELCOME_SCREEN_SHOWN", false);
        if (!Boolean.FALSE.equals(this.w)) {
            alqc alqcVar = this.c;
            ParcelFileDescriptor parcelFileDescriptor = null;
            if (alqcVar.c()) {
                ejhhVar.h().ah(2660).x("Already connected; ignoring connection request");
                e(alcd.ALREADY_STARTED);
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
                        ejhhVar.h().ah(2659).x("Restarted with invalid binder");
                        a();
                        return 2;
                    }
                    this.d = setupBinder.c();
                    intent = setupBinder.a;
                    eiig.x(intent);
                }
                alqcVar.b(1);
                e(alcd.SET_STATE_CONNECTING);
                this.i = 0;
                intent.setExtrasClassLoader(getClassLoader());
                this.n = intent.getBooleanExtra("suppress_restart", false);
                elwn elwnVar = elwn.a;
                elwm elwmVar = (elwm) elwnVar.v();
                if (!elwmVar.b.L()) {
                    elwmVar.U();
                }
                elwn elwnVar2 = (elwn) elwmVar.b;
                elwnVar2.c |= 33554432;
                elwnVar2.C = 1;
                this.h.e((elwn) elwmVar.Q(), 63);
                if ("android.hardware.usb.action.USB_ACCESSORY_ATTACHED".equals(intent.getAction()) || "com.google.android.gms.car.usb.USB_ACCESSORY_FORCE_START".equals(intent.getAction())) {
                    UsbAccessory usbAccessory = (UsbAccessory) intent.getParcelableExtra("accessory");
                    if (usbAccessory != null) {
                        this.f = 1;
                        carSetupServiceImpl = this;
                        this.I.a(carSetupServiceImpl, usbAccessory, true, intent.getBooleanExtra("show_permission_errors", true), new alpa(this));
                        if (!z && carSetupServiceImpl.c.a() != 0) {
                            q();
                        }
                    }
                } else if ("com.google.android.gms.car.WIFI_ACTION_BRIDGE".equals(intent.getAction())) {
                    if (intent.getStringExtra("PARAM_HOST_ADDRESS") == null || intent.getIntExtra("PARAM_SERVICE_PORT", -1) == -1) {
                        ejhhVar.i().ah(2651).x("Failure to start wifi with invalid IP / Port");
                        k();
                    } else {
                        aloy aloyVar = this.h;
                        elwm elwmVar2 = (elwm) elwnVar.v();
                        fecj v = elxz.a.v();
                        if (!v.b.L()) {
                            v.U();
                        }
                        elxz elxzVar = (elxz) v.b;
                        elxzVar.b |= 1;
                        elxzVar.c = 2;
                        if (!elwmVar2.b.L()) {
                            elwmVar2.U();
                        }
                        elwn elwnVar3 = (elwn) elwmVar2.b;
                        elxz elxzVar2 = (elxz) v.Q();
                        elxzVar2.getClass();
                        elwnVar3.u = elxzVar2;
                        elwnVar3.c |= 16;
                        int i3 = eitj.d;
                        aloyVar.f(elwmVar2, 46, ejcb.a);
                        WifiInfo wifiInfo = (WifiInfo) intent.getParcelableExtra("wifi_info");
                        this.f = 2;
                        this.s = wifiInfo != null ? Math.max(wifiInfo.getFrequency(), 0) : 0;
                        final Bundle extras = intent.getExtras();
                        ejhhVar.h().ah(2667).B("Start handoff wifi setup %s", extras);
                        r(new Closeable() { // from class: alpi
                            @Override // java.io.Closeable, java.lang.AutoCloseable
                            public final void close() {
                                ejhh ejhhVar2 = CarSetupServiceImpl.a;
                            }
                        }, extras, new Runnable() { // from class: alph
                            @Override // java.lang.Runnable
                            public final void run() {
                                final CarSetupServiceImpl carSetupServiceImpl2 = CarSetupServiceImpl.this;
                                if (carSetupServiceImpl2.m()) {
                                    return;
                                }
                                final Bundle bundle = extras;
                                eiig.q(((Boolean) carSetupServiceImpl2.u.a()).booleanValue(), "Unable to handoff car connection and not configured to fall back to GMS Core.");
                                carSetupServiceImpl2.D.post(new Runnable() { // from class: aloz
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        Bundle bundle2 = bundle;
                                        String string = bundle2.getString("PARAM_HOST_ADDRESS");
                                        int i4 = bundle2.getInt("PARAM_SERVICE_PORT", -1);
                                        WifiInfo wifiInfo2 = (WifiInfo) bundle2.getParcelable("wifi_info");
                                        Network network = (Network) bundle2.getParcelable("PARAM_SERVICE_WIFI_NETWORK");
                                        boolean z2 = bundle2.getBoolean("WIFI_Q_ENABLED");
                                        CarSetupServiceImpl.a.h().ah(2669).U("Start wifi setup %s:%s isUsingQNetworkStack=%b wifiInfo=(%s)", string, Integer.valueOf(i4), Boolean.valueOf(z2), wifiInfo2);
                                        CarSetupServiceImpl carSetupServiceImpl3 = CarSetupServiceImpl.this;
                                        alqt alqtVar = carSetupServiceImpl3.p;
                                        if (alqtVar.h) {
                                            alqt.a.i().ah(2704).x("Already initialized");
                                        } else {
                                            alqtVar.d = carSetupServiceImpl3;
                                            alqtVar.f = new asmb(1, akyr.a(1));
                                            IntentFilter intentFilter = new IntentFilter();
                                            intentFilter.addAction("android.net.wifi.STATE_CHANGE");
                                            iln.b(alqtVar.b, alqtVar.l, intentFilter, 2);
                                            alqtVar.j = 0;
                                            alqtVar.h = true;
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
                            aktrVar = null;
                        } else {
                            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.car.IFdBinder");
                            aktrVar = queryLocalInterface instanceof aktt ? (aktt) queryLocalInterface : new aktr(iBinder);
                        }
                        try {
                            parcelFileDescriptor = aktrVar.a();
                        } catch (RemoteException unused) {
                        }
                    }
                    if (parcelFileDescriptor == null) {
                        a.i().ah(2650).x("Failure starting");
                    } else {
                        this.i = intent.getIntExtra("connection_tag", -1);
                        f(parcelFileDescriptor, parcelFileDescriptor, intent.getBooleanExtra("start_activities", true));
                    }
                } else {
                    ejhhVar.i().ah(2649).B("Unknown intent %s", intent);
                    k();
                }
                carSetupServiceImpl = this;
                if (!z) {
                    q();
                }
            }
            if (setupBinder != null && (!fluc.a.a().c() || setupBinder.b())) {
                setupBinder.a();
            }
            return 1;
        }
        ejhhVar.h().ah(2661).x("Failed security update, aborting");
        a();
        if (setupBinder != null) {
            setupBinder.a();
        }
        return 1;
    }
}
