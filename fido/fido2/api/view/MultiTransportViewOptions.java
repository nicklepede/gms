package com.google.android.gms.fido.fido2.api.view;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.fido.common.Transport;
import defpackage.atzr;
import defpackage.bdzo;
import defpackage.bdzw;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes4.dex */
public class MultiTransportViewOptions extends ViewOptions {
    public static final Parcelable.Creator CREATOR = new bdzo();
    public final int a;
    private final List b;

    public MultiTransportViewOptions(int i, List list) {
        this.a = i;
        this.b = list;
    }

    @Override // com.google.android.gms.fido.fido2.api.view.ViewOptions, defpackage.bdnf
    public final JSONObject a() {
        JSONObject a = super.a();
        try {
            JSONArray jSONArray = new JSONArray();
            Iterator it = this.b.iterator();
            while (it.hasNext()) {
                jSONArray.put(((Transport) it.next()).h);
            }
            a.put("transports", jSONArray);
            return a;
        } catch (JSONException e) {
            throw new RuntimeException(e);
        }
    }

    @Override // com.google.android.gms.fido.fido2.api.view.ViewOptions
    public final bdzw b() {
        return bdzw.MULTI_TRANSPORT;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof MultiTransportViewOptions)) {
            return false;
        }
        List list = this.b;
        List list2 = ((MultiTransportViewOptions) obj).b;
        return list.containsAll(list2) && list2.containsAll(list);
    }

    @Override // com.google.android.gms.fido.fido2.api.view.ViewOptions
    public final int hW() {
        return this.a;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.b});
    }

    @Override // com.google.android.gms.fido.fido2.api.view.ViewOptions, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int i2 = this.a;
        int a = atzr.a(parcel);
        atzr.o(parcel, 1, i2);
        atzr.G(parcel, 2, new ArrayList(this.b));
        atzr.c(parcel, a);
    }
}
