package com.google.android.gms.credential.manager.credentialexchange;

import defpackage.audi;
import defpackage.fipp;
import defpackage.fvbo;
import java.util.List;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
@fipp(a = true)
/* loaded from: classes3.dex */
public final class CredentialExchangeFormat$EditableField {
    public final String a;
    public final audi b;
    public final String c;
    public final String d;
    public final List e;

    public CredentialExchangeFormat$EditableField(String str, audi audiVar, String str2, String str3, List list) {
        fvbo.f(audiVar, "fieldType");
        fvbo.f(str2, "value");
        fvbo.f(list, "extensions");
        this.a = str;
        this.b = audiVar;
        this.c = str2;
        this.d = str3;
        this.e = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CredentialExchangeFormat$EditableField)) {
            return false;
        }
        CredentialExchangeFormat$EditableField credentialExchangeFormat$EditableField = (CredentialExchangeFormat$EditableField) obj;
        return fvbo.n(this.a, credentialExchangeFormat$EditableField.a) && this.b == credentialExchangeFormat$EditableField.b && fvbo.n(this.c, credentialExchangeFormat$EditableField.c) && fvbo.n(this.d, credentialExchangeFormat$EditableField.d) && fvbo.n(this.e, credentialExchangeFormat$EditableField.e);
    }

    public final int hashCode() {
        String str = this.a;
        int hashCode = ((((str == null ? 0 : str.hashCode()) * 31) + this.b.hashCode()) * 31) + this.c.hashCode();
        String str2 = this.d;
        return (((hashCode * 31) + (str2 != null ? str2.hashCode() : 0)) * 31) + this.e.hashCode();
    }

    public final String toString() {
        return "EditableField(id=" + this.a + ", fieldType=" + this.b + ", value=" + this.c + ", label=" + this.d + ", extensions=" + this.e + ")";
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.SSAVar.getPhiList()" because "resultVar" is null
        	at jadx.core.dex.visitors.InitCodeVariables.collectConnectedVars(InitCodeVariables.java:119)
        	at jadx.core.dex.visitors.InitCodeVariables.setCodeVar(InitCodeVariables.java:82)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVar(InitCodeVariables.java:74)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVars(InitCodeVariables.java:48)
        	at jadx.core.dex.visitors.InitCodeVariables.visit(InitCodeVariables.java:29)
        */
    public /* synthetic */ CredentialExchangeFormat$EditableField(java.lang.String r7, defpackage.audi r8, java.lang.String r9, java.lang.String r10, java.util.List r11, int r12, kotlin.jvm.internal.DefaultConstructorMarker r13) {
        /*
            r6 = this;
            r13 = r12 & 16
            if (r13 == 0) goto L6
            fuww r11 = defpackage.fuww.a
        L6:
            r5 = r11
            r11 = r12 & 8
            r13 = 1
            r12 = r12 & r13
            r0 = 0
            if (r11 == 0) goto L10
            r4 = r0
            goto L11
        L10:
            r4 = r10
        L11:
            if (r13 != r12) goto L18
            r1 = r0
            r2 = r8
            r3 = r9
            r0 = r6
            goto L1c
        L18:
            r1 = r7
            r0 = r6
            r2 = r8
            r3 = r9
        L1c:
            r0.<init>(r1, r2, r3, r4, r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.credential.manager.credentialexchange.CredentialExchangeFormat$EditableField.<init>(java.lang.String, audi, java.lang.String, java.lang.String, java.util.List, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
