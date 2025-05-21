package com.google.android.gms.auth.proximity.firstparty;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import com.google.android.chimera.Service;
import com.google.android.gms.auth.proximity.RemoteDevice;
import com.google.android.gms.auth.proximity.Role;
import com.google.android.gms.auth.proximity.firstparty.SecureChannelSubscription;
import com.google.android.gms.common.api.Status;
import defpackage.acdy;
import defpackage.acdz;
import defpackage.aclq;
import defpackage.acmo;
import defpackage.acmp;
import defpackage.acmq;
import defpackage.acmv;
import defpackage.acmx;
import defpackage.aqsz;
import defpackage.arxd;
import defpackage.arxo;
import defpackage.asiu;
import defpackage.asnj;
import defpackage.enre;
import defpackage.enrv;
import defpackage.ensj;
import defpackage.enss;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import org.json.JSONArray;
import org.json.JSONException;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes2.dex */
public class FirstPartyDeviceRegistrationChimeraService extends Service implements acdy {
    public static final arxo a = new arxo("ProximityAuth", "FirstPartyRegistrationService");
    public acmx b;
    public aclq e;
    public Map f;
    private acdz i;
    private enrv j;
    private final IBinder g = new acmp(this);
    public int c = 0;
    private boolean h = true;
    public final Object d = new Object();

    public static acmp a(aqsz aqszVar, Context context) {
        if (!asiu.a().d(context, new Intent().setClassName(context, "com.google.android.gms.auth.proximity.firstparty.FirstPartyDeviceRegistrationService"), aqszVar, 1)) {
            return null;
        }
        try {
            return (acmp) aqszVar.b(5L, TimeUnit.SECONDS);
        } catch (InterruptedException | TimeoutException unused) {
            return null;
        }
    }

    public static void b(List list, Role role, PendingIntent pendingIntent, String str, Context context, boolean z) {
        Intent className = new Intent().setClassName(context, "com.google.android.gms.auth.proximity.firstparty.FirstPartyDeviceRegistrationService");
        JSONArray jSONArray = new JSONArray();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            jSONArray.put(asnj.b(arxd.n((RemoteDevice) it.next())));
        }
        className.putExtra("EXTRA_DEVICES_JSON", jSONArray.toString());
        className.putExtra("EXTRA_CALLING_PACKAGE", str);
        className.putExtra("EXTRA_CALLBACK_INTENT", pendingIntent);
        className.putExtra("EXTRA_ROLE", arxd.n(role));
        className.putExtra("EXTRA_REGISTER", z);
        context.startService(className);
    }

    private final void e() {
        final acmx acmxVar = this.b;
        c(acmxVar.d.get() ? ensj.i(Status.b) : acmxVar.f.submit(new Callable() { // from class: acmu
            @Override // java.util.concurrent.Callable
            public final Object call() {
                new ArrayList();
                acmx acmxVar2 = acmx.this;
                try {
                    List<SecureChannelSubscription> list = (List) acmxVar2.c.c().get();
                    acmxVar2.d.set(true);
                    for (SecureChannelSubscription secureChannelSubscription : list) {
                        Role role = new Role(secureChannelSubscription.b, secureChannelSubscription.c);
                        Iterator it = secureChannelSubscription.c().iterator();
                        while (it.hasNext()) {
                            acmxVar2.b.g((RemoteDevice) it.next(), role);
                        }
                        acmxVar2.e.incrementAndGet();
                    }
                    return Status.b;
                } catch (InterruptedException | ExecutionException unused) {
                    acmxVar2.d.set(true);
                    return Status.c;
                }
            }
        }));
        this.h = false;
    }

    public final void c(enss enssVar) {
        this.c++;
        ensj.t(enssVar, this.j, enre.a);
    }

    public final void d() {
        acmx acmxVar = this.b;
        if (acmxVar.d.get() && acmxVar.e.get() == 0 && this.c == 0) {
            stopSelf();
        }
    }

    @Override // com.google.android.chimera.Service
    public final IBinder onBind(Intent intent) {
        return this.g;
    }

    @Override // com.google.android.chimera.Service
    public final void onCreate() {
        super.onCreate();
        this.h = true;
        synchronized (this.d) {
            this.e = new aclq();
        }
        this.f = new HashMap();
        this.j = new acmo(this);
        this.b = new acmx();
        acdz a2 = acdz.a();
        this.i = a2;
        a2.d(this, new acmq(this));
    }

    @Override // com.google.android.chimera.Service
    public final void onDestroy() {
        this.i.f(this);
        synchronized (this.d) {
            this.e.a.clear();
        }
        final acmx acmxVar = this.b;
        acmxVar.f.submit(new Runnable() { // from class: acmr
            @Override // java.lang.Runnable
            public final void run() {
                acmx acmxVar2 = acmx.this;
                for (SecureChannelSubscription secureChannelSubscription : acmxVar2.d()) {
                    Role role = new Role(secureChannelSubscription.b, secureChannelSubscription.c);
                    Iterator it = secureChannelSubscription.c().iterator();
                    while (it.hasNext()) {
                        acmxVar2.b.h(((RemoteDevice) it.next()).b, role);
                    }
                }
                acmxVar2.e.set(0);
            }
        }, null);
        this.f.clear();
        super.onDestroy();
    }

    @Override // com.google.android.chimera.Service
    public final int onStartCommand(Intent intent, int i, int i2) {
        enss submit;
        if (intent == null) {
            a.h("Recovering from GmsCore crash.", new Object[0]);
            e();
            return 1;
        }
        if (!intent.hasExtra("EXTRA_REGISTER") || !intent.hasExtra("EXTRA_DEVICES_JSON") || !intent.hasExtra("EXTRA_ROLE") || !intent.hasExtra("EXTRA_CALLBACK_INTENT") || !intent.hasExtra("EXTRA_CALLING_PACKAGE")) {
            if (this.h && intent.getBooleanExtra("EXTRA_IS_INIT_INTENT", false)) {
                e();
                return 1;
            }
            d();
            return 1;
        }
        ArrayList arrayList = new ArrayList();
        try {
            JSONArray jSONArray = new JSONArray(intent.getStringExtra("EXTRA_DEVICES_JSON"));
            for (int i3 = 0; i3 < jSONArray.length(); i3++) {
                arrayList.add((RemoteDevice) arxd.a(asnj.e((String) jSONArray.get(i3)), RemoteDevice.CREATOR));
            }
            boolean booleanExtra = intent.getBooleanExtra("EXTRA_REGISTER", true);
            Role role = (Role) arxd.a(intent.getByteArrayExtra("EXTRA_ROLE"), Role.CREATOR);
            PendingIntent pendingIntent = (PendingIntent) intent.getParcelableExtra("EXTRA_CALLBACK_INTENT");
            String stringExtra = intent.getStringExtra("EXTRA_CALLING_PACKAGE");
            if (this.h) {
                e();
            }
            if (booleanExtra) {
                acmx acmxVar = this.b;
                submit = acmxVar.f.submit(new acmv(acmxVar, arrayList, role, pendingIntent, stringExtra, true));
            } else {
                acmx acmxVar2 = this.b;
                submit = acmxVar2.f.submit(new acmv(acmxVar2, arrayList, role, pendingIntent, stringExtra, false));
            }
            c(submit);
            return 1;
        } catch (JSONException e) {
            a.n("Failed to parse device list.", e, new Object[0]);
            d();
            return 1;
        }
    }
}
