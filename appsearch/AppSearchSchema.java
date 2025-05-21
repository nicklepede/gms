package com.google.android.gms.appsearch;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.appsearch.safeparcel.PropertyConfigParcel;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.arxc;
import defpackage.ucv;
import defpackage.ucx;
import defpackage.ucy;
import defpackage.ucz;
import defpackage.udb;
import defpackage.udc;
import defpackage.udd;
import defpackage.ude;
import defpackage.ugl;
import j$.util.DesugarCollections;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes2.dex */
public final class AppSearchSchema extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new ude();
    public final String a;
    final List b;
    public final String c;
    private final List d;

    public AppSearchSchema(String str, List list, List list2, String str2) {
        this.a = (String) Objects.requireNonNull(str);
        this.b = (List) Objects.requireNonNull(list);
        this.d = (List) Objects.requireNonNull(list2);
        this.c = (String) Objects.requireNonNull(str2);
    }

    public final List a() {
        return DesugarCollections.unmodifiableList(this.d);
    }

    public final List b() {
        udc uddVar;
        List list = this.b;
        if (list.isEmpty()) {
            return Collections.EMPTY_LIST;
        }
        ArrayList arrayList = new ArrayList(list.size());
        for (int i = 0; i < list.size(); i++) {
            PropertyConfigParcel propertyConfigParcel = (PropertyConfigParcel) list.get(i);
            Objects.requireNonNull(propertyConfigParcel);
            int i2 = propertyConfigParcel.b;
            switch (i2) {
                case 1:
                    uddVar = new udd(propertyConfigParcel);
                    break;
                case 2:
                    uddVar = new udb(propertyConfigParcel);
                    break;
                case 3:
                    uddVar = new ucz(propertyConfigParcel);
                    break;
                case 4:
                    uddVar = new ucv(propertyConfigParcel);
                    break;
                case 5:
                    uddVar = new ucx(propertyConfigParcel);
                    break;
                case 6:
                    uddVar = new ucy(propertyConfigParcel);
                    break;
                default:
                    throw new IllegalArgumentException("Unsupported property bundle of type " + i2 + "; contents: " + String.valueOf(propertyConfigParcel));
            }
            arrayList.add(uddVar);
        }
        return arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AppSearchSchema)) {
            return false;
        }
        AppSearchSchema appSearchSchema = (AppSearchSchema) obj;
        if (this.a.equals(appSearchSchema.a) && this.c.equals(appSearchSchema.c) && a().equals(appSearchSchema.a())) {
            return b().equals(appSearchSchema.b());
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.a, b(), a(), this.c);
    }

    public final String toString() {
        ugl uglVar = new ugl();
        Objects.requireNonNull(uglVar);
        uglVar.a("{\n");
        uglVar.d();
        uglVar.a("schemaType: \"");
        uglVar.a(this.a);
        uglVar.a("\",\n");
        uglVar.a("description: \"");
        uglVar.a(this.c);
        uglVar.a("\",\n");
        uglVar.a("properties: [\n");
        int i = 0;
        udc[] udcVarArr = (udc[]) b().toArray(new udc[0]);
        Arrays.sort(udcVarArr, new Comparator() { // from class: ucu
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return ((udc) obj).e().compareTo(((udc) obj2).e());
            }
        });
        while (true) {
            int length = udcVarArr.length;
            if (i >= length) {
                uglVar.a("\n");
                uglVar.a("]\n");
                uglVar.c();
                uglVar.a("}");
                return uglVar.toString();
            }
            udc udcVar = udcVarArr[i];
            uglVar.d();
            udcVar.f(uglVar);
            if (i != length - 1) {
                uglVar.a(",\n");
            }
            uglVar.c();
            i++;
        }
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str = this.a;
        int a = arxc.a(parcel);
        arxc.v(parcel, 1, str, false);
        arxc.y(parcel, 2, this.b, false);
        arxc.x(parcel, 3, a(), false);
        arxc.v(parcel, 4, this.c, false);
        arxc.c(parcel, a);
    }
}
