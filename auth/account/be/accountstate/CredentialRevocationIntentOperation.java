package com.google.android.gms.auth.account.be.accountstate;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.SharedPreferences;
import android.util.Log;
import com.google.android.chimera.IntentOperation;
import com.google.android.gms.libs.punchclock.tracing.TracingBroadcastReceiver;
import defpackage.dvni;
import defpackage.eiig;
import defpackage.fkkz;
import defpackage.iln;
import defpackage.vfn;
import defpackage.vfv;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Locale;
import java.util.Set;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes2.dex */
public class CredentialRevocationIntentOperation extends IntentOperation {
    private static BroadcastReceiver a;
    private vfn b;

    /* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
    public class ConnectivityActionBroadcastReceiver extends TracingBroadcastReceiver {
        public ConnectivityActionBroadcastReceiver() {
            super("auth_account");
        }

        @Override // com.google.android.gms.libs.punchclock.tracing.TracingBroadcastReceiver
        public final void jz(Context context, Intent intent) {
            Intent startIntent;
            String action = intent.getAction();
            if (action == null || !action.equals("android.net.conn.CONNECTIVITY_CHANGE") || (startIntent = IntentOperation.getStartIntent(context, CredentialRevocationIntentOperation.class, "com.google.android.gms.auth.account.be.accountstate.revoke_scheduled_credentials_action")) == null) {
                return;
            }
            context.startService(startIntent);
        }
    }

    private final Set b() {
        HashSet hashSet = new HashSet(Arrays.asList(a().getString("key_revocation_set_string", "").split(",")));
        hashSet.remove("");
        return hashSet;
    }

    private final void c(String str) {
        Set b = b();
        b.remove(str);
        g(b);
        if (!b.isEmpty() || a == null) {
            return;
        }
        try {
            Context applicationContext = getApplicationContext();
            BroadcastReceiver broadcastReceiver = a;
            eiig.x(broadcastReceiver);
            applicationContext.unregisterReceiver(broadcastReceiver);
        } catch (IllegalArgumentException unused) {
        }
        a = null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:46:0x00d0, code lost:
    
        r0 = r14.c;
        r4 = r14.b;
        r0 = r0.a;
        r8 = new java.lang.StringBuilder("RevokeDevice");
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00dd, code lost:
    
        if (r4 == null) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00df, code lost:
    
        r4 = defpackage.vix.b(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00ec, code lost:
    
        if (r8.indexOf("?") == (-1)) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00ee, code lost:
    
        r8.append('&');
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00f9, code lost:
    
        r8.append("user_id");
        r8.append('=');
        r8.append(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x00f4, code lost:
    
        r8.append('?');
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x011e, code lost:
    
        if (((com.google.android.gms.auth.account.gencode.server.api.RevokeDevice) r0.a.r(r9, r8.toString(), null, com.google.android.gms.auth.account.gencode.server.api.RevokeDevice.class)).a.contains(2) != false) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0120, code lost:
    
        android.util.Log.w("Auth", java.lang.String.format(java.util.Locale.US, "[RevokeCredentialOperation] Device revocation failed.", new java.lang.Object[0]));
        r12.a("FAILED");
        r0 = defpackage.abau.BAD_REQUEST;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0133, code lost:
    
        r12.a("SUCCESS");
        android.util.Log.w("Auth", "[RevokeCredentialOperation] revoked token.");
        defpackage.vba.r(2401);
        r0 = defpackage.abau.SUCCESS;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void d(java.lang.String r18) {
        /*
            Method dump skipped, instructions count: 545
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.auth.account.be.accountstate.CredentialRevocationIntentOperation.d(java.lang.String):void");
    }

    private final void e() {
        Iterator it = b().iterator();
        while (it.hasNext()) {
            d((String) it.next());
        }
    }

    private final void f(String str) {
        Set b = b();
        b.add(str);
        g(b);
        if (a == null) {
            a = new ConnectivityActionBroadcastReceiver();
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
            iln.b(getApplicationContext(), a, intentFilter, 2);
        }
    }

    private final void g(Set set) {
        StringBuilder sb = new StringBuilder();
        Iterator it = set.iterator();
        boolean z = true;
        while (it.hasNext()) {
            String str = (String) it.next();
            if (!z) {
                sb.append(",");
            }
            sb.append(str);
            z = false;
        }
        SharedPreferences.Editor edit = a().edit();
        edit.putString("key_revocation_set_string", sb.toString());
        edit.apply();
    }

    final SharedPreferences a() {
        return getApplicationContext().getSharedPreferences("credentials_revocation_storage", 0);
    }

    @Override // com.google.android.chimera.IntentOperation
    public final void onHandleIntent(Intent intent) {
        char c;
        dvni dvniVar = vfv.a;
        if (fkkz.l()) {
            String action = intent.getAction();
            if (action == null) {
                Log.w("Auth", String.format(Locale.US, "[CredentialRevocationIntentOperation] Received null action: %s", null));
                return;
            }
            int hashCode = action.hashCode();
            if (hashCode == -2143707069) {
                if (action.equals("com.google.android.gms.auth.account.be.accountstate.revoke_credential_action")) {
                    c = 0;
                }
                c = 65535;
            } else if (hashCode != -226057370) {
                if (hashCode == 798292259 && action.equals("android.intent.action.BOOT_COMPLETED")) {
                    c = 1;
                }
                c = 65535;
            } else {
                if (action.equals("com.google.android.gms.auth.account.be.accountstate.revoke_scheduled_credentials_action")) {
                    c = 2;
                }
                c = 65535;
            }
            if (c == 0) {
                String stringExtra = intent.getStringExtra("accountId");
                if (stringExtra != null) {
                    d(stringExtra);
                    return;
                }
                return;
            }
            if (c == 1) {
                e();
            } else if (c != 2) {
                Log.w("Auth", String.format(Locale.US, "[CredentialRevocationIntentOperation] Received unknown action: %s", action));
            } else {
                e();
            }
        }
    }
}
