package com.google.android.gms.backup.g1.restore.photos;

import android.content.Intent;
import android.os.Looper;
import android.widget.Toast;
import com.google.android.chimera.IntentOperation;
import com.google.android.gms.R;
import com.google.android.gms.backup.g1.restore.photos.PhotosRestoreResultIntentOperation;
import com.google.android.libraries.photos.restore.api.StatusResult;
import defpackage.alhn;
import defpackage.caqj;
import defpackage.dyiz;
import defpackage.elgo;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes3.dex */
public final class PhotosRestoreResultIntentOperation extends IntentOperation {
    private static final elgo a = elgo.p(dyiz.RESTORE_COMPLETE_FAILED, dyiz.RESTORE_COMPLETE_CANCELLED, dyiz.RESTORE_ERROR_DENIED_PERMISSION, dyiz.RESTORE_ERROR_RETRY, dyiz.RESTORE_ERROR_UNKNOWN);
    private static final elgo b = elgo.l(dyiz.RESTORE_COMPLETE_SUCCESS);

    @Override // com.google.android.chimera.IntentOperation
    public final void onHandleIntent(Intent intent) {
        StatusResult statusResult;
        dyiz dyizVar = null;
        if (intent != null && (statusResult = (StatusResult) intent.getParcelableExtra("com.google.android.libraries.photos.restore.EXTRA_STATUS_RESULT")) != null) {
            dyizVar = statusResult.a;
        }
        if (a.contains(dyizVar)) {
            new caqj(Looper.getMainLooper()).post(new Runnable() { // from class: alek
                @Override // java.lang.Runnable
                public final void run() {
                    PhotosRestoreResultIntentOperation photosRestoreResultIntentOperation = PhotosRestoreResultIntentOperation.this;
                    Toast.makeText(photosRestoreResultIntentOperation, photosRestoreResultIntentOperation.getString(R.string.g1_restore_failed), 1).show();
                }
            });
        } else if (b.contains(dyizVar)) {
            alhn.a.e(this, true);
        }
    }
}
