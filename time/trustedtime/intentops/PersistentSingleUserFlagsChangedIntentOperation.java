package com.google.android.gms.time.trustedtime.intentops;

import android.content.Intent;
import com.google.android.chimera.IntentOperation;
import defpackage.ausn;
import defpackage.auua;
import defpackage.disv;
import defpackage.ditn;
import defpackage.ditq;
import defpackage.ditr;
import defpackage.diud;
import defpackage.diuf;
import defpackage.diug;
import defpackage.diui;
import defpackage.dwzt;
import defpackage.dxfp;
import defpackage.dxfs;
import defpackage.eluo;
import j$.util.Objects;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes7.dex */
public final class PersistentSingleUserFlagsChangedIntentOperation extends IntentOperation {
    private static final dxfp a = new dxfs("PersistentSingleUserFlagsChangedIntentOperation");
    private static final String b = auua.f("com.google.android.gms.time");
    private final diuf c;
    private final diuf d;

    public PersistentSingleUserFlagsChangedIntentOperation() {
        this(diui.a, ditn.b);
    }

    @Override // com.google.android.chimera.IntentOperation
    public final void onHandleIntent(Intent intent) {
        if (!diug.b()) {
            ((eluo) ((eluo) diud.a.j()).ai(11410)).B("[%s] TrustedTime is not enabled, ignoring call.", a);
            return;
        }
        if (!((Boolean) this.c.b()).booleanValue()) {
            ausn ausnVar = diud.a;
            return;
        }
        if (intent != null) {
            if ((Objects.equals(intent.getAction(), "com.google.android.gms.phenotype.COMMITTED") || b.equals(intent.getAction())) && intent.hasExtra("com.google.android.gms.phenotype.PACKAGE_NAME") && Objects.equals(intent.getStringExtra("com.google.android.gms.phenotype.PACKAGE_NAME"), "com.google.android.gms.time")) {
                ditn ditnVar = (ditn) this.d.b();
                ausn ausnVar2 = diud.a;
                ((eluo) ((eluo) ausnVar2.h()).ai((char) 11408)).x("Phenotype flag values for time module updated");
                synchronized (ditnVar.c) {
                    if (ditnVar.d) {
                        ditr ditrVar = ditnVar.e;
                        synchronized (ditrVar.a) {
                            disv a2 = disv.a();
                            dwzt dwztVar = new dwzt("onConfigUpdatedInternal");
                            if (!ditrVar.b.equals(a2)) {
                                ((eluo) ((eluo) ausnVar2.h()).ai((char) 11463)).x("onConfigUpdated configuration changed, updating");
                                ditrVar.b = a2;
                                ditrVar.h.d(ditrVar.b);
                                ditrVar.d.b(ditrVar.b);
                                int i = ditrVar.f().a;
                                if (i == 1) {
                                    ditrVar.e.a(new dwzt("State machine expected to be initialized but was in STATE_UNINITIALIZED"));
                                } else if (i == 2 || i == 3) {
                                    if (!ditrVar.b.p) {
                                        ditrVar.h(ditrVar.f().d, dwztVar);
                                    }
                                } else if (i != 4) {
                                    if (i != 5) {
                                        ditrVar.e.a(dwzt.a(new dwzt("Unexpected state enum "), ditq.b(i)));
                                    } else {
                                        ((eluo) ((eluo) ausnVar2.h()).ai((char) 11464)).B("Received config updates in FAILED state, ignoring updates: %s", new dxfs(dwztVar));
                                    }
                                } else if (ditrVar.b.p) {
                                    ditrVar.j();
                                    ditrVar.h(ditrVar.f().d, dwztVar);
                                }
                            }
                        }
                    } else {
                        ditnVar.a(new dwzt("onTimeModuleConfigUpdated"));
                    }
                }
            }
        }
    }

    public PersistentSingleUserFlagsChangedIntentOperation(diuf diufVar, diuf diufVar2) {
        this.c = (diuf) Objects.requireNonNull(diufVar);
        this.d = (diuf) Objects.requireNonNull(diufVar2);
    }
}
