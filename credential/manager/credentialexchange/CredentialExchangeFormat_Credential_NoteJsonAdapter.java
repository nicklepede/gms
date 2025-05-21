package com.google.android.gms.credential.manager.credentialexchange;

import defpackage.fipo;
import defpackage.fipt;
import defpackage.fipu;
import defpackage.fipw;
import defpackage.fiqb;
import defpackage.fiqq;
import defpackage.firp;
import defpackage.fuwy;
import defpackage.fvbo;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes3.dex */
public final class CredentialExchangeFormat_Credential_NoteJsonAdapter extends fipo {
    private final fipu a;
    private final fipo b;

    public CredentialExchangeFormat_Credential_NoteJsonAdapter(fiqq fiqqVar) {
        fvbo.f(fiqqVar, "moshi");
        this.a = fipt.a("content");
        this.b = fiqqVar.d(CredentialExchangeFormat$EditableField.class, fuwy.a, "content");
    }

    @Override // defpackage.fipo
    public final /* bridge */ /* synthetic */ Object a(fipw fipwVar) {
        fipwVar.i();
        CredentialExchangeFormat$EditableField credentialExchangeFormat$EditableField = null;
        while (fipwVar.o()) {
            int c = fipwVar.c(this.a);
            if (c == -1) {
                fipwVar.m();
                fipwVar.n();
            } else if (c == 0 && (credentialExchangeFormat$EditableField = (CredentialExchangeFormat$EditableField) this.b.a(fipwVar)) == null) {
                throw firp.c("content", "content", fipwVar);
            }
        }
        fipwVar.k();
        if (credentialExchangeFormat$EditableField != null) {
            return new CredentialExchangeFormat$Credential$Note(credentialExchangeFormat$EditableField);
        }
        throw firp.b("content", "content", fipwVar);
    }

    @Override // defpackage.fipo
    public final /* bridge */ /* synthetic */ void b(fiqb fiqbVar, Object obj) {
        CredentialExchangeFormat$Credential$Note credentialExchangeFormat$Credential$Note = (CredentialExchangeFormat$Credential$Note) obj;
        if (credentialExchangeFormat$Credential$Note == null) {
            throw new NullPointerException("value was null! Wrap in .nullSafe() to write nullable values.");
        }
        fiqbVar.d();
        fiqbVar.j("content");
        this.b.b(fiqbVar, credentialExchangeFormat$Credential$Note.a);
        fiqbVar.f();
    }

    public final String toString() {
        return "GeneratedJsonAdapter(CredentialExchangeFormat.Credential.Note)";
    }
}
