package com.google.android.gms.update.control;

import android.content.Intent;
import android.content.IntentFilter;
import android.os.IBinder;
import com.google.android.chimera.Service;
import defpackage.auad;
import defpackage.djqv;
import defpackage.djrt;
import defpackage.djuz;
import j$.util.Objects;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes7.dex */
public final class ChimeraSystemUpdatePersistentListenerService extends Service {
    public static final auad a = djuz.d("ChimeraSystemUpdatePersistentListenerService");
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
            if (djrt.c()) {
                a.h("Start (command: %s, action: %s, request ID: %s", stringExtra, stringExtra2, stringExtra3);
            }
            if (Objects.equals(stringExtra, "stop_all_listeners")) {
                if (djrt.c()) {
                    a.h("Got request to unregister all broadcast receivers", new Object[0]);
                }
                HashMap hashMap = this.b;
                for (djqv djqvVar : hashMap.values()) {
                    djqvVar.c.clear();
                    if (djrt.c()) {
                        a.h("Unregistering %s receiver", djqvVar.a);
                    }
                    djqvVar.b.d(this);
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
                    if (djrt.c()) {
                        a.h("Got request (%s) to register for action: %s", stringExtra3, stringExtra2);
                    }
                    HashMap hashMap2 = this.b;
                    djqv djqvVar2 = (djqv) hashMap2.get(stringExtra2);
                    if (djqvVar2 == null) {
                        djqvVar2 = new djqv(stringExtra2);
                        hashMap2.put(stringExtra2, djqvVar2);
                    }
                    boolean a2 = djqvVar2.a();
                    if (djqvVar2.c.add(stringExtra3) && a2) {
                        if (djrt.c()) {
                            a.h("Registering %s receiver (request ID: %s).", djqvVar2.a, stringExtra3);
                        }
                        IntentFilter intentFilter = new IntentFilter();
                        intentFilter.addAction(djqvVar2.a);
                        djqvVar2.b.c(this, intentFilter);
                    }
                } else if (Objects.equals(stringExtra, "stop_listener")) {
                    if (djrt.c()) {
                        a.h("Got request (%s) to unregister for action: %s", stringExtra3, stringExtra2);
                    }
                    HashMap hashMap3 = this.b;
                    djqv djqvVar3 = (djqv) hashMap3.get(stringExtra2);
                    if (djqvVar3 != null) {
                        Set set = djqvVar3.c;
                        if (!set.isEmpty()) {
                            set.remove(stringExtra3);
                            if (djqvVar3.a()) {
                                if (djrt.c()) {
                                    a.h("Unregistering %s receiver (request ID: %s).", djqvVar3.a, stringExtra3);
                                }
                                djqvVar3.b.d(this);
                            }
                        }
                        if (djqvVar3.a()) {
                            hashMap3.remove(stringExtra2);
                        }
                    }
                } else {
                    a.m("Ignoring invalid command to system update listener service: %s)", stringExtra);
                }
            }
            Iterator it = this.b.values().iterator();
            while (it.hasNext()) {
                if (!((djqv) it.next()).a()) {
                }
            }
            if (djrt.c()) {
                a.h("Stopping ChimeraSystemUpdatePersistentListenerService", new Object[0]);
            }
            stopSelf();
            return 2;
        }
        return 2;
    }
}
