package com.google.android.gms.appsearch;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.appsearch.safeparcel.PropertyConfigParcel;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.atzr;
import defpackage.vyu;
import defpackage.vyw;
import defpackage.vyx;
import defpackage.vyy;
import defpackage.vza;
import defpackage.vzb;
import defpackage.vzc;
import defpackage.vzd;
import defpackage.wck;
import j$.util.DesugarCollections;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes2.dex */
public final class AppSearchSchema extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new vzd();
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
        Object vzcVar;
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
                    vzcVar = new vzc(propertyConfigParcel);
                    break;
                case 2:
                    vzcVar = new vza(propertyConfigParcel);
                    break;
                case 3:
                    vzcVar = new vyy(propertyConfigParcel);
                    break;
                case 4:
                    vzcVar = new vyu(propertyConfigParcel);
                    break;
                case 5:
                    vzcVar = new vyw(propertyConfigParcel);
                    break;
                case 6:
                    vzcVar = new vyx(propertyConfigParcel);
                    break;
                default:
                    throw new IllegalArgumentException("Unsupported property bundle of type " + i2 + "; contents: " + String.valueOf(propertyConfigParcel));
            }
            arrayList.add(vzcVar);
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
        wck wckVar = new wck();
        Objects.requireNonNull(wckVar);
        wckVar.a("{\n");
        wckVar.d();
        wckVar.a("schemaType: \"");
        wckVar.a(this.a);
        wckVar.a("\",\n");
        wckVar.a("description: \"");
        wckVar.a(this.c);
        wckVar.a("\",\n");
        wckVar.a("properties: [\n");
        int i = 0;
        vzb[] vzbVarArr = (vzb[]) b().toArray(new vzb[0]);
        Arrays.sort(vzbVarArr, new Comparator() { // from class: vyt
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return ((vzb) obj).e().compareTo(((vzb) obj2).e());
            }
        });
        while (true) {
            int length = vzbVarArr.length;
            if (i >= length) {
                wckVar.a("\n");
                wckVar.a("]\n");
                wckVar.c();
                wckVar.a("}");
                return wckVar.toString();
            }
            vzb vzbVar = vzbVarArr[i];
            wckVar.d();
            vzbVar.f(wckVar);
            if (i != length - 1) {
                wckVar.a(",\n");
            }
            wckVar.c();
            i++;
        }
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str = this.a;
        int a = atzr.a(parcel);
        atzr.v(parcel, 1, str, false);
        atzr.y(parcel, 2, this.b, false);
        atzr.x(parcel, 3, a(), false);
        atzr.v(parcel, 4, this.c, false);
        atzr.c(parcel, a);
    }
}
