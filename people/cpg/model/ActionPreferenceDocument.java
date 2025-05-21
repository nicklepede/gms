package com.google.android.gms.people.cpg.model;

import defpackage.eihn;
import defpackage.eiib;
import defpackage.eiic;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes6.dex */
public final class ActionPreferenceDocument {
    public final String a;
    public final String b;
    public final String c;
    public final int d;
    public final int e;
    public final String f;
    public final String g;
    public final int h;
    public final String i;
    public final long j;

    public ActionPreferenceDocument(String str, String str2, String str3, int i, int i2, String str4, String str5, int i3, String str6, long j) {
        this.a = str2;
        this.b = str;
        this.c = str3;
        this.d = i;
        this.e = i2;
        this.f = str4;
        this.g = str5;
        this.h = i3;
        this.i = str6;
        this.j = j;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof ActionPreferenceDocument) {
            ActionPreferenceDocument actionPreferenceDocument = (ActionPreferenceDocument) obj;
            if (eihn.a(this.b, actionPreferenceDocument.b) && eihn.a(this.a, actionPreferenceDocument.a) && eihn.a(this.c, actionPreferenceDocument.c) && this.d == actionPreferenceDocument.d && this.e == actionPreferenceDocument.e && eihn.a(this.f, actionPreferenceDocument.f) && eihn.a(this.g, actionPreferenceDocument.g) && this.h == actionPreferenceDocument.h && eihn.a(this.i, actionPreferenceDocument.i) && this.j == actionPreferenceDocument.j) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.b, this.a, this.c, Integer.valueOf(this.d), Integer.valueOf(this.e), this.f, this.g, Integer.valueOf(this.h), this.i, Long.valueOf(this.j)});
    }

    public final String toString() {
        eiib b = eiic.b(this);
        b.b("preferenceId", this.b);
        b.b("namespace", this.a);
        b.b("identifier", this.c);
        b.f("identifierType", this.d);
        b.f("actionType", this.e);
        b.b("dataOne", this.f);
        b.b("mimetype", this.g);
        b.f("appType", this.h);
        b.b("dirty", this.i);
        b.g("docVersion", this.j);
        return b.toString();
    }
}
