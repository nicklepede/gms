package com.google.android.gms.motionsicknessassist.settings.widgets;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.SeekBar;
import androidx.preference.SeekBarPreference;
import com.google.android.gms.R;
import defpackage.kmp;
import j$.util.Objects;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes5.dex */
public class MinMaxSeekBarPreference extends SeekBarPreference implements SeekBar.OnSeekBarChangeListener {
    public int g;
    public int h;
    private SeekBar i;

    public MinMaxSeekBarPreference(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // androidx.preference.SeekBarPreference, androidx.preference.Preference
    public final void a(kmp kmpVar) {
        super.a(kmpVar);
        SeekBar seekBar = (SeekBar) Objects.requireNonNull((SeekBar) kmpVar.D(R.id.seekbar));
        this.i = seekBar;
        seekBar.setOnSeekBarChangeListener(this);
    }

    @Override // androidx.preference.SeekBarPreference
    public final void l(int i) {
        this.h = i;
        super.l(i - this.g);
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onProgressChanged(SeekBar seekBar, int i, boolean z) {
        this.h = this.g + i;
        if (z) {
            W(Integer.valueOf(i));
        }
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onStartTrackingTouch(SeekBar seekBar) {
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onStopTrackingTouch(SeekBar seekBar) {
    }
}
