package com.google.android.gms.smartdevice.utils;

import android.util.Log;
import com.google.android.gms.common.server.response.FastSafeParcelableJsonResponse;
import defpackage.asic;
import defpackage.asie;
import defpackage.demt;
import java.io.ByteArrayInputStream;
import java.io.UnsupportedEncodingException;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes7.dex */
public abstract class BinarySerializableFastSafeParcelableJson extends FastSafeParcelableJsonResponse {
    public final void ax(byte[] bArr) {
        try {
            new asie().h(new ByteArrayInputStream(bArr), this);
        } catch (asic e) {
            throw new demt(e);
        }
    }

    public final byte[] ay() {
        try {
            return toString().getBytes("UTF-8");
        } catch (UnsupportedEncodingException e) {
            Log.e("SmartDevice", "Error serializing object.", e);
            return new byte[0];
        }
    }
}
