package com.google.android.gms.cast.service;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import com.google.android.gms.cast.CastDevice;
import com.google.android.gms.common.internal.BinderWrapper;
import com.google.android.gms.common.internal.GetServiceRequest;
import defpackage.amap;
import defpackage.amhy;
import defpackage.amxx;
import defpackage.amxz;
import defpackage.anik;
import defpackage.anjg;
import defpackage.anjy;
import defpackage.annw;
import defpackage.aspu;
import defpackage.bxgd;
import defpackage.bxgj;
import defpackage.bxgo;
import defpackage.ejck;
import defpackage.flzu;
import defpackage.fmco;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes3.dex */
public class CastChimeraService extends bxgd {
    private static final AtomicInteger a = new AtomicInteger(0);
    private amap b;
    private bxgo c;

    public CastChimeraService() {
        super(new int[]{10, 161}, new String[]{"com.google.android.gms.cast.service.BIND_CAST_DEVICE_CONTROLLER_SERVICE", "com.google.android.gms.cast.service.BIND_CAST_DEVICE_CONTROLLER_SERVICE"}, ejck.a, 3, 10);
    }

    @Override // defpackage.bxgd
    protected final void a(bxgj bxgjVar, GetServiceRequest getServiceRequest) {
        CastDevice castDevice;
        IBinder iBinder;
        amxz amxxVar;
        amap amapVar;
        int i = getServiceRequest.d;
        if (i != 10) {
            if (i == 161 && (amapVar = this.b) != null) {
                bxgjVar.c(new anik(getApplicationContext(), amapVar.o, this.c, aspu.a(getApplicationContext()), amapVar.e, getServiceRequest.f, getServiceRequest.p));
                return;
            } else {
                bxgjVar.a(1, null);
                return;
            }
        }
        annw annwVar = new annw("CastService", String.format(Locale.ROOT, "instance-%d", Integer.valueOf(a.incrementAndGet())));
        Bundle bundle = getServiceRequest.i;
        try {
            castDevice = CastDevice.c(bundle);
        } catch (Exception e) {
            annwVar.e(e, "CastDevice was not valid.", new Object[0]);
            castDevice = null;
        }
        if (castDevice == null) {
            annwVar.d("CastDevice can not be null.", new Object[0]);
            bxgjVar.a(10, null);
            return;
        }
        boolean z = bundle.getBoolean("com.google.android.gms.cast.EXTRA_CAST_FRAMEWORK_NOTIFICATION_ENABLED");
        boolean z2 = bundle.getBoolean("com.google.android.gms.cast.EXTRA_CAST_REMOTE_CONTROL_NOTIFICATION_ENABLED");
        boolean z3 = bundle.getBoolean("com.google.android.gms.cast.EXTRA_CAST_ALWAYS_FOLLOW_SESSION_ENABLED");
        boolean z4 = bundle.getBoolean("com.google.android.gms.cast.EXTRA_USE_ROUTE_CONNECTION");
        String string = bundle.getString("connectionless_client_record_id");
        String str = getServiceRequest.f;
        long j = bundle.getLong("com.google.android.gms.cast.EXTRA_CAST_FLAGS", 0L);
        if (fmco.a.a().g().b.contains(str)) {
            j |= 8;
        }
        annwVar.c("getCastService: %s", str);
        if (string != null) {
            CastDevice castDevice2 = castDevice;
            if (!flzu.a.a().b()) {
                bxgjVar.a(3, null);
                return;
            }
            annwVar.n("%s, creating cxless service stub", str);
            long j2 = j;
            int i2 = getServiceRequest.e;
            amap amapVar2 = this.b;
            if (amapVar2 == null) {
                annwVar.d("CastComponent can't be null.", new Object[0]);
                return;
            }
            Context applicationContext = getApplicationContext();
            bxgo bxgoVar = this.c;
            String str2 = getServiceRequest.p;
            new anjg(applicationContext, bxgjVar, castDevice2, z, z2, z3, z4, i2, str, j2, annwVar, bxgoVar, amapVar2.n, amapVar2.r, amapVar2.g, amapVar2.p, amapVar2.l.a, amapVar2.i, amapVar2.q, str2);
            return;
        }
        BinderWrapper binderWrapper = (BinderWrapper) bundle.getParcelable("listener");
        if (binderWrapper == null || (iBinder = binderWrapper.a) == null) {
            amxxVar = null;
        } else {
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.cast.internal.ICastDeviceControllerListener");
            amxxVar = queryLocalInterface instanceof amxz ? (amxz) queryLocalInterface : new amxx(iBinder);
        }
        if (amxxVar == null) {
            annwVar.d("ICastDeviceControllerListener can't be null.", new Object[0]);
            bxgjVar.a(10, null);
            return;
        }
        String string2 = bundle.getString("last_application_id");
        String string3 = bundle.getString("last_session_id");
        annwVar.q("%s, connecting to device with lastApplicationId=%s, lastSessionId=%s", str, String.valueOf(string2), String.valueOf(string3));
        int i3 = getServiceRequest.e;
        String str3 = getServiceRequest.p;
        if (str3 == null) {
            str3 = "";
        }
        String str4 = str3;
        amap amapVar3 = this.b;
        if (amapVar3 == null) {
            annwVar.d("CastComponent can't be null.", new Object[0]);
        } else {
            new anjy(getApplicationContext(), bxgjVar, castDevice, string2, string3, z, z2, amxxVar, i3, str, j, annwVar, this.c, amapVar3.l, amapVar3.q, str4);
        }
    }

    @Override // defpackage.bxgd
    protected final void gb(Bundle bundle, IBinder iBinder) {
        if (bundle == null) {
            bundle = new Bundle();
        }
        ClassLoader classLoader = CastDevice.class.getClassLoader();
        if (classLoader != null) {
            bundle.setClassLoader(classLoader);
        }
        bundle.putParcelable("listener", new BinderWrapper(iBinder));
    }

    @Override // com.google.android.chimera.BoundService, defpackage.qan
    public final void onCreate() {
        this.b = amap.a(getApplicationContext(), "CastService");
        this.c = m(amhy.a());
    }

    @Override // defpackage.bxgd, com.google.android.chimera.BoundService, defpackage.qan
    public final void onDestroy() {
        if (this.b != null) {
            amap.b("CastService");
            this.b = null;
        }
        super.onDestroy();
    }
}
