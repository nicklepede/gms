package com.google.android.gms.update.control;

import android.content.Intent;
import android.content.IntentFilter;
import android.os.IBinder;
import com.google.android.chimera.Service;
import defpackage.arxo;
import defpackage.dhfp;
import defpackage.dhgn;
import defpackage.dhjt;
import j$.util.Objects;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes7.dex */
public final class ChimeraSystemUpdatePersistentListenerService extends Service {
    public static final arxo a = dhjt.d("ChimeraSystemUpdatePersistentListenerService");
    private final HashMap b = new HashMap();

    @Override // com.google.android.chimera.Service
    public final IBinder onBind(Intent intent) {
        return null;
    }

    @Override // com.google.android.chimera.Service
    public final int onStartCommand(Intent intent, int i, int i2) {
        if (intent != null) {
            String stringExtra = intent.getStringExtra("command");
            String stringExtra2 = intent.getStringExtra("target_action");
            String stringExtra3 = intent.getStringExtra("request_id");
            if (dhgn.c()) {
                a.h("Start (command: %s, action: %s, request ID: %s", stringExtra, stringExtra2, stringExtra3);
            }
            if (Objects.equals(stringExtra, "stop_all_listeners")) {
                if (dhgn.c()) {
                    a.h("Got request to unregister all broadcast receivers", new Object[0]);
                }
                HashMap hashMap = this.b;
                for (dhfp dhfpVar : hashMap.values()) {
                    dhfpVar.c.clear();
                    if (dhgn.c()) {
                        a.h("Unregistering %s receiver", dhfpVar.a);
                    }
                    dhfpVar.b.d(this);
                }
                hashMap.clear();
            } else {
                if (stringExtra2 == null) {
                    a.m("Cannot call system update listener for null action (request ID: %s)", stringExtra3);
                    return 2;
                }
                if (stringExtra3 == null) {
                    a.m("Cannot call system update listener without request ID", new Object[0]);
                    return 2;
                }
                if (Objects.equals(stringExtra, "start_listener")) {
                    if (dhgn.c()) {
                        a.h("Got request (%s) to register for action: %s", stringExtra3, stringExtra2);
                    }
                    HashMap hashMap2 = this.b;
                    dhfp dhfpVar2 = (dhfp) hashMap2.get(stringExtra2);
                    if (dhfpVar2 == null) {
                        dhfpVar2 = new dhfp(stringExtra2);
                        hashMap2.put(stringExtra2, dhfpVar2);
                    }
                    boolean a2 = dhfpVar2.a();
                    if (dhfpVar2.c.add(stringExtra3) && a2) {
                        if (dhgn.c()) {
                            a.h("Registering %s receiver (request ID: %s).", dhfpVar2.a, stringExtra3);
                        }
                        IntentFilter intentFilter = new IntentFilter();
                        intentFilter.addAction(dhfpVar2.a);
                        dhfpVar2.b.c(this, intentFilter);
                    }
                } else if (Objects.equals(stringExtra, "stop_listener")) {
                    if (dhgn.c()) {
                        a.h("Got request (%s) to unregister for action: %s", stringExtra3, stringExtra2);
                    }
                    HashMap hashMap3 = this.b;
                    dhfp dhfpVar3 = (dhfp) hashMap3.get(stringExtra2);
                    if (dhfpVar3 != null) {
                        Set set = dhfpVar3.c;
                        if (!set.isEmpty()) {
                            set.remove(stringExtra3);
                            if (dhfpVar3.a()) {
                                if (dhgn.c()) {
                                    a.h("Unregistering %s receiver (request ID: %s).", dhfpVar3.a, stringExtra3);
                                }
                                dhfpVar3.b.d(this);
                            }
                        }
                        if (dhfpVar3.a()) {
                            hashMap3.remove(stringExtra2);
                        }
                    }
                } else {
                    a.m("Ignoring invalid command to system update listener service: %s)", stringExtra);
                }
            }
            Iterator it = this.b.values().iterator();
            while (it.hasNext()) {
                if (!((dhfp) it.next()).a()) {
                }
            }
            if (dhgn.c()) {
                a.h("Stopping ChimeraSystemUpdatePersistentListenerService", new Object[0]);
            }
            stopSelf();
            return 2;
        }
        return 2;
    }
}
