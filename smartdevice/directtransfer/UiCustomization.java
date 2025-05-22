package com.google.android.gms.smartdevice.directtransfer;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.server.response.FastJsonResponse$Field;
import com.google.android.gms.smartdevice.utils.BinarySerializableFastSafeParcelableJson;
import defpackage.a;
import defpackage.atzr;
import defpackage.dgdi;
import j$.util.Objects;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes7.dex */
public class UiCustomization extends BinarySerializableFastSafeParcelableJson implements ReflectedParcelable {
    public static final Parcelable.Creator CREATOR = new dgdi();
    private static final HashMap e;
    final Set a;
    public int b;
    public int c;
    public int d;

    static {
        HashMap hashMap = new HashMap();
        e = hashMap;
        hashMap.put("alignment", new FastJsonResponse$Field(0, false, 0, false, "alignment", 2, null));
        hashMap.put("iconSize", new FastJsonResponse$Field(0, false, 0, false, "iconSize", 3, null));
        hashMap.put("titleSize", new FastJsonResponse$Field(0, false, 0, false, "titleSize", 4, null));
    }

    public UiCustomization(Set set, int i, int i2, int i3) {
        this.a = set;
        this.b = i;
        this.c = i2;
        this.d = i3;
    }

    @Override // defpackage.aulm
    protected final Object a(FastJsonResponse$Field fastJsonResponse$Field) {
        int i = fastJsonResponse$Field.g;
        if (i == 2) {
            return Integer.valueOf(this.b);
        }
        if (i == 3) {
            return Integer.valueOf(this.c);
        }
        if (i == 4) {
            return Integer.valueOf(this.d);
        }
        throw new IllegalStateException(a.j(i, "Unknown SafeParcelable id="));
    }

    @Override // defpackage.aulm
    public final /* synthetic */ Map b() {
        return e;
    }

    @Override // defpackage.aulm
    protected final boolean e(FastJsonResponse$Field fastJsonResponse$Field) {
        return this.a.contains(Integer.valueOf(fastJsonResponse$Field.g));
    }

    @Override // com.google.android.gms.common.server.response.FastSafeParcelableJsonResponse
    public final boolean equals(Object obj) {
        if (!(obj instanceof UiCustomization)) {
            return false;
        }
        UiCustomization uiCustomization = (UiCustomization) obj;
        return Objects.equals(Integer.valueOf(this.b), Integer.valueOf(uiCustomization.b)) && Objects.equals(Integer.valueOf(this.c), Integer.valueOf(uiCustomization.c)) && Objects.equals(Integer.valueOf(this.d), Integer.valueOf(uiCustomization.d));
    }

    @Override // defpackage.aulm
    protected final void gM(FastJsonResponse$Field fastJsonResponse$Field, String str, int i) {
        int i2 = fastJsonResponse$Field.g;
        if (i2 == 2) {
            this.b = i;
        } else if (i2 == 3) {
            this.c = i;
        } else {
            if (i2 != 4) {
                throw new IllegalStateException(String.format("Field with id=%d  is not known to be an integer.", Integer.valueOf(i2)));
            }
            this.d = i;
        }
        this.a.add(Integer.valueOf(i2));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Set set = this.a;
        int a = atzr.a(parcel);
        if (set.contains(2)) {
            atzr.o(parcel, 2, this.b);
        }
        if (set.contains(3)) {
            atzr.o(parcel, 3, this.c);
        }
        if (set.contains(4)) {
            atzr.o(parcel, 4, this.d);
        }
        atzr.c(parcel, a);
    }

    public UiCustomization() {
        this.a = new HashSet();
    }
}
