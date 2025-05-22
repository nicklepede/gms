package com.google.android.gms.auth.authzen.cryptauth;

import android.accounts.Account;
import android.content.Intent;
import android.content.SharedPreferences;
import android.net.NetworkInfo;
import android.os.SystemClock;
import com.google.android.chimera.IntentOperation;
import defpackage.abts;
import defpackage.abtu;
import defpackage.abtv;
import defpackage.auad;
import defpackage.aumn;
import defpackage.aurp;
import defpackage.wjw;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes2.dex */
public class DeviceStateSyncManager$CheckStateEventIntentOperation extends IntentOperation {
    @Override // com.google.android.chimera.IntentOperation
    public final void onHandleIntent(Intent intent) {
        JSONObject jSONObject;
        auad auadVar = abts.h;
        auadVar.j("Received %s event", intent.getAction());
        if (!intent.getAction().equals("com.google.android.gms.auth.authzen.cryptauth.DEVICE_STATE_CHECK_DELAY_COMPLETE")) {
            auadVar.j("Delaying device state check.", new Object[0]);
            new aumn(getApplicationContext()).d("DeviceStateSyncManager", 3, SystemClock.elapsedRealtime() + 15000, IntentOperation.getPendingIntent(this, DeviceStateSyncManager$CheckStateEventIntentOperation.class, new Intent("com.google.android.gms.auth.authzen.cryptauth.DEVICE_STATE_CHECK_DELAY_COMPLETE"), 0, 134217728), getPackageName());
            return;
        }
        auadVar.j("Delay complete, performing device state check.", new Object[0]);
        abts a = abts.a(this);
        abtv abtvVar = a.g;
        List a2 = abtvVar.a();
        Long valueOf = a2.isEmpty() ? null : Long.valueOf(((abtu) a2.get(a2.size() - 1)).a);
        aurp aurpVar = a.a;
        long currentTimeMillis = System.currentTimeMillis();
        if (valueOf != null) {
            long longValue = currentTimeMillis - valueOf.longValue();
            if (longValue < 0) {
                auadVar.m("Invalid timestamp recorded, resetting history.", new Object[0]);
                abtvVar.b();
            } else if (longValue < 30000) {
                abts.h.h("Skipping sync since last one was %dms ago.", Long.valueOf(longValue));
                return;
            }
        }
        boolean b = a.b.b();
        List a3 = abtvVar.a();
        if (a3.isEmpty()) {
            a3.add(new abtu(currentTimeMillis, b, 1));
        } else {
            abtu abtuVar = (abtu) a3.get(a3.size() - 1);
            if (abtuVar.b == b) {
                a3.remove(a3.size() - 1);
                a3.add(new abtu(currentTimeMillis, b, abtuVar.c + 1));
            } else {
                a3.add(new abtu(currentTimeMillis, b, 1));
            }
        }
        if (a3.size() > 5) {
            a3.remove(0);
        }
        JSONArray jSONArray = new JSONArray();
        Iterator it = a3.iterator();
        while (true) {
            if (it.hasNext()) {
                abtu abtuVar2 = (abtu) it.next();
                try {
                    jSONObject = new JSONObject();
                    jSONObject.put("timestamp_millis", abtuVar2.a);
                    jSONObject.put("is_secure", abtuVar2.b);
                    jSONObject.put("count", abtuVar2.c);
                } catch (JSONException e) {
                    abtv.b.g("Unable to convert to JSON", e, new Object[0]);
                    jSONObject = null;
                }
                if (jSONObject == null) {
                    break;
                } else {
                    jSONArray.put(jSONObject);
                }
            } else if (abtvVar.a.edit().putString("screenlock_state_history", jSONArray.toString()).commit()) {
                NetworkInfo activeNetworkInfo = a.d.getActiveNetworkInfo();
                if (activeNetworkInfo == null || !activeNetworkInfo.isConnected()) {
                    abts.h.j("No network connectivity. Skipping sync.", new Object[0]);
                    return;
                }
                abtv abtvVar2 = a.g;
                List a4 = abtvVar2.a();
                if (a4.size() >= 5) {
                    abtu abtuVar3 = (abtu) a4.get(a4.size() - 1);
                    if (abtuVar3.a - ((abtu) a4.get(0)).a <= 172800000 && abtuVar3.c < 5) {
                        abts.h.m("Screenlock state not reliable, skipping sync with server.", new Object[0]);
                        return;
                    }
                }
                SharedPreferences sharedPreferences = abtvVar2.a;
                Boolean valueOf2 = sharedPreferences.contains("acknowledged_secure_lock_state") ? Boolean.valueOf(sharedPreferences.getBoolean("acknowledged_secure_lock_state", false)) : null;
                if (valueOf2 != null && b == valueOf2.booleanValue()) {
                    abts.h.h("The server is in sync with current state. Nothing to do", new Object[0]);
                    return;
                }
                abts.h.j("Syncing device state with the server", new Object[0]);
                Iterator it2 = a.e.a().iterator();
                boolean z = true;
                while (true) {
                    if (it2.hasNext()) {
                        Account account = (Account) it2.next();
                        try {
                        } catch (wjw unused) {
                            abts.h.h("Invalid credentials for account %s. Ignoring account.", auad.q(account.name));
                        }
                        if (a.f.a(account, 3) == null) {
                            abts.h.h("Network unreliable. Skipping sync.", new Object[0]);
                            break;
                        }
                        boolean f = a.c.f(300, account.name, 9, 3);
                        z &= f;
                        if (!f) {
                            abts.h.m("Updating device state failed for account %s.", auad.q(account.name));
                        }
                    } else if (z) {
                        abts.h.h("Device state updated successfully.", new Object[0]);
                        boolean b2 = a.b.b();
                        if (b2 != b) {
                            a.g.a.edit().remove("acknowledged_secure_lock_state").commit();
                            return;
                        } else {
                            a.g.a.edit().putBoolean("acknowledged_secure_lock_state", b2).commit();
                            return;
                        }
                    }
                }
                abts.h.h("Device state failed for at least one account.", new Object[0]);
                return;
            }
        }
        abts.h.f("Failed to write to SharedPreferences, skipping screenlock check.", new Object[0]);
    }
}
