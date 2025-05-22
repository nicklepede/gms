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
import defpackage.aedy;
import defpackage.aedz;
import defpackage.aelq;
import defpackage.aemo;
import defpackage.aemp;
import defpackage.aemq;
import defpackage.aemv;
import defpackage.aemx;
import defpackage.asvp;
import defpackage.atzs;
import defpackage.auad;
import defpackage.aumo;
import defpackage.aurd;
import defpackage.eqex;
import defpackage.eqfo;
import defpackage.eqgc;
import defpackage.eqgl;
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

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes2.dex */
public class FirstPartyDeviceRegistrationChimeraService extends Service implements aedy {
    public static final auad a = new auad("ProximityAuth", "FirstPartyRegistrationService");
    public aemx b;
    public aelq e;
    public Map f;
    private aedz i;
    private eqfo j;
    private final IBinder g = new aemp(this);
    public int c = 0;
    private boolean h = true;
    public final Object d = new Object();

    public static aemp a(asvp asvpVar, Context context) {
        if (!aumo.a().d(context, new Intent().setClassName(context, "com.google.android.gms.auth.proximity.firstparty.FirstPartyDeviceRegistrationService"), asvpVar, 1)) {
            return null;
        }
        try {
            return (aemp) asvpVar.b(5L, TimeUnit.SECONDS);
        } catch (InterruptedException | TimeoutException unused) {
            return null;
        }
    }

    public static void b(List list, Role role, PendingIntent pendingIntent, String str, Context context, boolean z) {
        Intent className = new Intent().setClassName(context, "com.google.android.gms.auth.proximity.firstparty.FirstPartyDeviceRegistrationService");
        JSONArray jSONArray = new JSONArray();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            jSONArray.put(aurd.b(atzs.n((RemoteDevice) it.next())));
        }
        className.putExtra("EXTRA_DEVICES_JSON", jSONArray.toString());
        className.putExtra("EXTRA_CALLING_PACKAGE", str);
        className.putExtra("EXTRA_CALLBACK_INTENT", pendingIntent);
        className.putExtra("EXTRA_ROLE", atzs.n(role));
        className.putExtra("EXTRA_REGISTER", z);
        context.startService(className);
    }

    private final void e() {
        final aemx aemxVar = this.b;
        c(aemxVar.d.get() ? eqgc.i(Status.b) : aemxVar.f.submit(new Callable() { // from class: aemu
            @Override // java.util.concurrent.Callable
            public final Object call() {
                new ArrayList();
                aemx aemxVar2 = aemx.this;
                try {
                    List<SecureChannelSubscription> list = (List) aemxVar2.c.c().get();
                    aemxVar2.d.set(true);
                    for (SecureChannelSubscription secureChannelSubscription : list) {
                        Role role = new Role(secureChannelSubscription.b, secureChannelSubscription.c);
                        Iterator it = secureChannelSubscription.c().iterator();
                        while (it.hasNext()) {
                            aemxVar2.b.g((RemoteDevice) it.next(), role);
                        }
                        aemxVar2.e.incrementAndGet();
                    }
                    return Status.b;
                } catch (InterruptedException | ExecutionException unused) {
                    aemxVar2.d.set(true);
                    return Status.c;
                }
            }
        }));
        this.h = false;
    }

    public final void c(eqgl eqglVar) {
        this.c++;
        eqgc.t(eqglVar, this.j, eqex.a);
    }

    public final void d() {
        aemx aemxVar = this.b;
        if (aemxVar.d.get() && aemxVar.e.get() == 0 && this.c == 0) {
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
            this.e = new aelq();
        }
        this.f = new HashMap();
        this.j = new aemo(this);
        this.b = new aemx();
        aedz a2 = aedz.a();
        this.i = a2;
        a2.d(this, new aemq(this));
    }

    @Override // com.google.android.chimera.Service
    public final void onDestroy() {
        this.i.f(this);
        synchronized (this.d) {
            this.e.a.clear();
        }
        final aemx aemxVar = this.b;
        aemxVar.f.submit(new Runnable() { // from class: aemr
            @Override // java.lang.Runnable
            public final void run() {
                aemx aemxVar2 = aemx.this;
                for (SecureChannelSubscription secureChannelSubscription : aemxVar2.d()) {
                    Role role = new Role(secureChannelSubscription.b, secureChannelSubscription.c);
                    Iterator it = secureChannelSubscription.c().iterator();
                    while (it.hasNext()) {
                        aemxVar2.b.h(((RemoteDevice) it.next()).b, role);
                    }
                }
                aemxVar2.e.set(0);
            }
        }, null);
        this.f.clear();
        super.onDestroy();
    }

    @Override // com.google.android.chimera.Service
    public final int onStartCommand(Intent intent, int i, int i2) {
        eqgl submit;
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
                arrayList.add((RemoteDevice) atzs.a(aurd.e((String) jSONArray.get(i3)), RemoteDevice.CREATOR));
            }
            boolean booleanExtra = intent.getBooleanExtra("EXTRA_REGISTER", true);
            Role role = (Role) atzs.a(intent.getByteArrayExtra("EXTRA_ROLE"), Role.CREATOR);
            PendingIntent pendingIntent = (PendingIntent) intent.getParcelableExtra("EXTRA_CALLBACK_INTENT");
            String stringExtra = intent.getStringExtra("EXTRA_CALLING_PACKAGE");
            if (this.h) {
                e();
            }
            if (booleanExtra) {
                aemx aemxVar = this.b;
                submit = aemxVar.f.submit(new aemv(aemxVar, arrayList, role, pendingIntent, stringExtra, true));
            } else {
                aemx aemxVar2 = this.b;
                submit = aemxVar2.f.submit(new aemv(aemxVar2, arrayList, role, pendingIntent, stringExtra, false));
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
