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
import defpackage.asej;
import defpackage.asot;
import defpackage.asqh;
import defpackage.dgkr;
import defpackage.dgld;
import defpackage.dgmf;
import defpackage.dgmy;
import defpackage.dgnc;
import defpackage.dgne;
import defpackage.dgpo;
import defpackage.dgpp;
import defpackage.dgpq;
import defpackage.dgpr;
import defpackage.dgps;
import defpackage.dgpt;
import defpackage.dgpu;
import defpackage.dgpw;
import defpackage.eitj;
import defpackage.ejcb;
import defpackage.ejhf;
import defpackage.ekhg;
import defpackage.fecj;
import defpackage.iln;
import j$.util.Objects;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes7.dex */
public class GoogleTrustAgentChimeraService extends TrustAgentService {
    public static final asot a = asot.b("TrustAgent", asej.TRUSTAGENT);
    public dgpr b;
    public SharedPreferences c;
    private final dgmf d = new dgkr(this);
    private final dgld e = dgld.a();
    private final Context f = AppContextProvider.a();
    private BroadcastReceiver g;
    private boolean h;

    @Override // com.google.android.chimera.TrustAgentService
    public final boolean onConfigure(List list) {
        dgne a2 = dgne.a();
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
        dgpr dgprVar = this.b;
        synchronized (dgprVar.d) {
            dgne dgneVar = dgprVar.k;
            int i2 = dgneVar.b() ? dgneVar.f : 240;
            dgpo dgpoVar = dgprVar.l;
            if (dgpoVar != null) {
                ((ejhf) ((ejhf) dgpo.a.h()).ah((char) 11647)).z("updateIdelThreshold to %s", i2);
                dgpoVar.g = i2;
            }
        }
        dgprVar.g();
        dgprVar.k("Device Policy changed");
        Iterator it = dgprVar.h.iterator();
        while (it.hasNext()) {
            try {
                ((dgpp) it.next()).e.b();
            } catch (RemoteException e) {
                ((ejhf) ((ejhf) ((ejhf) dgpp.a.j()).s(e)).ah((char) 11654)).x("RemoteException in onDevicePolicyChanged");
            }
        }
        return true;
    }

    @Override // com.google.android.chimera.TrustAgentService, com.google.android.chimera.Service
    public final void onCreate() {
        super.onCreate();
        dgpu dgpuVar = new dgpu(this);
        eitj eitjVar = dgpuVar.a;
        for (int i = 0; i < ((ejcb) eitjVar).c; i++) {
            dgpt dgptVar = (dgpt) eitjVar.get(i);
            dgps dgpsVar = new dgps(dgpuVar.c, new dgpw(), dgptVar.a, dgptVar.b);
            synchronized (dgpuVar.b) {
                dgpuVar.d.add(dgpsVar);
            }
        }
        dgpr b = dgpr.b();
        this.b = b;
        synchronized (b.d) {
            b.q = dgpuVar;
            dgne dgneVar = b.k;
            boolean b2 = dgneVar.b();
            if (b.l == null) {
                b.l = new dgpo(b.e, b);
            }
            int i2 = b2 ? dgneVar.f : 240;
            dgpo dgpoVar = b.l;
            if (dgpoVar != null && !asqh.f()) {
                dgpoVar.f = true;
                dgpoVar.g = i2;
                IntentFilter intentFilter = new IntentFilter(dgpo.b);
                Context context = dgpoVar.d;
                iln.b(context, dgpoVar.j, intentFilter, 4);
                IntentFilter intentFilter2 = new IntentFilter("android.intent.action.USER_PRESENT");
                intentFilter2.addAction("android.intent.action.SCREEN_OFF");
                context.registerReceiver(dgpoVar.i, intentFilter2);
                PowerManager powerManager = (PowerManager) context.getSystemService("power");
                if (powerManager == null || !powerManager.isInteractive()) {
                    dgpoVar.a();
                }
            }
            dgpq dgpqVar = b.j;
            b.c(dgpqVar);
            synchronized (dgpqVar.a) {
                dgpqVar.b = true;
                dgpqVar.f("is_trustagent_on", true);
            }
        }
        IntentFilter intentFilter3 = new IntentFilter("android.intent.action.USER_PRESENT");
        synchronized (b.d) {
            iln.b(b.e.getApplicationContext(), b.f, intentFilter3, 2);
        }
        this.b.c(this.d);
        this.b.m();
        this.b.k("finish TrustletRegistration");
        dgld dgldVar = this.e;
        synchronized (dgldVar.c) {
            dgldVar.b = false;
        }
        Context context2 = this.f;
        this.c = dgnc.a(context2);
        if (this.g != null) {
            ((ejhf) a.j()).x("Registering broadcast receiver more than once.");
            return;
        }
        IntentFilter intentFilter4 = new IntentFilter();
        intentFilter4.addAction("android.intent.action.USER_PRESENT");
        intentFilter4.addAction("android.intent.action.USER_BACKGROUND");
        TracingBroadcastReceiver tracingBroadcastReceiver = new TracingBroadcastReceiver() { // from class: com.google.android.gms.trustagent.GoogleTrustAgentChimeraService.1
            @Override // com.google.android.gms.libs.punchclock.tracing.TracingBroadcastReceiver
            public final void jz(Context context3, Intent intent) {
                Map map;
                String action = intent.getAction();
                if (!Objects.equals(action, "android.intent.action.USER_PRESENT")) {
                    if (Objects.equals(action, "android.intent.action.USER_BACKGROUND")) {
                        ((ejhf) GoogleTrustAgentChimeraService.a.h()).x("User switched (ACTION_USER_BACKGROUND)");
                        dgpr dgprVar = GoogleTrustAgentChimeraService.this.b;
                        synchronized (dgprVar.d) {
                            if (dgprVar.o) {
                                return;
                            }
                            dgprVar.o = true;
                            dgprVar.k("Revoking trust and requiring user authentication.");
                            dgprVar.i();
                            dgprVar.h();
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
                    dgpr dgprVar2 = googleTrustAgentChimeraService.b;
                    synchronized (dgprVar2.d) {
                        map = dgprVar2.i;
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
                if (asqh.f()) {
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
        dgpr dgprVar = this.b;
        dgprVar.g();
        synchronized (dgprVar.d) {
            dgpo dgpoVar = dgprVar.l;
            if (dgpoVar != null && dgpoVar.f) {
                dgpoVar.f = false;
                Context context = dgpoVar.d;
                context.unregisterReceiver(dgpoVar.j);
                context.unregisterReceiver(dgpoVar.i);
            }
            dgpq dgpqVar = dgprVar.j;
            dgprVar.f(dgpqVar);
            synchronized (dgpqVar.a) {
                dgpqVar.b = false;
                dgpqVar.f("is_trustagent_on", false);
            }
        }
        synchronized (dgprVar.d) {
            dgprVar.e.getApplicationContext().unregisterReceiver(dgprVar.f);
        }
        synchronized (dgpr.b) {
            dgpr.c = new WeakReference(null);
        }
        dgld dgldVar = this.e;
        synchronized (dgldVar.c) {
            dgldVar.b = true;
        }
        BroadcastReceiver broadcastReceiver = this.g;
        if (broadcastReceiver == null) {
            ((ejhf) a.j()).x("Attempting to unregister broadcast receiver when none is registered.");
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
            dgpr dgprVar = this.b;
            dgprVar.g();
            dgprVar.k("Device unlocked after lockout");
        }
    }

    @Override // com.google.android.chimera.TrustAgentService
    public final void onTrustTimeout() {
        if (!this.b.l()) {
            ((ejhf) a.h()).x("Trust not reviewed");
        } else if (asqh.f()) {
            this.b.a();
        } else {
            ((ejhf) a.h()).x("Trust granted again");
            grantTrust("onTrustTimeout() grants trust again", 0L, false);
        }
    }

    @Override // com.google.android.chimera.TrustAgentService, com.google.android.chimera.Service
    public final boolean onUnbind(Intent intent) {
        dgpr dgprVar = this.b;
        synchronized (dgprVar.d) {
            dgprVar.m = false;
        }
        ((ejhf) a.h()).x("onUnbind() set internal trust state to false");
        return super.onUnbind(intent);
    }

    @Override // com.google.android.chimera.TrustAgentService
    public final void onUnlockAttempt(boolean z) {
        fecj v = ekhg.a.v();
        boolean isKeyguardSecure = ((KeyguardManager) this.f.getSystemService("keyguard")).isKeyguardSecure();
        if (!v.b.L()) {
            v.U();
        }
        ekhg ekhgVar = (ekhg) v.b;
        ekhgVar.b |= 8;
        ekhgVar.f = isKeyguardSecure;
        dgmy.a((ekhg) v.Q());
        dgld dgldVar = this.e;
        if (z) {
            dgldVar.b();
        }
    }
}
