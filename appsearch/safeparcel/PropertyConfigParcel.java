package com.google.android.gms.appsearch.safeparcel;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.arxc;
import defpackage.ufz;
import defpackage.ugc;
import defpackage.ugd;
import defpackage.ugf;
import defpackage.ugh;
import j$.util.Objects;
import java.util.List;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes2.dex */
public final class PropertyConfigParcel extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new ugf();
    public final String a;
    public final int b;
    public final int c;
    public final String d;
    public final StringIndexingConfigParcel e;
    public final DocumentIndexingConfigParcel f;
    public final IntegerIndexingConfigParcel g;
    public final JoinableConfigParcel h;
    public final String i;
    private Integer j;

    /* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
    public class DocumentIndexingConfigParcel extends AbstractSafeParcelable {
        public static final Parcelable.Creator CREATOR = new ufz();
        public final boolean a;
        public final List b;

        public DocumentIndexingConfigParcel(boolean z, List list) {
            this.a = z;
            this.b = (List) Objects.requireNonNull(list);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof DocumentIndexingConfigParcel)) {
                return false;
            }
            DocumentIndexingConfigParcel documentIndexingConfigParcel = (DocumentIndexingConfigParcel) obj;
            return this.a == documentIndexingConfigParcel.a && Objects.equals(this.b, documentIndexingConfigParcel.b);
        }

        public final int hashCode() {
            return Objects.hash(Boolean.valueOf(this.a), this.b);
        }

        public final String toString() {
            return "{indexNestedProperties: " + this.a + ", indexableNestedPropertiesList: " + String.valueOf(this.b) + "}";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            boolean z = this.a;
            int a = arxc.a(parcel);
            arxc.e(parcel, 1, z);
            arxc.x(parcel, 2, this.b, false);
            arxc.c(parcel, a);
        }
    }

    /* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
    public class IntegerIndexingConfigParcel extends AbstractSafeParcelable {
        public static final Parcelable.Creator CREATOR = new ugc();
        public final int a;

        public IntegerIndexingConfigParcel(int i) {
            this.a = i;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof IntegerIndexingConfigParcel) && this.a == ((IntegerIndexingConfigParcel) obj).a;
        }

        public final int hashCode() {
            return Objects.hashCode(Integer.valueOf(this.a));
        }

        public final String toString() {
            return "{indexingType: " + this.a + "}";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            int i2 = this.a;
            int a = arxc.a(parcel);
            arxc.o(parcel, 1, i2);
            arxc.c(parcel, a);
        }
    }

    /* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
    public class JoinableConfigParcel extends AbstractSafeParcelable {
        public static final Parcelable.Creator CREATOR = new ugd();
        public final int a;
        public final boolean b;

        public JoinableConfigParcel(int i, boolean z) {
            this.a = i;
            this.b = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof JoinableConfigParcel)) {
                return false;
            }
            JoinableConfigParcel joinableConfigParcel = (JoinableConfigParcel) obj;
            return this.a == joinableConfigParcel.a && this.b == joinableConfigParcel.b;
        }

        public final int hashCode() {
            return Objects.hash(Integer.valueOf(this.a), Boolean.valueOf(this.b));
        }

        public final String toString() {
            return "{joinableValueType: " + this.a + ", deletePropagation " + this.b + "}";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            int i2 = this.a;
            int a = arxc.a(parcel);
            arxc.o(parcel, 1, i2);
            arxc.e(parcel, 2, this.b);
            arxc.c(parcel, a);
        }
    }

    /* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
    public class StringIndexingConfigParcel extends AbstractSafeParcelable {
        public static final Parcelable.Creator CREATOR = new ugh();
        public final int a;
        public final int b;

        public StringIndexingConfigParcel(int i, int i2) {
            this.a = i;
            this.b = i2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof StringIndexingConfigParcel)) {
                return false;
            }
            StringIndexingConfigParcel stringIndexingConfigParcel = (StringIndexingConfigParcel) obj;
            return this.a == stringIndexingConfigParcel.a && this.b == stringIndexingConfigParcel.b;
        }

        public final int hashCode() {
            return Objects.hash(Integer.valueOf(this.a), Integer.valueOf(this.b));
        }

        public final String toString() {
            return "{indexingType: " + this.a + ", tokenizerType " + this.b + "}";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            int i2 = this.a;
            int a = arxc.a(parcel);
            arxc.o(parcel, 1, i2);
            arxc.o(parcel, 2, this.b);
            arxc.c(parcel, a);
        }
    }

    public PropertyConfigParcel(String str, int i, int i2, String str2, StringIndexingConfigParcel stringIndexingConfigParcel, DocumentIndexingConfigParcel documentIndexingConfigParcel, IntegerIndexingConfigParcel integerIndexingConfigParcel, JoinableConfigParcel joinableConfigParcel, String str3) {
        this.a = (String) Objects.requireNonNull(str);
        this.b = i;
        this.c = i2;
        this.d = str2;
        this.e = stringIndexingConfigParcel;
        this.f = documentIndexingConfigParcel;
        this.g = integerIndexingConfigParcel;
        this.h = joinableConfigParcel;
        this.i = (String) Objects.requireNonNull(str3);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PropertyConfigParcel)) {
            return false;
        }
        PropertyConfigParcel propertyConfigParcel = (PropertyConfigParcel) obj;
        return Objects.equals(this.a, propertyConfigParcel.a) && Objects.equals(this.i, propertyConfigParcel.i) && this.b == propertyConfigParcel.b && this.c == propertyConfigParcel.c && Objects.equals(this.d, propertyConfigParcel.d) && Objects.equals(this.e, propertyConfigParcel.e) && Objects.equals(this.f, propertyConfigParcel.f) && Objects.equals(this.g, propertyConfigParcel.g) && Objects.equals(this.h, propertyConfigParcel.h);
    }

    public final int hashCode() {
        if (this.j == null) {
            this.j = Integer.valueOf(Objects.hash(this.a, this.i, Integer.valueOf(this.b), Integer.valueOf(this.c), this.d, this.e, this.f, this.g, this.h));
        }
        return this.j.intValue();
    }

    public final String toString() {
        JoinableConfigParcel joinableConfigParcel = this.h;
        IntegerIndexingConfigParcel integerIndexingConfigParcel = this.g;
        DocumentIndexingConfigParcel documentIndexingConfigParcel = this.f;
        return "{name: " + this.a + ", description: " + this.i + ", dataType: " + this.b + ", cardinality: " + this.c + ", schemaType: " + this.d + ", stringIndexingConfigParcel: " + String.valueOf(this.e) + ", documentIndexingConfigParcel: " + String.valueOf(documentIndexingConfigParcel) + ", integerIndexingConfigParcel: " + String.valueOf(integerIndexingConfigParcel) + ", joinableConfigParcel: " + String.valueOf(joinableConfigParcel) + "}";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str = this.a;
        int a = arxc.a(parcel);
        arxc.v(parcel, 1, str, false);
        arxc.o(parcel, 2, this.b);
        arxc.o(parcel, 3, this.c);
        arxc.v(parcel, 4, this.d, false);
        arxc.t(parcel, 5, this.e, i, false);
        arxc.t(parcel, 6, this.f, i, false);
        arxc.t(parcel, 7, this.g, i, false);
        arxc.t(parcel, 8, this.h, i, false);
        arxc.v(parcel, 9, this.i, false);
        arxc.c(parcel, a);
    }
}
