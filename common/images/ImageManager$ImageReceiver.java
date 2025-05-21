package com.google.android.gms.common.images;

import android.content.Context;
import android.content.Intent;
import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import android.os.Bundle;
import android.os.Looper;
import android.os.ParcelFileDescriptor;
import android.os.ResultReceiver;
import defpackage.arsu;
import defpackage.arsv;
import defpackage.artd;
import defpackage.byhr;
import java.util.ArrayList;
import java.util.concurrent.ExecutorService;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes3.dex */
final class ImageManager$ImageReceiver extends ResultReceiver {
    private final ArrayList imageRequestList;
    final /* synthetic */ arsu this$0;
    private final Uri uri;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ImageManager$ImageReceiver(arsu arsuVar, Uri uri) {
        super(new byhr(Looper.getMainLooper()));
        this.this$0 = arsuVar;
        this.uri = uri;
        this.imageRequestList = new ArrayList();
    }

    private static void sendBroadcastWithShareIdentity(Context context, Intent intent) {
        context.sendBroadcast(intent);
    }

    public void addImageRequest(arsv arsvVar) {
        artd.a("ImageReceiver.addImageRequest() must be called in the main thread");
        this.imageRequestList.add(arsvVar);
    }

    @Override // android.os.ResultReceiver
    public void onReceiveResult(int i, Bundle bundle) {
        ParcelFileDescriptor parcelFileDescriptor = (ParcelFileDescriptor) bundle.getParcelable("com.google.android.gms.extra.fileDescriptor");
        if (parcelFileDescriptor != null) {
            new AssetFileDescriptor(parcelFileDescriptor, bundle.getLong("assetFdStartOffset", 0L), bundle.getLong("assetFdLength", -1L));
        }
        arsu arsuVar = this.this$0;
        int i2 = arsu.c;
        ExecutorService executorService = arsuVar.b;
        throw null;
    }

    public void removeImageRequest(arsv arsvVar) {
        artd.a("ImageReceiver.removeImageRequest() must be called in the main thread");
        this.imageRequestList.remove(arsvVar);
    }

    public void sendBroadcast() {
        Intent intent = new Intent("com.google.android.gms.common.images.LOAD_IMAGE");
        intent.setPackage("com.google.android.gms");
        intent.putExtra("com.google.android.gms.extras.uri", this.uri);
        intent.putExtra("com.google.android.gms.extras.resultReceiver", this);
        intent.putExtra("com.google.android.gms.extras.priority", 3);
        int i = arsu.c;
        Context context = this.this$0.a;
        sendBroadcastWithShareIdentity(null, intent);
    }
}
