package com.google.android.gms.libs.googlesettings;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.aojj;
import defpackage.asew;
import defpackage.bwow;
import java.util.ArrayList;
import java.util.List;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes5.dex */
public class GoogleSettingsItem extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new bwow();
    public final Intent a;
    public final int b;
    public String c;
    public int d;
    public boolean e;
    public boolean f;
    public boolean g;
    public String h;
    public boolean i;
    public boolean j;
    public List k;
    public boolean l;
    public String m;
    public int n;
    public int o;
    public String p;
    public String q;
    public int r;
    public int s;

    public GoogleSettingsItem(Intent intent, int i, String str, int i2, boolean z, boolean z2, boolean z3, String str2, boolean z4, boolean z5, List list, boolean z6, String str3, int i3, int i4, String str4, String str5) {
        this.a = intent;
        this.b = i;
        this.c = str;
        this.d = i2;
        this.e = z;
        this.f = z2;
        this.g = z3;
        this.h = str2;
        this.i = z4;
        this.j = z5;
        this.k = list;
        this.l = z6;
        this.m = str3;
        this.n = i3;
        this.o = i4;
        this.p = str4;
        this.q = str5;
        this.r = -1;
        this.s = -1;
    }

    public final void a(String str) {
        if (this.k == null) {
            this.k = new ArrayList();
        }
        this.k.add(str);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        bwow.a(this, parcel, i);
    }

    public GoogleSettingsItem(Intent intent, int i, int i2, aojj aojjVar, asew asewVar) {
        this(intent, i, null, -1, false, false, false, null, true, false, null, true, null, aojjVar.bu, asewVar.a(), null, null);
        this.r = i2;
    }

    public GoogleSettingsItem(Intent intent, int i, String str, aojj aojjVar, asew asewVar) {
        this(intent, i, str, -1, false, false, false, null, true, false, null, true, null, aojjVar.bu, asewVar.a(), null, null);
    }
}
