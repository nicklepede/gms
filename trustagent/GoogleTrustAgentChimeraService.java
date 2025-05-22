package com.google.android.gms.trustagent;

import android.app.KeyguardManager;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.SharedPreferences;
import android.os.PowerManager;
import android.os.RemoteException;
import com.google.android.chimera.TrustAgentService;
import com.google.android.gms.chimera.modules.trustagent.AppContextProvider;
import com.google.android.gms.libs.punchclock.tracing.TracingBroadcastReceiver;
import com.google.android.gms.trustagent.trustlet.device.bluetooth.internal.BluetoothTrustletChimeraService;
import defpackage.auid;
import defpackage.ausn;
import defpackage.auub;
import defpackage.divw;
import defpackage.diwi;
import defpackage.dixk;
import defpackage.diyd;
import defpackage.diyh;
import defpackage.diyj;
import defpackage.djat;
import defpackage.djau;
import defpackage.djav;
import defpackage.djaw;
import defpackage.djax;
import defpackage.djay;
import defpackage.djaz;
import defpackage.djbb;
import defpackage.elgo;
import defpackage.elpg;
import defpackage.eluo;
import defpackage.emus;
import defpackage.fgrc;
import defpackage.ind;
import j$.util.Objects;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes7.dex */
public class GoogleTrustAgentChimeraService extends TrustAgentService {
    public static final ausn a = ausn.b("TrustAgent", auid.TRUSTAGENT);
    public djaw b;
    public SharedPreferences c;
    private final dixk d = new divw(this);
    private final diwi e = diwi.a();
    private final Context f = AppContextProvider.a();
    private BroadcastReceiver g;
    private boolean h;

    @Override // com.google.android.chimera.TrustAgentService
    public final boolean onConfigure(List list) {
        diyj a2 = diyj.a();
        boolean z = a2.a;
        boolean z2 = a2.b;
        boolean z3 = a2.c;
        boolean z4 = a2.d;
        HashSet hashSet = new HashSet(a2.e);
        int i = a2.f;
        a2.b();
        if (z == a2.a && z2 == a2.b && z3 == a2.c && z4 == a2.d && hashSet.equals(a2.e) && i == a2.f) {
            return true;
        }
        djaw djawVar = this.b;
        synchronized (djawVar.d) {
            diyj diyjVar = djawVar.k;
            int i2 = diyjVar.b() ? diyjVar.f : 240;
            djat djatVar = djawVar.l;
            if (djatVar != null) {
                ((eluo) ((eluo) djat.a.h()).ai((char) 11650)).z("updateIdelThreshold to %s", i2);
                djatVar.g = i2;
            }
        }
        djawVar.g();
        djawVar.k("Device Policy changed");
        Iterator it = djawVar.h.iterator();
        while (it.hasNext()) {
            try {
                ((djau) it.next()).e.b();
            } catch (RemoteException e) {
                ((eluo) ((eluo) ((eluo) djau.a.j()).s(e)).ai((char) 11657)).x("RemoteException in onDevicePolicyChanged");
            }
        }
        return true;
    }

    @Override // com.google.android.chimera.TrustAgentService, com.google.android.chimera.Service
    public final void onCreate() {
        super.onCreate();
        djaz djazVar = new djaz(this);
        elgo elgoVar = djazVar.a;
        for (int i = 0; i < ((elpg) elgoVar).c; i++) {
            djay djayVar = (djay) elgoVar.get(i);
            djax djaxVar = new djax(djazVar.c, new djbb(), djayVar.a, djayVar.b);
            synchronized (djazVar.b) {
                djazVar.d.add(djaxVar);
            }
        }
        djaw b = djaw.b();
        this.b = b;
        synchronized (b.d) {
            b.q = djazVar;
            diyj diyjVar = b.k;
            boolean b2 = diyjVar.b();
            if (b.l == null) {
                b.l = new djat(b.e, b);
            }
            int i2 = b2 ? diyjVar.f : 240;
            djat djatVar = b.l;
            if (djatVar != null && !auub.f()) {
                djatVar.f = true;
                djatVar.g = i2;
                IntentFilter intentFilter = new IntentFilter(djat.b);
                Context context = djatVar.d;
                ind.b(context, djatVar.j, intentFilter, 4);
                IntentFilter intentFilter2 = new IntentFilter("android.intent.action.USER_PRESENT");
                intentFilter2.addAction("android.intent.action.SCREEN_OFF");
                context.registerReceiver(djatVar.i, intentFilter2);
                PowerManager powerManager = (PowerManager) context.getSystemService("power");
                if (powerManager == null || !powerManager.isInteractive()) {
                    djatVar.a();
                }
            }
            djav djavVar = b.j;
            b.c(djavVar);
            synchronized (djavVar.a) {
                djavVar.b = true;
                djavVar.f("is_trustagent_on", true);
            }
        }
        IntentFilter intentFilter3 = new IntentFilter("android.intent.action.USER_PRESENT");
        synchronized (b.d) {
            ind.b(b.e.getApplicationContext(), b.f, intentFilter3, 2);
        }
        this.b.c(this.d);
        this.b.m();
        this.b.k("finish TrustletRegistration");
        diwi diwiVar = this.e;
        synchronized (diwiVar.c) {
            diwiVar.b = false;
        }
        Context context2 = this.f;
        this.c = diyh.a(context2);
        if (this.g != null) {
            ((eluo) a.j()).x("Registering broadcast receiver more than once.");
            return;
        }
        IntentFilter intentFilter4 = new IntentFilter();
        intentFilter4.addAction("android.intent.action.USER_PRESENT");
        intentFilter4.addAction("android.intent.action.USER_BACKGROUND");
        TracingBroadcastReceiver tracingBroadcastReceiver = new TracingBroadcastReceiver() { // from class: com.google.android.gms.trustagent.GoogleTrustAgentChimeraService.1
            @Override // com.google.android.gms.libs.punchclock.tracing.TracingBroadcastReceiver
            public final void jP(Context context3, Intent intent) {
                Map map;
                String action = intent.getAction();
                if (!Objects.equals(action, "android.intent.action.USER_PRESENT")) {
                    if (Objects.equals(action, "android.intent.action.USER_BACKGROUND")) {
                        ((eluo) GoogleTrustAgentChimeraService.a.h()).x("User switched (ACTION_USER_BACKGROUND)");
                        djaw djawVar = GoogleTrustAgentChimeraService.this.b;
                        synchronized (djawVar.d) {
                            if (djawVar.o) {
                                return;
                            }
                            djawVar.o = true;
                            djawVar.k("Revoking trust and requiring user authentication.");
                            djawVar.i();
                            djawVar.h();
                            return;
                        }
                    }
                    return;
                }
                KeyguardManager keyguardManager = (KeyguardManager) context3.getSystemService("keyguard");
                GoogleTrustAgentChimeraService googleTrustAgentChimeraService = GoogleTrustAgentChimeraService.this;
                if (!googleTrustAgentChimeraService.c.getBoolean("auth_trust_agent_pref_first_notification_shown_", false) && googleTrustAgentChimeraService.b.l() && keyguardManager != null && keyguardManager.isKeyguardSecure()) {
                    Intent intent2 = new Intent();
                    intent2.setClassName(context3, "com.google.android.gms.trustagent.GoogleTrustAgentFirstNotificationActivity");
                    intent2.setFlags(335544320);
                    djaw djawVar2 = googleTrustAgentChimeraService.b;
                    synchronized (djawVar2.d) {
                        map = djawVar2.i;
                    }
                    HashMap hashMap = new HashMap();
                    hashMap.put("Bluetooth", BluetoothTrustletChimeraService.class.getName());
                    hashMap.put("Place", "Place");
                    hashMap.put("PhonePosition", "PhonePosition");
                    Iterator it = hashMap.entrySet().iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        Map.Entry entry = (Map.Entry) it.next();
                        String str = (String) entry.getKey();
                        if (map.containsKey(str)) {
                            intent2.putExtra("type", (String) entry.getValue());
                            intent2.putExtra("name", (String) map.get(str));
                            context3.startActivity(intent2);
                            GoogleTrustAgentChimeraService.this.c.edit().putBoolean("auth_trust_agent_pref_first_notification_shown_", true).apply();
                            break;
                        }
                    }
                }
                if (auub.f()) {
                    GoogleTrustAgentChimeraService googleTrustAgentChimeraService2 = GoogleTrustAgentChimeraService.this;
                    if (googleTrustAgentChimeraService2.b.l()) {
                        googleTrustAgentChimeraService2.grantTrust((CharSequence) "onTrustTimeout() grants trust again", 0L, false);
                    }
                }
            }
        };
        this.g = tracingBroadcastReceiver;
        context2.registerReceiver(tracingBroadcastReceiver, intentFilter4);
    }

    @Override // com.google.android.chimera.Service
    public final void onDestroy() {
        this.b.f(this.d);
        djaw djawVar = this.b;
        djawVar.g();
        synchronized (djawVar.d) {
            djat djatVar = djawVar.l;
            if (djatVar != null && djatVar.f) {
                djatVar.f = false;
                Context context = djatVar.d;
                context.unregisterReceiver(djatVar.j);
                context.unregisterReceiver(djatVar.i);
            }
            djav djavVar = djawVar.j;
            djawVar.f(djavVar);
            synchronized (djavVar.a) {
                djavVar.b = false;
                djavVar.f("is_trustagent_on", false);
            }
        }
        synchronized (djawVar.d) {
            djawVar.e.getApplicationContext().unregisterReceiver(djawVar.f);
        }
        synchronized (djaw.b) {
            djaw.c = new WeakReference(null);
        }
        diwi diwiVar = this.e;
        synchronized (diwiVar.c) {
            diwiVar.b = true;
        }
        BroadcastReceiver broadcastReceiver = this.g;
        if (broadcastReceiver == null) {
            ((eluo) a.j()).x("Attempting to unregister broadcast receiver when none is registered.");
        } else {
            this.f.unregisterReceiver(broadcastReceiver);
            this.g = null;
        }
        super.onDestroy();
    }

    @Override // com.google.android.chimera.TrustAgentService
    public final void onDeviceUnlockLockout(long j) {
        this.h = true;
    }

    @Override // com.google.android.chimera.TrustAgentService
    public final void onDeviceUnlocked() {
        if (this.h) {
            this.h = false;
            djaw djawVar = this.b;
            djawVar.g();
            djawVar.k("Device unlocked after lockout");
        }
    }

    @Override // com.google.android.chimera.TrustAgentService
    public final void onTrustTimeout() {
        if (!this.b.l()) {
            ((eluo) a.h()).x("Trust not reviewed");
        } else if (auub.f()) {
            this.b.a();
        } else {
            ((eluo) a.h()).x("Trust granted again");
            grantTrust("onTrustTimeout() grants trust again", 0L, false);
        }
    }

    @Override // com.google.android.chimera.TrustAgentService, com.google.android.chimera.Service
    public final boolean onUnbind(Intent intent) {
        djaw djawVar = this.b;
        synchronized (djawVar.d) {
            djawVar.m = false;
        }
        ((eluo) a.h()).x("onUnbind() set internal trust state to false");
        return super.onUnbind(intent);
    }

    @Override // com.google.android.chimera.TrustAgentService
    public final void onUnlockAttempt(boolean z) {
        fgrc v = emus.a.v();
        boolean isKeyguardSecure = ((KeyguardManager) this.f.getSystemService("keyguard")).isKeyguardSecure();
        if (!v.b.L()) {
            v.U();
        }
        emus emusVar = (emus) v.b;
        emusVar.b |= 8;
        emusVar.f = isKeyguardSecure;
        diyd.a((emus) v.Q());
        diwi diwiVar = this.e;
        if (z) {
            diwiVar.b();
        }
    }
}
