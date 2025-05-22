package com.google.android.gms.autofill.operation;

import android.content.Intent;
import com.google.android.chimera.IntentOperation;
import com.google.android.gms.R;
import com.google.android.gms.autofill.data.DomainUtils$DomainParcel;
import com.google.android.gms.autofill.operation.RejectSavePromoOperation;
import defpackage.afsm;
import defpackage.afty;
import defpackage.agsl;
import defpackage.agsm;
import defpackage.agyo;
import defpackage.ahjp;
import defpackage.ahqo;
import defpackage.aier;
import defpackage.aihn;
import defpackage.aill;
import defpackage.auid;
import defpackage.ausn;
import defpackage.ekut;
import defpackage.ekvi;
import defpackage.ekvw;
import defpackage.ekww;
import defpackage.eluo;
import defpackage.fgqp;
import defpackage.fgrc;
import defpackage.fgri;
import defpackage.fgsd;
import defpackage.fgti;
import defpackage.fnwp;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes3.dex */
public final class RejectSavePromoOperation extends IntentOperation {
    public static final /* synthetic */ int a = 0;
    private static final ausn b = ausn.b("RejectSavePromoOperation", auid.AUTOFILL);

    @Override // com.google.android.chimera.IntentOperation
    public final void onHandleIntent(Intent intent) {
        boolean z;
        Intent intent2;
        int length;
        Intent intent3;
        aihn j = agsl.a(this).j();
        if (!afty.a.equals(j.z())) {
            ((eluo) ((eluo) b.j()).ai((char) 1029)).x("RejectSavePromoOperation called when already setup");
            return;
        }
        agsm a2 = agsl.a(this);
        agyo x = a2.x(this);
        if (fnwp.i()) {
            afsm afsmVar = (afsm) ekvi.i((DomainUtils$DomainParcel) intent.getParcelableExtra("save_application_domain")).b(new ekut() { // from class: ahks
                @Override // defpackage.ekut
                public final Object apply(Object obj) {
                    int i = RejectSavePromoOperation.a;
                    return (afsm) ((DomainUtils$DomainParcel) obj).a;
                }
            }).f();
            if (afsmVar != null) {
                String str = afsmVar.a;
                j.W(str);
                if (fnwp.a.lK().b() && j.s(str) >= aier.c) {
                    intent3 = aill.A(R.string.autofill_manage_save_preferences, ekvi.j(aill.r()));
                    intent2 = intent3;
                    z = false;
                }
            }
            intent3 = null;
            intent2 = intent3;
            z = false;
        } else {
            j.ap();
            if (j.w() >= aier.c) {
                ((eluo) ((eluo) b.h()).ai((char) 1028)).x("Disabling Autofill with Google");
                ((ahjp) ((ekvw) a2.p()).a).d();
                a2.a().disableAutofillServices();
                z = true;
            } else {
                z = false;
            }
            intent2 = null;
        }
        try {
            byte[] byteArrayExtra = intent.getByteArrayExtra("save_ui_action_event_extra");
            if (byteArrayExtra != null && (length = byteArrayExtra.length) != 0) {
                ahqo ahqoVar = ahqo.a;
                fgqp fgqpVar = fgqp.a;
                fgti fgtiVar = fgti.a;
                fgri y = fgri.y(ahqoVar, byteArrayExtra, 0, length, fgqp.a);
                fgri.M(y);
                ahqo ahqoVar2 = (ahqo) y;
                fgrc fgrcVar = (fgrc) ahqoVar2.iQ(5, null);
                fgrcVar.X(ahqoVar2);
                if (!fgrcVar.b.L()) {
                    fgrcVar.U();
                }
                ((ahqo) fgrcVar.b).j = z;
                final ahqo ahqoVar3 = (ahqo) fgrcVar.Q();
                x.b().P(new ekww() { // from class: ahkt
                    @Override // defpackage.ekww
                    public final Object lK() {
                        int i = RejectSavePromoOperation.a;
                        return ahqo.this;
                    }
                });
            }
        } catch (fgsd unused) {
        }
        if (intent2 != null) {
            startActivity(intent2);
        }
    }
}
