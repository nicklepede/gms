package com.google.android.gms.smartdevice.d2d;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.server.response.FastJsonResponse$Field;
import com.google.android.gms.smartdevice.utils.BinarySerializableFastSafeParcelableJson;
import defpackage.a;
import defpackage.atzr;
import defpackage.dfmx;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes7.dex */
public class SupervisedAccountInfo extends BinarySerializableFastSafeParcelableJson {
    public static final Parcelable.Creator CREATOR = new dfmx();
    private static final HashMap d;
    final Set a;
    public String b;
    public String c;

    static {
        HashMap hashMap = new HashMap();
        d = hashMap;
        hashMap.put("parentAccountName", new FastJsonResponse$Field(7, false, 7, false, "parentAccountName", 1, null));
        hashMap.put("accountSelectionToken", new FastJsonResponse$Field(7, false, 7, false, "accountSelectionToken", 2, null));
    }

    public SupervisedAccountInfo(Set set, String str, String str2) {
        this.a = set;
        this.b = str;
        this.c = str2;
    }

    @Override // defpackage.aulm
    protected final Object a(FastJsonResponse$Field fastJsonResponse$Field) {
        int i = fastJsonResponse$Field.g;
        if (i == 1) {
            return this.b;
        }
        if (i == 2) {
            return this.c;
        }
        throw new IllegalStateException(a.j(i, "Unknown SafeParcelable id="));
    }

    @Override // defpackage.aulm
    public final /* synthetic */ Map b() {
        return d;
    }

    @Override // defpackage.aulm
    protected final boolean e(FastJsonResponse$Field fastJsonResponse$Field) {
        return this.a.contains(Integer.valueOf(fastJsonResponse$Field.g));
    }

    @Override // defpackage.aulm
    protected final void f(FastJsonResponse$Field fastJsonResponse$Field, String str, String str2) {
        if (str2 == null) {
            return;
        }
        int i = fastJsonResponse$Field.g;
        if (i == 1) {
            this.b = str2;
        } else {
            if (i != 2) {
                throw new IllegalArgumentException(String.format("Field with id=%d is not known to be a string.", Integer.valueOf(i)));
            }
            this.c = str2;
        }
        this.a.add(Integer.valueOf(i));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Set set = this.a;
        int a = atzr.a(parcel);
        if (set.contains(1)) {
            atzr.v(parcel, 1, this.b, true);
        }
        if (set.contains(2)) {
            atzr.v(parcel, 2, this.c, true);
        }
        atzr.c(parcel, a);
    }

    public SupervisedAccountInfo() {
        this.a = new HashSet();
    }

    public SupervisedAccountInfo(String str, String str2) {
        HashSet hashSet = new HashSet();
        this.a = hashSet;
        this.b = str;
        this.c = str2;
        hashSet.add(1);
        hashSet.add(2);
    }
}
