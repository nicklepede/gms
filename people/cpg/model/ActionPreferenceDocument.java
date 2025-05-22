package com.google.android.gms.people.cpg.model;

import defpackage.ekus;
import defpackage.ekvg;
import defpackage.ekvh;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
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
            if (ekus.a(this.b, actionPreferenceDocument.b) && ekus.a(this.a, actionPreferenceDocument.a) && ekus.a(this.c, actionPreferenceDocument.c) && this.d == actionPreferenceDocument.d && this.e == actionPreferenceDocument.e && ekus.a(this.f, actionPreferenceDocument.f) && ekus.a(this.g, actionPreferenceDocument.g) && this.h == actionPreferenceDocument.h && ekus.a(this.i, actionPreferenceDocument.i) && this.j == actionPreferenceDocument.j) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.b, this.a, this.c, Integer.valueOf(this.d), Integer.valueOf(this.e), this.f, this.g, Integer.valueOf(this.h), this.i, Long.valueOf(this.j)});
    }

    public final String toString() {
        ekvg b = ekvh.b(this);
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
