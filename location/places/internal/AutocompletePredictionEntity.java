package com.google.android.gms.location.places.internal;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.style.CharacterStyle;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.arwa;
import defpackage.arwb;
import defpackage.arxc;
import defpackage.cads;
import defpackage.caft;
import defpackage.cafz;
import defpackage.cahf;
import defpackage.eitj;
import defpackage.ejcb;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes5.dex */
public class AutocompletePredictionEntity extends AbstractSafeParcelable implements cads {
    public static final Parcelable.Creator CREATOR = new caft();
    public final String a;
    public final String b;
    public final List c;
    public final List d;
    public final int e;
    public final String f;
    public final List g;
    public final String h;
    public final List i;

    /* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
    public class SubstringEntity extends AbstractSafeParcelable {
        public static final Parcelable.Creator CREATOR = new cahf();
        public final int a;
        public final int b;

        public SubstringEntity(int i, int i2) {
            this.a = i;
            this.b = i2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof SubstringEntity)) {
                return false;
            }
            SubstringEntity substringEntity = (SubstringEntity) obj;
            return arwb.b(Integer.valueOf(this.a), Integer.valueOf(substringEntity.a)) && arwb.b(Integer.valueOf(this.b), Integer.valueOf(substringEntity.b));
        }

        public final int hashCode() {
            return Arrays.hashCode(new Object[]{Integer.valueOf(this.a), Integer.valueOf(this.b)});
        }

        public final String toString() {
            ArrayList arrayList = new ArrayList();
            arwa.b("offset", Integer.valueOf(this.a), arrayList);
            arwa.b("length", Integer.valueOf(this.b), arrayList);
            return arwa.a(arrayList, this);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            int a = arxc.a(parcel);
            arxc.o(parcel, 1, this.a);
            arxc.o(parcel, 2, this.b);
            arxc.c(parcel, a);
        }
    }

    static {
        int i = eitj.d;
        eitj eitjVar = ejcb.a;
    }

    public AutocompletePredictionEntity(String str, List list, int i, String str2, List list2, String str3, List list3, String str4, List list4) {
        this.b = str;
        this.c = list;
        this.e = i;
        this.a = str2;
        this.d = list2;
        this.f = str3;
        this.g = list3;
        this.h = str4;
        this.i = list4;
    }

    @Override // defpackage.cads
    public final CharSequence a(CharacterStyle characterStyle) {
        return cafz.a(this.f, this.g, characterStyle);
    }

    @Override // defpackage.cads
    public final String b() {
        return this.a;
    }

    @Override // defpackage.cads
    public final String c() {
        return this.b;
    }

    @Override // defpackage.cads
    public final CharSequence d() {
        return cafz.a(this.a, this.d, null);
    }

    @Override // defpackage.cads
    public final CharSequence e() {
        return cafz.a(this.h, this.i, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AutocompletePredictionEntity)) {
            return false;
        }
        AutocompletePredictionEntity autocompletePredictionEntity = (AutocompletePredictionEntity) obj;
        return arwb.b(this.b, autocompletePredictionEntity.b) && arwb.b(this.c, autocompletePredictionEntity.c) && arwb.b(Integer.valueOf(this.e), Integer.valueOf(autocompletePredictionEntity.e)) && arwb.b(this.a, autocompletePredictionEntity.a) && arwb.b(this.d, autocompletePredictionEntity.d) && arwb.b(this.f, autocompletePredictionEntity.f) && arwb.b(this.g, autocompletePredictionEntity.g) && arwb.b(this.h, autocompletePredictionEntity.h) && arwb.b(this.i, autocompletePredictionEntity.i);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.b, this.c, Integer.valueOf(this.e), this.a, this.d, this.f, this.g, this.h, this.i});
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        arwa.b("placeId", this.b, arrayList);
        arwa.b("placeTypes", this.c, arrayList);
        arwa.b("fullText", this.a, arrayList);
        arwa.b("fullTextMatchedSubstrings", this.d, arrayList);
        arwa.b("primaryText", this.f, arrayList);
        arwa.b("primaryTextMatchedSubstrings", this.g, arrayList);
        arwa.b("secondaryText", this.h, arrayList);
        arwa.b("secondaryTextMatchedSubstrings", this.i, arrayList);
        return arwa.a(arrayList, this);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str = this.a;
        int a = arxc.a(parcel);
        arxc.v(parcel, 1, str, false);
        arxc.v(parcel, 2, this.b, false);
        arxc.E(parcel, 3, this.c);
        arxc.y(parcel, 4, this.d, false);
        arxc.o(parcel, 5, this.e);
        arxc.v(parcel, 6, this.f, false);
        arxc.y(parcel, 7, this.g, false);
        arxc.v(parcel, 8, this.h, false);
        arxc.y(parcel, 9, this.i, false);
        arxc.c(parcel, a);
    }

    @Override // defpackage.arod
    public final /* bridge */ /* synthetic */ Object l() {
        return this;
    }
}
