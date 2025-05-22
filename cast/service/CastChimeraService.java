package com.google.android.gms.cast.service;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import com.google.android.gms.cast.CastDevice;
import com.google.android.gms.common.internal.BinderWrapper;
import com.google.android.gms.common.internal.GetServiceRequest;
import defpackage.aoca;
import defpackage.aoji;
import defpackage.aozi;
import defpackage.aozk;
import defpackage.apjx;
import defpackage.apkt;
import defpackage.apll;
import defpackage.appp;
import defpackage.auto;
import defpackage.bzot;
import defpackage.bzoz;
import defpackage.bzpe;
import defpackage.elpp;
import defpackage.fore;
import defpackage.fotw;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes3.dex */
public class CastChimeraService extends bzot {
    private static final AtomicInteger a = new AtomicInteger(0);
    private aoca b;
    private bzpe c;

    public CastChimeraService() {
        super(new int[]{10, 161}, new String[]{"com.google.android.gms.cast.service.BIND_CAST_DEVICE_CONTROLLER_SERVICE", "com.google.android.gms.cast.service.BIND_CAST_DEVICE_CONTROLLER_SERVICE"}, elpp.a, 3, 10);
    }

    @Override // defpackage.bzot
    protected final void a(bzoz bzozVar, GetServiceRequest getServiceRequest) {
        CastDevice castDevice;
        IBinder iBinder;
        aozk aoziVar;
        aoca aocaVar;
        int i = getServiceRequest.d;
        if (i != 10) {
            if (i == 161 && (aocaVar = this.b) != null) {
                bzozVar.c(new apjx(getApplicationContext(), aocaVar.o, this.c, auto.a(getApplicationContext()), aocaVar.e, getServiceRequest.f, getServiceRequest.p));
                return;
            } else {
                bzozVar.a(1, null);
                return;
            }
        }
        appp apppVar = new appp("CastService", String.format(Locale.ROOT, "instance-%d", Integer.valueOf(a.incrementAndGet())));
        Bundle bundle = getServiceRequest.i;
        try {
            castDevice = CastDevice.c(bundle);
        } catch (Exception e) {
            apppVar.e(e, "CastDevice was not valid.", new Object[0]);
            castDevice = null;
        }
        if (castDevice == null) {
            apppVar.d("CastDevice can not be null.", new Object[0]);
            bzozVar.a(10, null);
            return;
        }
        boolean z = bundle.getBoolean("com.google.android.gms.cast.EXTRA_CAST_FRAMEWORK_NOTIFICATION_ENABLED");
        boolean z2 = bundle.getBoolean("com.google.android.gms.cast.EXTRA_CAST_REMOTE_CONTROL_NOTIFICATION_ENABLED");
        boolean z3 = bundle.getBoolean("com.google.android.gms.cast.EXTRA_CAST_ALWAYS_FOLLOW_SESSION_ENABLED");
        boolean z4 = bundle.getBoolean("com.google.android.gms.cast.EXTRA_USE_ROUTE_CONNECTION");
        String string = bundle.getString("connectionless_client_record_id");
        String str = getServiceRequest.f;
        long j = bundle.getLong("com.google.android.gms.cast.EXTRA_CAST_FLAGS", 0L);
        if (fotw.a.lK().g().b.contains(str)) {
            j |= 8;
        }
        apppVar.c("getCastService: %s", str);
        if (string != null) {
            CastDevice castDevice2 = castDevice;
            if (!fore.a.lK().b()) {
                bzozVar.a(3, null);
                return;
            }
            apppVar.n("%s, creating cxless service stub", str);
            long j2 = j;
            int i2 = getServiceRequest.e;
            aoca aocaVar2 = this.b;
            if (aocaVar2 == null) {
                apppVar.d("CastComponent can't be null.", new Object[0]);
                return;
            }
            Context applicationContext = getApplicationContext();
            bzpe bzpeVar = this.c;
            String str2 = getServiceRequest.p;
            new apkt(applicationContext, bzozVar, castDevice2, z, z2, z3, z4, i2, str, j2, apppVar, bzpeVar, aocaVar2.n, aocaVar2.r, aocaVar2.g, aocaVar2.p, aocaVar2.l.a, aocaVar2.i, aocaVar2.q, str2);
            return;
        }
        BinderWrapper binderWrapper = (BinderWrapper) bundle.getParcelable("listener");
        if (binderWrapper == null || (iBinder = binderWrapper.a) == null) {
            aoziVar = null;
        } else {
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.cast.internal.ICastDeviceControllerListener");
            aoziVar = queryLocalInterface instanceof aozk ? (aozk) queryLocalInterface : new aozi(iBinder);
        }
        if (aoziVar == null) {
            apppVar.d("ICastDeviceControllerListener can't be null.", new Object[0]);
            bzozVar.a(10, null);
            return;
        }
        String string2 = bundle.getString("last_application_id");
        String string3 = bundle.getString("last_session_id");
        apppVar.q("%s, connecting to device with lastApplicationId=%s, lastSessionId=%s", str, String.valueOf(string2), String.valueOf(string3));
        int i3 = getServiceRequest.e;
        String str3 = getServiceRequest.p;
        if (str3 == null) {
            str3 = "";
        }
        String str4 = str3;
        aoca aocaVar3 = this.b;
        if (aocaVar3 == null) {
            apppVar.d("CastComponent can't be null.", new Object[0]);
        } else {
            new apll(getApplicationContext(), bzozVar, castDevice, string2, string3, z, z2, aoziVar, i3, str, j, apppVar, this.c, aocaVar3.l, aocaVar3.q, str4);
        }
    }

    @Override // defpackage.bzot
    protected final void gq(Bundle bundle, IBinder iBinder) {
        if (bundle == null) {
            bundle = new Bundle();
        }
        ClassLoader classLoader = CastDevice.class.getClassLoader();
        if (classLoader != null) {
            bundle.setClassLoader(classLoader);
        }
        bundle.putParcelable("listener", new BinderWrapper(iBinder));
    }

    @Override // com.google.android.chimera.BoundService, defpackage.rtr
    public final void onCreate() {
        this.b = aoca.a(getApplicationContext(), "CastService");
        this.c = m(aoji.a());
    }

    @Override // defpackage.bzot, com.google.android.chimera.BoundService, defpackage.rtr
    public final void onDestroy() {
        if (this.b != null) {
            aoca.b("CastService");
            this.b = null;
        }
        super.onDestroy();
    }
}
