package com.google.android.gms.reminders.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.arwb;
import defpackage.cxed;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes6.dex */
public class CategoryInfoEntity extends AbstractSafeParcelable implements CategoryInfo {
    public static final Parcelable.Creator CREATOR = new cxed();
    public final String a;
    public final String b;
    public final List c;

    public CategoryInfoEntity(CategoryInfo categoryInfo) {
        this(categoryInfo.a(), categoryInfo.d(), categoryInfo.c());
    }

    public static int b(CategoryInfo categoryInfo) {
        return Arrays.hashCode(new Object[]{categoryInfo.a(), categoryInfo.d(), categoryInfo.c()});
    }

    public static boolean e(CategoryInfo categoryInfo, CategoryInfo categoryInfo2) {
        return arwb.b(categoryInfo.a(), categoryInfo2.a()) && arwb.b(categoryInfo.d(), categoryInfo2.d()) && arwb.b(categoryInfo.c(), categoryInfo2.c());
    }

    @Override // com.google.android.gms.reminders.model.CategoryInfo
    public final String a() {
        return this.a;
    }

    @Override // com.google.android.gms.reminders.model.CategoryInfo
    public final String c() {
        return this.b;
    }

    @Override // com.google.android.gms.reminders.model.CategoryInfo
    public final List d() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof CategoryInfo)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        return e(this, (CategoryInfo) obj);
    }

    public final int hashCode() {
        return b(this);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        cxed.a(this, parcel);
    }

    public CategoryInfoEntity(String str, List list, String str2) {
        ArrayList arrayList = new ArrayList();
        this.c = arrayList;
        this.a = str;
        this.b = str2;
        if (list != null) {
            arrayList.addAll(list);
        }
    }

    @Override // defpackage.arod
    public final /* bridge */ /* synthetic */ Object l() {
        return this;
    }
}
