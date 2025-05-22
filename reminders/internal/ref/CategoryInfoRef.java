package com.google.android.gms.reminders.internal.ref;

import android.os.Parcel;
import android.text.TextUtils;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.reminders.model.CategoryInfo;
import com.google.android.gms.reminders.model.CategoryInfoEntity;
import defpackage.cznx;
import defpackage.cznz;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes6.dex */
public class CategoryInfoRef extends cznx implements CategoryInfo {
    public CategoryInfoRef(DataHolder dataHolder, int i, String str) {
        super(dataHolder, i, str);
    }

    public static boolean e(DataHolder dataHolder, int i, int i2, String str) {
        return dataHolder.f(G(str, "category_id"), i, i2) && dataHolder.f(G(str, "place_types"), i, i2) && dataHolder.f(G(str, "display_name"), i, i2);
    }

    @Override // com.google.android.gms.reminders.model.CategoryInfo
    public final String a() {
        return r(p("category_id"));
    }

    @Override // com.google.android.gms.reminders.model.CategoryInfo
    public final String c() {
        return r(p("display_name"));
    }

    @Override // com.google.android.gms.reminders.model.CategoryInfo
    public final List d() {
        ArrayList arrayList = new ArrayList();
        String r = r(p("place_types"));
        if (!TextUtils.isEmpty(r)) {
            TextUtils.SimpleStringSplitter simpleStringSplitter = new TextUtils.SimpleStringSplitter(',');
            simpleStringSplitter.setString(r);
            Iterator<String> it = simpleStringSplitter.iterator();
            while (it.hasNext()) {
                arrayList.add(it.next());
            }
        }
        return arrayList;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // defpackage.atql
    public final boolean equals(Object obj) {
        if (!(obj instanceof CategoryInfo)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        return CategoryInfoEntity.e(this, (CategoryInfo) obj);
    }

    @Override // defpackage.atql
    public final int hashCode() {
        return CategoryInfoEntity.b(this);
    }

    @Override // defpackage.atql, defpackage.atqs
    public final /* synthetic */ Object l() {
        return new CategoryInfoEntity(this);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        cznz.a(new CategoryInfoEntity(this), parcel);
    }
}
