package com.google.android.gms.vision.client;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.vision.face.internal.client.FaceSettingsParcel;
import defpackage.anzs;
import defpackage.azht;
import defpackage.dibc;
import defpackage.dicf;
import defpackage.dich;
import defpackage.dici;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
@Deprecated
/* loaded from: classes7.dex */
public class DynamiteNativeFaceDetectorCreator extends dich {
    @Override // defpackage.dici
    public dicf newFaceDetector(azht azhtVar, FaceSettingsParcel faceSettingsParcel) {
        Context a = anzs.a((Context) ObjectWrapper.a(azhtVar), "com.google.android.gms.vision.dynamite");
        if (a == null) {
            dibc.a("%s could not be loaded.", "com.google.android.gms.vision.dynamite");
            throw new RemoteException();
        }
        dici asInterface = dich.asInterface(anzs.b(a.getClassLoader(), "com.google.android.gms.vision.face.ChimeraNativeFaceDetectorCreator"));
        if (asInterface != null) {
            return asInterface.newFaceDetector(azhtVar, faceSettingsParcel);
        }
        dibc.a("Could not load Chimera native face detector creator.", new Object[0]);
        throw new RemoteException();
    }
}
