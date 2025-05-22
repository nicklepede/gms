package com.google.android.gms.credential.manager.credentialexchange;

import defpackage.flfl;
import defpackage.flfq;
import defpackage.flfr;
import defpackage.flft;
import defpackage.flfy;
import defpackage.flgn;
import defpackage.flhm;
import defpackage.fxsw;
import defpackage.fxxm;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes4.dex */
public final class CredentialExchangeFormat_Credential_NoteJsonAdapter extends flfl {
    private final flfr a;
    private final flfl b;

    public CredentialExchangeFormat_Credential_NoteJsonAdapter(flgn flgnVar) {
        fxxm.f(flgnVar, "moshi");
        this.a = flfq.a("content");
        this.b = flgnVar.d(CredentialExchangeFormat$EditableField.class, fxsw.a, "content");
    }

    @Override // defpackage.flfl
    public final /* bridge */ /* synthetic */ Object a(flft flftVar) {
        flftVar.i();
        CredentialExchangeFormat$EditableField credentialExchangeFormat$EditableField = null;
        while (flftVar.o()) {
            int c = flftVar.c(this.a);
            if (c == -1) {
                flftVar.m();
                flftVar.n();
            } else if (c == 0 && (credentialExchangeFormat$EditableField = (CredentialExchangeFormat$EditableField) this.b.a(flftVar)) == null) {
                throw flhm.c("content", "content", flftVar);
            }
        }
        flftVar.k();
        if (credentialExchangeFormat$EditableField != null) {
            return new CredentialExchangeFormat$Credential$Note(credentialExchangeFormat$EditableField);
        }
        throw flhm.b("content", "content", flftVar);
    }

    @Override // defpackage.flfl
    public final /* bridge */ /* synthetic */ void b(flfy flfyVar, Object obj) {
        CredentialExchangeFormat$Credential$Note credentialExchangeFormat$Credential$Note = (CredentialExchangeFormat$Credential$Note) obj;
        if (credentialExchangeFormat$Credential$Note == null) {
            throw new NullPointerException("value was null! Wrap in .nullSafe() to write nullable values.");
        }
        flfyVar.d();
        flfyVar.j("content");
        this.b.b(flfyVar, credentialExchangeFormat$Credential$Note.a);
        flfyVar.f();
    }

    public final String toString() {
        return "GeneratedJsonAdapter(CredentialExchangeFormat.Credential.Note)";
    }
}
