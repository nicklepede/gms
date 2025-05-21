package com.google.android.gms.fido.fido2.api.view;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.fido.common.Transport;
import defpackage.arxc;
import defpackage.bbji;
import defpackage.bbwe;
import defpackage.bbwf;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes4.dex */
public class ViewOptions extends AbstractSafeParcelable implements bbji {
    public static final Parcelable.Creator CREATOR = new bbwf();
    private final int a;
    public final Set d;

    public ViewOptions() {
        this(1);
    }

    public JSONObject a() {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("viewName", b().p);
            Set set = this.d;
            if (!set.isEmpty()) {
                JSONArray jSONArray = new JSONArray();
                Iterator it = set.iterator();
                while (it.hasNext()) {
                    jSONArray.put(((Transport) it.next()).h);
                }
                jSONObject.put("alternateAvailableTransports", jSONArray);
            }
            return jSONObject;
        } catch (JSONException e) {
            throw new RuntimeException(e);
        }
    }

    public bbwe b() {
        throw new UnsupportedOperationException("This method must be overwritten by subclasses");
    }

    public int hG() {
        return this.a;
    }

    public final String toString() {
        return a().toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        int a = arxc.a(parcel);
        arxc.o(parcel, 1, hG());
        arxc.c(parcel, a);
    }

    public ViewOptions(int i) {
        this.d = new HashSet();
        this.a = i;
    }
}
